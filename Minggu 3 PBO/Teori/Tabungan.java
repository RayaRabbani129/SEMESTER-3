public class Tabungan {
    private String norek;
    private String namaPemilik;
    private double saldo;

    public Tabungan(String norek, String namaPemilik, double saldo){
        this.norek = norek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public double hitungBunga(double bunga){
        return saldo * bunga;
    }

    public void cekSaldo(){
        System.out.println("Saldo anda sebesar Rp." + saldo);
    }

    public void simpanUang(double jumlah){
        saldo += jumlah;
        System.out.println("Saldo bertambah Rp." + jumlah);
        System.out.println("Saldo akhir Rp." + saldo);
    }

    public void ambilUang(double jumlah){
        saldo -= jumlah;
        System.out.println("Saldo berkurang Rp." + jumlah);
        System.out.println("Saldo akhir Rp." + jumlah);
    }

    public void penyesuaianSaldo(){
        System.out.println("Saldo awal Rp." + saldo);
        System.out.println("Saldo bertambah Rp." + hitungBunga(0.5));
        saldo += hitungBunga(0.5);
        System.out.println("Saldo akhir Rp." + saldo    );
    }

    private double biayaTransfer(double jumlah) {
    return jumlah * 0.005;
    }

    public void kirimUang(double jumlah) {
        System.out.println("Saldo awal Rp." + saldo);
        System.out.println("Nominal transfer sebesar Rp." + jumlah);
        System.out.println("Biaya transfer Rp." + biayaTransfer(jumlah));
        saldo = saldo - jumlah - biayaTransfer(jumlah);
        System.out.println("Saldo akhir Rp." + saldo);
    }
}