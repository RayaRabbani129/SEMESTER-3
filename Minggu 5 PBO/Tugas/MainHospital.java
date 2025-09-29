import java.util.List;

public class MainHospital {
    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("RS Sehat Sentosa");

        Dokter d1 = new Dokter("D001", "Dr. Ani", 45, "Interna");
        Dokter d2 = new Dokter("D002", "Dr. Budi", 50, "Bedah");

        rs.addDokter(d1);
        rs.addDokter(d2);

        Pasien p1 = new Pasien("RM001", "P001", "Andi", 30);
        Pasien p2 = new Pasien("RM002", "P002", "Siti", 25);

        rs.registerPasien(p1);
        rs.registerPasien(p2);

        rs.buatRekamMedis(p1, d1, "2025-09-01", "Demam & Flu", "Paracetamol 500mg");
        rs.buatRekamMedis(p2, d2, "2025-09-02", "Luka Robek", "Perban + Antibiotik");
        rs.buatRekamMedis(p1, d2, "2025-09-10", "Cek pasca operasi", "Kontrol rutin");

        System.out.println("\n--- INFO RUMAH SAKIT ---");
        System.out.println(rs.info());

        System.out.println("--- REKAM MEDIS PASIEN RM001 ---");
        List<RekamMedis> rekamAndi = rs.getRekamByPasien("RM001");
        for (RekamMedis r : rekamAndi) {
            System.out.println(r.info());
        }
    }
}
