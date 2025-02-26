class hewana {
     //Atribut
    String nama;
    String jenis;
    int umur;
    
    
    //konstruktor
    hewana(String nama, String jenis, int umur){
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }
    
    
    // metode untuk menampilkan Informasi hewan
    void tampilkanInfo(){
       System.out.println(nama + " telah bertambah umur menjadi " + umur +
       " tahun.");
    }

    // Metode untuk menambah umur hewan
    void bertambahUmur(int tahun){
        this.umur += tahun;
        System.out.println(nama + "telah bertambah umur menjadi " + umur + 
        " Tahun.");
    }
    
    //metode untuk menampilkan suara hewan
    void suaraHewan(){
 if (nama.equalsIgnoreCase("Kucing")) {
 System.out.println(nama + ": Meong!");
 } else if (nama.equalsIgnoreCase("Anjing")) {
 System.out.println(nama + ": Guk guk!");
 } else {
 System.out.println(nama + ": Suara tidak diketahui.");
 }
    }
}    
        
    public class Hewan {
        
        /**
         * @param args the command line arguments
         */
    
    public static void main (String[] args){
        //membuat objek hewan 
      hewana hewan1 = new hewana("kucing", "Mamalia", 3 );
      hewana hewan2 = new hewana("Anjing", "Mamalia", 2 );
        
    //Menampilkan informasi awal
    hewan1.tampilkanInfo();
    hewan2.suaraHewan();
    System.out.println(); // Pemisah output

    hewan2.tampilkanInfo();
    hewan2.suaraHewan();
    hewan2.bertambahUmur(2); // Menambah umur anjing
    hewan2.tampilkanInfo(); // Menampilkan info setelah umur bertambah
            
    }
    }