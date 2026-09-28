import java.util.Scanner;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nomor = 1;
        int nilai;

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

            if (nilai >= 60) {
                grade = 'A';
            } else if (nilai >= 90) {
                grade = 'B';
            } else if (nilai >= 80) {
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

            nomor++;

        } while (true);

        System.out.println();
        System.out.println("Program selesai.");




        input.close();
    }
}