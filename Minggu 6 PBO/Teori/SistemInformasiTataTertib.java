public class SistemInformasiTataTertib {
    public void catatPelanggaran(Pelanggaran pelanggaran){
        System.out.println("");
        System.out.println("Pelanggaran dicatat:");
        System.out.println("Pelanggar\t: " + pelanggaran.getPelanggar().getNama() + " (ID: " + pelanggaran.getPelanggar().getId() + ")");
        System.out.println("Tata Tertib\t: " + pelanggaran.getTataTertib().getPeraturan());
        System.out.println("Sanksi\t\t: " + pelanggaran.getTataTertib().getSanksi());
        System.out.println("Tanggal\t\t: " + pelanggaran.getTanggal());
    }

    public void lihatRiwayatPelanggaran(AnggotaKampus anggota, Pelanggaran[]pelanggaranList){
        System.out.println("\n");
        System.out.println("Riwayat Pelanggaran untuk " + anggota.getNama() + ":");
        for (Pelanggaran pelanggaran : pelanggaranList) {
            if (pelanggaran.getPelanggar().getId().equals(anggota.getId())) {
            System.out.println("- " + pelanggaran.getTataTertib().getPeraturan() + " pada " +
            pelanggaran.getTanggal());
            }
        }
    }
}
