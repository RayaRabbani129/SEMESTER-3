public class Video extends Konten{
    private int durasi;

    public Video(String judul, String deskripsi, int durasi){
        super(judul, deskripsi);
        this.durasi = durasi;
    }

    public void tampilkan(){
        System.out.println("Video: " + getJudul() + "(" + durasi + " menit)");
    }
}
