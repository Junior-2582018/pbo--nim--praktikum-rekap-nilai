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

            System.out.println("  Nilai yang dimasukkan: " + nilai);

            nomor++;

        } while (true);

        System.out.println();
        System.out.println("Program selesai.");

        input.close();
    }
}