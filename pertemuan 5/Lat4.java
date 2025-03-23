class Mesin {

private void cekBahanBakar() {

System.out.println("Cek bahan bakar sebelum menyalakan mesin...");

}

public void nyalakanMesin() {

cekBahanBakar(); // ✅ Bisa dipanggil di dalam kelas

System.out.println("Mesin menyala!");

}

}

public class Lat4 {

public static void main(String[] args) {

Mesin mobil = new Mesin();

mobil.nyalakanMesin();

// mobil.cekBahanBakar(); // ❌ Error: cekBahanBakar() bersifat private

}

}