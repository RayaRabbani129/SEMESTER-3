public class Pembayaran {
    private double jumlah;
    private String metodeBayar;

    public Pembayaran(double jumlah, String metodeBayar){
        this.jumlah = jumlah;
        this.metodeBayar = metodeBayar;
    }

    public void tampilkan(){
        System.out.println("Pembayaran sebesar Rp." + jumlah + " via" + metodeBayar + "berhasil");
    }
}
