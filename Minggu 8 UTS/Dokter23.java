public class Dokter23 extends Orang23 {
    private int id23;
    private String spesialisasi23;

    // setter mothod
    public void setSpesialisasi23(String spesialisasi) {
        this.spesialisasi23 = spesialisasi;
    }

    //Getter
    public int getId23() { 
        return id23; 
    }

    public String getSpesialisasi23() { 
        return spesialisasi23; 
    }
    
    // overloading
    public Dokter23(int id23, String nama23, boolean jenisKelamin23, String alamat23, String noTelp23, String spesialisasi23) {
        super(nama23, jenisKelamin23, alamat23, noTelp23);
        this.id23 = id23;
        this.spesialisasi23 = spesialisasi23;
    }

    // overriding
    @Override
    public void tampilkanInfo23() {
        System.out.println("=== Data Dokter ===");
        super.tampilkanInfo23();
        System.out.println("ID Dokter\t: " + id23);
        System.out.println("Spesialisasi\t: " + spesialisasi23);
        System.out.println("===================\n");
    }

}
