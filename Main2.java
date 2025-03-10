// File: Main.java
class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing Anggora.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan();  // Dari superclass Hewan
        anggora.suara();  // Dari subclass Kucing
        anggora.jenis();  // Dari subclass KucingAnggora
    }
}
