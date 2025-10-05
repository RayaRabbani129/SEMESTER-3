public class Kucing02 extends Hewan02{
    String ras;

    public Kucing02(String nama, int umur, String ras){
        super(nama, umur);
        this.ras = ras;
        System.out.println("Konstruktor Kucing Dipanggil.");
    }

    void tampilkanInfo(){
        System.out.println("Nama  :    " + nama);
        System.out.println("Umur  :    " + umur);
        System.out.println("Ras   :     "+ ras);
    }
}
