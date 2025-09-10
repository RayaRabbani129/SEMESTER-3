public class Pinjol {
    private String id;
    private String nama;
    private double jumlahPinjaman;
    private double bunga;

    public Pinjol(String id, String nama, double jumlahPinjaman, double bunga){
        this.id = id;
        this.nama = nama;
        this.jumlahPinjaman = jumlahPinjaman;
        this.bunga = bunga;
    }

    private double hitungBunga(double bunga){
        return jumlahPinjaman * bunga;
    }

    private double hitungDenda(int terlambatHari){
        return terlambatHari * 5000;
    }

    public void cekPeminjaman(){
        System.out.println("Nama nasabah: " + nama);
        System.out.println("Jumlah peminjaman: Rp." + jumlahPinjaman);
    }

    public void ajukanPeminjaman(double jumlah){
        jumlahPinjaman += jumlah;
        System.out.println("Peminjaman sebesar Rp." + jumlah + "jumlah DISETUJUI");
        System.out.println("Jumlah peminjaman anda sekarang sebesar Rp.");
    }

    public void bayarPeminjaman(double jumlah){
        if(jumlah > jumlahPinjaman){
            System.out.println("Jumlah melebihi peminjaman");
        }else{
            jumlahPinjaman -= jumlah;
            System.out.println("Anda membayar peminjaman sebesar" + jumlah);
            System.out.println("Sisa peminjaman yang belum dibayar sebesar: Rp." + jumlahPinjaman);
        }
    }

    public void terlambatBayarPinjaman(int hari) {
        double dendaHutang = hitungDenda(hari);
        System.out.println("Keterlambatan selama " + hari + " hari. Dngean denda sebesar: Rp." + dendaHutang);
        jumlahPinjaman += dendaHutang;
        System.out.println("Total pinjaman setelah denda sebesar: Rp." + jumlahPinjaman);
    }
}
