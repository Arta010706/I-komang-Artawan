class BankAccount {

    private String pemilikAkun;
    private double saldo;

    // Konstruktor dengan validasi saldo awal
    public BankAccount(String pemilikAkun, double saldoAwal) {
        this.pemilikAkun = pemilikAkun;
        if (saldoAwal >= 0) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("Saldo awal tidak bisa negatif! Saldo diatur ke 0.");
            this.saldo = 0;
        }
    }

    // Getter untuk saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter untuk nama pemilik akun
    public String getPemilikAkun() {
        return pemilikAkun;
    }

    // Metode untuk menambah saldo
    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Deposit berhasil! Saldo sekarang: $" + saldo);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0!");
        }
    }

    // Metode untuk menarik saldo dengan validasi
    public void tarikSaldo(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil! Saldo tersisa: $" + saldo);
        } else {
            System.out.println("Penarikan gagal! Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfo() {
        System.out.println("============================");
        System.out.println("Pemilik Akun: " + pemilikAkun);
        System.out.println("Saldo Saat Ini: $" + saldo);
        System.out.println("============================");
    }
}

public class Lat5 {
    public static void main(String[] args) {
        BankAccount akun1 = new BankAccount("Adi", 1000);

        // Menampilkan saldo awal
        akun1.tampilkanInfo();

        // Melakukan transaksi
        akun1.deposit(500); // Menambah saldo
        akun1.tarikSaldo(300); // Menarik saldo

        // Menampilkan saldo akhir
        akun1.tampilkanInfo();
    }
}
