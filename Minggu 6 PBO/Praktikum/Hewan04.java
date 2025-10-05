public class Hewan04 {
    private String nama;
    protected int umur;

    public Hewan04(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void berjalan(){
        System.out.println(nama + "Berjalan...");
    }

    public void info(){
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
    }
}
