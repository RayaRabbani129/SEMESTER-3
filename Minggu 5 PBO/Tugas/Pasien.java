public class Pasien extends Orang {
    private String noRekamMedis; 

    public Pasien(String noRm, String id, String nama, int umur) {
        super(id, nama, umur);
        this.noRekamMedis = noRekamMedis;
    }

    public String getNoRekamMedis() { return noRekamMedis; }

    @Override
    public String info() {
        return "Pasien - RM: " + noRekamMedis + ", " + super.info();
    }
}
