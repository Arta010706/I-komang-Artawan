// File: Main.java

// Kelas Hewan (Superclass)
class Hewan {
    String nama;

    // Konstruktor untuk inisialisasi nama
    Hewan(String nama) {
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi hewan
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Kelas Kucing (Subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    // Konstruktor Kucing memanggil konstruktor superclass
    Kucing(String nama) {
        super(nama);
    }

    // Metode tambahan khusus untuk kucing
    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

public class Main5 {
    public static void main(String[] args) {
        // Membuat objek Kucing dengan nama "Tom"
        Kucing kucing1 = new Kucing("Tom");

        System.out.println("=== Objek Kucing ===");
        kucing1.info();  // Memanggil metode dari superclass Hewan
        kucing1.suara(); // Memanggil metode dari subclass Kucing
    }
}
