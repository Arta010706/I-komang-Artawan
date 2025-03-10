// File: Main.java
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing: Meow!");
    }
    
    void memanjat() {
        System.out.println("Kucing sedang memanjat.");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
    
    void berlari() {
        System.out.println("Anjing sedang berlari.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing();
        System.out.println("=== Objek Kucing ===");
        kucing1.makan();   // Dari superclass Hewan
        kucing1.suara();   // Dari subclass Kucing
        kucing1.memanjat(); // Dari subclass Kucing

        System.out.println();

        // Membuat objek Anjing
        Anjing anjing1 = new Anjing();
        System.out.println("=== Objek Anjing ===");
        anjing1.makan();   // Dari superclass Hewan
        anjing1.suara();   // Dari subclass Anjing
        anjing1.berlari(); // Dari subclass Anjing
    }
}
