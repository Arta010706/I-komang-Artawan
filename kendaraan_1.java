public class Kendaraan {
    private String merk;
    private String tipe;
    private int kecepatan;

    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
    System.out.println("Merek: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + 
            kecepatan + " km/jam");
    }

    public void tambahKecepatan(int km) {
        if (km > 0) {
            kecepatan += km;
            System.out.println("Kecepatan bertambah menjadi " + kecepatan + " km/jam");
        } else {
            System.out.println("Masukkan nilai kecepatan yang valid.");
        }
    }

    public void kurangiKecepatan(int km) {
        if (km > 0) {
            kecepatan = Math.max(0, kecepatan - km);
            System.out.println("Kecepatan berkurang menjadi " + kecepatan + " km/jam");
        } else {
            System.out.println("Masukkan nilai kecepatan yang valid.");
        }
    }

    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Mobil", 50);
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20);
        kendaraan1.kurangiKecepatan(30);
        kendaraan1.berhenti();
        kendaraan1.tampilkanInfo();
    }
}
