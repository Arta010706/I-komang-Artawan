// File: Main.java

// Interface Hewan
interface Hewan {
    void makan();
}

// Interface Mamalia
interface Mamalia {
    void menyusui();
}

// Kelas Kucing mengimplementasikan Hewan dan Mamalia
class Kucing implements Hewan, Mamalia {
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }

    // Metode tambahan
    void suara() {
        System.out.println("Kucing: Meow!");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();
        
        System.out.println("=== Objek Kucing ===");
        kucing1.makan();      // Dari interface Hewan
        kucing1.menyusui();   // Dari interface Mamalia
        kucing1.suara();      // Metode tambahan di kelas Kucing
    }
}
