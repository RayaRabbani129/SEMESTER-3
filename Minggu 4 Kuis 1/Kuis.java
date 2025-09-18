public class Kuis extends Konten{
    private int jumlahSoal;

    public Kuis(String judul, String deskripsi, int jumlahSoal){
        super(judul, deskripsi);
        this.jumlahSoal = jumlahSoal;
    }

    public void tampilkan(){
        System.out.println("Kuis: " + getJudul() + "(" + jumlahSoal + " soal)");
    }
}
