public class Artikel extends Konten{
    private int jumlahHalaman;

    public Artikel(String judul, String deskripsi, int jumlahHalaman){
        super(judul, deskripsi);
        this.jumlahHalaman = jumlahHalaman;
    }

    public void tampilkan(){
        System.out.println("Artikel: " + getJudul() + "(" + jumlahHalaman + " halaman)");
    }
}
