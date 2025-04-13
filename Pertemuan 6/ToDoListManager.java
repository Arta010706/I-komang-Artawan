import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarTugas = new ArrayList<>();

        int pilihan;

        while (true) {
            System.out.println("\n=== Menu To-Do List ===");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Lihat Semua Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan tugas baru: ");
                    String tugas = scanner.nextLine();
                    daftarTugas.add(tugas);
                    System.out.println("Tugas berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("\nDaftar Tugas:");
                    if (daftarTugas.isEmpty()) {
                        System.out.println("Belum ada tugas.");
                    } else {
                        for (int i = 0; i < daftarTugas.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarTugas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor tugas yang ingin dihapus: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= daftarTugas.size()) {
                        String removed = daftarTugas.remove(index - 1);
                        System.out.println("Tugas \"" + removed + "\" berhasil dihapus.");
                    } else {
                        System.out.println("Nomor tugas tidak valid.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan To-Do List.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
