import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nomor = 1;
        int nilai;

        double total = 0;
        int jumlahNilai = 0;

        System.out.println("===== REKAP NILAI KELAS =====");
        System.out.println("Ketik -1 kalau sudah selesai.");

        // do-while digunakan karena nilai pertama harus diminta terlebih dahulu.
        do {
            System.out.print("Nilai ke-" + nomor + " : ");
            nilai = input.nextInt();

            if (nilai == SELESAI) {
                break;
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0..100");
                continue;
            }

            char grade;

            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            // Jika >= 60 diletakkan pertama, nilai 85 langsung menjadi D sehingga kondisi >= 80 tidak diperiksa.

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";
            };

            System.out.println("  Grade " + grade + " — " + keterangan);

            total += nilai;
            jumlahNilai++;
            nomor++;

        } while (true);

        if (jumlahNilai == 0) {
            System.out.println();
            System.out.println("Nilai sah   : 0");
            System.out.println("Rata-rata   : 0,00");
            System.out.println("Status      : TIDAK LULUS");
        } else {
            double rata = total / jumlahNilai;

            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS";

            System.out.println();
            System.out.println("Nilai sah   : " + jumlahNilai);
            System.out.println("Rata-rata   : " +
                    String.format("%.2f", rata).replace('.', ','));
            System.out.println("Status      : " + status);
        }

        input.close();
    }
}

