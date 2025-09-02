public class Tabungan {
    private String norek;
    private String namaPemilik;
    private double saldo;

    public Tabungan(String norek, String namaPemilik, double saldo){
        this.norek = norek;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void cekSaldo(){
        System.out.println("No Rekening    : " + norek);
        System.out.println("Nama Pemilik   : " + namaPemilik);
        System.out.println("Saldo tabungan anda sebesar RP." + saldo);
    }

    public void simpanUang(double jumlah){
        saldo += jumlah;
        System.out.println("Anda menyimpan uang sejumlah Rp." + jumlah);
    }

    public void ambilUang(double jumlah){
        if(saldo >= jumlah){
            saldo -= jumlah;
            System.out.println("Anda mengambil uang sejumlah Rp." + jumlah);
        }else{
            System.out.println("Saldo tidak mencukupi");
        }
    }
}
