import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String validUsername = "admin";
        String validPassword = "password123";
        int attempts = 0;
        int maxAttempts = 3;

        while (attempts < maxAttempts) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();

            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Selamat datang, " + username + "!");
                break;
            } else {
                attempts++;
                System.out.println("Username atau password salah. Percobaan ke-" + attempts);
            }

            if (attempts == maxAttempts) {
                System.out.println("Akun diblokir!");
            }
        }

        scanner.close();
    }
}
