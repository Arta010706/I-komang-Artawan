// Interface KendaraanListrik
interface KendaraanListrik {
    void isiDaya(); // Method abstrak yang harus diimplementasikan
}

// Superclass Mobil
class Mobil {
    protected String nama;

    public Mobil(String nama) {
        this.nama = nama;
    }

    public void bergerak() { // Ubah menjadi public agar bisa diwarisi dengan benar
        System.out.println(nama + " sedang bergerak.");
    }

    public void info() {
        System.out.println("Ini adalah mobil: " + nama);
    }
}

// Subclass MobilListrik yang merupakan Mobil dan juga KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    public MobilListrik(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() { // Tambahkan public untuk override yang sesuai
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Main class untuk menjalankan program
public class InterfaceClassDemo {
    public static void main(String[] args) {
        MobilListrik tesla = new MobilListrik("Tesla Model 3");

        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}
