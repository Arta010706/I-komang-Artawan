import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaRahasia = random.nextInt(100) + 1; // angka 1-100
        int tebakan;
        int percobaan = 0;

        System.out.println("=== Permainan Tebak Angka ===");
        System.out.println("Tebak angka antara 1 sampai 100");
        System.out.println("Ketik 0 untuk keluar.");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();

            if (tebakan == 0) {
                System.out.println("Keluar dari permainan. Angka yang benar adalah: " + angkaRahasia);
                break;
            }

            percobaan++;

            if (tebakan == angkaRahasia) {
                System.out.println("Selamat! Anda menebak dengan benar.");
                System.out.println("Jumlah percobaan: " + percobaan);
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else {
                System.out.println("Terlalu besar! Coba lagi.");
            }
        }

        scanner.close();
    }
}
