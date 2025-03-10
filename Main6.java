// File: Main.java

// Kelas Kalkulator dengan metode overloading
class Kalkulator {
    // Metode pertama: Menjumlahkan dua angka (integer)
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (integer)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (double)
    double tambah(double a, double b) {
        return a + b;
    }
}

// Kelas utama untuk menjalankan program
public class Main6{
    public static void main(String[] args) {
        // Membuat objek Kalkulator
        Kalkulator k = new Kalkulator();

        // Memanggil metode dengan overloading
   System.out.println("Hasil penjumlahan 5 + 10: " + k.tambah(5, 10));
   System.out.println("Hasil penjumlahan 5 + 10 + 15: " + k.tambah(5, 10, 15));
   System.out.println("Hasil penjumlahan 5.5 + 2.5: " + k.tambah(5.5, 2.5));
    }
}
