import java.util.ArrayList;
import java.util.List;

public class RumahSakit {
    private String nama;
    private ArrayList<Dokter> daftarDokter;
    private ArrayList<Pasien> daftarPasien;
    private ArrayList<RekamMedis> arsipRekam;

    public RumahSakit(String nama) {
        this.nama = nama;
        this.daftarDokter = new ArrayList<>();
        this.daftarPasien = new ArrayList<>();
        this.arsipRekam = new ArrayList<>();
    }

    public void addDokter(Dokter d) {
        daftarDokter.add(d);
    }

    public void registerPasien(Pasien p) {
        daftarPasien.add(p);
    }

    public void buatRekamMedis(Pasien pasien, Dokter dokter, String tanggal, String diagnosis, String resep) {
        RekamMedis rm = new RekamMedis(pasien, dokter, tanggal, diagnosis, resep);
        arsipRekam.add(rm);
        System.out.println("Rekam medis dibuat untuk pasien " + pasien.getNama() + " oleh Dr. " + dokter.getNama());
    }

    public List<RekamMedis> getRekamByPasien(String noRm) {
        ArrayList<RekamMedis> hasil = new ArrayList<>();
        for (RekamMedis r : arsipRekam) {
            if (r.getPasien().getNoRekamMedis().equals(noRm)) {
                hasil.add(r);
            }
        }
        return hasil;
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rumah Sakit: ").append(nama).append("\n");
        sb.append("Dokter terdaftar:\n");
        for (Dokter d : daftarDokter) sb.append(" - ").append(d.info()).append("\n");
        sb.append("Pasien terdaftar:\n");
        for (Pasien p : daftarPasien) sb.append(" - ").append(p.info()).append("\n");
        sb.append("Jumlah rekam medis: ").append(arsipRekam.size()).append("\n");
        return sb.toString();
    }
}
