public class Kursus {
    private String nama;
    private String deskripsiKursus;

    public Kursus(String nama, String deskripsiKursus){
        this.nama = nama;
        this.deskripsiKursus = deskripsiKursus;
    }

    public String getNama(){
        return nama;
    }

    public String getDeskripsiKursus(){
        return deskripsiKursus;
    }
}
