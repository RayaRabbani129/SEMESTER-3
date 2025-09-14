public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNama(){ 
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjaman; 
    }

    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }

    public void pinjam(int uang) {
        if (uang <= 0) {
            System.out.println("Nominal pinjaman harus > 0");
            return;
        }
        if (jumlahPinjaman + uang <= limitPinjaman) {
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        }
    }

    public void angsur(int uang){
       int minimal = (int)(jumlahPinjaman * 0.1);
        if (uang < minimal){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return;
        }
        if (uang <= jumlahPinjaman) {
            jumlahPinjaman -= uang;
        }else{
            System.out.println("Angsuran melebihi sisa pinjaman. Pinjaman dilunasi.");
            jumlahPinjaman = 0;
        }
    }
}
