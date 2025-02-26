// Definisi Kelas
class Mahasiswa {
    String nama;
    int nim;

    // Konstruktor
    Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode untuk menampilkan informasi mahasiswa
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", NIM: " + nim);
    }
}

// Program Utama
public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi", 220001);
        Mahasiswa mhs2 = new Mahasiswa("Siti", 220002);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
    }
}
