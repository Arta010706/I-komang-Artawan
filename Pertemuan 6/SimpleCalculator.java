import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ulang;

        do {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil;
            boolean valid = true;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 == 0) {
                        System.out.println("Error: Pembagian dengan nol!");
                        valid = false;
                        hasil = 0;
                    } else {
                        hasil = angka1 / angka2;
                    }
                    break;
                case '%':
                    if (angka2 == 0) {
                        System.out.println("Error: Modulo dengan nol!");
                        valid = false;
                        hasil = 0;
                    } else {
                        hasil = angka1 % angka2;
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
                    valid = false;
                    hasil = 0;
            }

            if (valid) {
                System.out.println("Hasil: " + hasil);
            }

            System.out.print("Ingin menghitung lagi? (y/n): ");
            ulang = scanner.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terima kasih telah menggunakan kalkulator.");
        scanner.close();
    }
}
