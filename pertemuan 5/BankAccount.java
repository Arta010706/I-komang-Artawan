class BankAccount {
    private double saldo;
    private String pemilikAkun;

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

    // Getter untuk mendapatkan saldo
    public double getSaldo() {
        return saldo;
    }

    // Getter untuk mendapatkan nama pemilik akun
    public String getPemilikAkun() {
        return pemilikAkun;
    }

    // Metode deposit untuk menambah saldo
    public void deposit(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil deposit: " + jumlah);
        } else {
            System.out.println("Jumlah deposit harus lebih dari 0!");
        }
    }

    // Metode withdraw untuk mengurangi saldo
    public void withdraw(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Berhasil tarik tunai: " + jumlah);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk penarikan!");
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0!");
        }
    }

    // Metode transfer antar rekening
    public void transfer(BankAccount tujuan, double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Berhasil transfer " + jumlah + " ke " + tujuan.getPemilikAkun());
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk transfer!");
        } else {
            System.out.println("Jumlah transfer harus lebih dari 0!");
        }
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInfo() {
        System.out.println("Pemilik Akun: " + pemilikAkun);
        System.out.println("Saldo Saat Ini: " + saldo);
    }

    public static void main(String[] args) {
        BankAccount akun1 = new BankAccount("Alice", 5000);
        BankAccount akun2 = new BankAccount("Bob", 3000);
        
        akun1.tampilkanInfo();
        akun2.tampilkanInfo();
        
        akun1.deposit(2000);
        akun1.withdraw(1000);
        akun1.transfer(akun2, 1500);
        
        akun1.tampilkanInfo();
        akun2.tampilkanInfo();
    }
}
