public class Pasien23 extends Orang23 {
    private int id23;
    private RekamMedik23 rekamMedik23;

    // overloading
    public Pasien23(int id23, String nama23, boolean jenisKelamin23, String alamat23, String noTelp23) {
        super(nama23, jenisKelamin23, alamat23, noTelp23);
        this.id23 = id23;
    }

    // setter methods
    public void setRekamMedik23(RekamMedik23 rekamMedik23) {
        this.rekamMedik23 = rekamMedik23;
    }

    // getter methods
    public RekamMedik23 getRekamMedik23() {
        return rekamMedik23;
    }

    public int getId23() { 
        return id23; 
    }

    // overriding
    @Override
    public void tampilkanInfo23() {
        System.out.println("=== Data Pasien ===");
        // keyword super
        super.tampilkanInfo23();
        System.out.println("ID Pasien\t: " + id23);
        System.out.println("===================\n");
    }

}
