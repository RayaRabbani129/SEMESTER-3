import java.util.Date;

public class Pemeriksaan23 {
    private int id23;
    private Date tanggalPemeriksaan23;
    private String keluhan23;
    private String diagnosa23;
    private String tindakan23;
    private String obat23;
    private Dokter23 dokter23;

    public Pemeriksaan23(int id23, Date tanggalPemeriksaan23, String keluhan23, String diagnosa23, String tindakan23, String obat23, Dokter23 dokter23) {
        this.id23 = id23;
        this.tanggalPemeriksaan23 = tanggalPemeriksaan23;
        this.keluhan23 = keluhan23;
        this.diagnosa23 = diagnosa23;
        this.tindakan23 = tindakan23;
        this.obat23 = obat23;
        this.dokter23 = dokter23;
    }

    // getter method
    public void tampilkanPemeriksaan23() {
        System.out.println("ID Pemeriksaan\t: " + id23);
        System.out.println("Tanggal\t\t: " + tanggalPemeriksaan23);
        System.out.println("Keluhan\t\t: " + keluhan23);
        System.out.println("Diagnosa\t: " + diagnosa23);
        System.out.println("Tindakan\t: " + tindakan23);
        System.out.println("Obat\t\t: " + obat23);
        System.out.println("Dokter\t\t: " + dokter23.getNama23() + " (" + dokter23.getSpesialisasi23() + ")");
        System.out.println("--------------------------");
    }
}
