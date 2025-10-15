import java.util.ArrayList;
import java.util.List;

public class RekamMedik23 {
    private int id23;
    private Pasien23 pasien23;
    private List<Pemeriksaan23> daftarPemeriksaan23;

    public RekamMedik23(int id23, Pasien23 pasien23) {
        this.id23 = id23;
        this.pasien23 = pasien23;
        this.daftarPemeriksaan23 = new ArrayList<>();
    }

    public void tambahPemeriksaan23(Pemeriksaan23 pemeriksaan23) {
        daftarPemeriksaan23.add(pemeriksaan23);
    }

    public void tampilkanRekamMedik23() {
        System.out.println("=== Rekam Medik Pasien ===");
        System.out.println("Id Rekam Medis\t: " + id23);
        pasien23.tampilkanInfo23();
        for (Pemeriksaan23 p : daftarPemeriksaan23) {
            p.tampilkanPemeriksaan23();
        }
    }
}