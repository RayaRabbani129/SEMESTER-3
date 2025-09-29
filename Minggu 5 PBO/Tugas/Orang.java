public class Orang {
    private String id;
    private String nama;
    private int umur;

    public Orang(String id, String nama, int umur2) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
    }

    public String getId(){ 
        return id; 
    }

    public String getNama(){ 
        return nama; 
    }

    public int getUmur(){ 
        return umur; 
    }

    public String info() {
        return "ID: " + id + ", Nama: " + nama + ", Umur: " + umur;
    }
}
