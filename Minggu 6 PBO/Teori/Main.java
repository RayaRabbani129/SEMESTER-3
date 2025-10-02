public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Leassa", "M001", "202401", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Ruby", "M002", "202401", "Sistem Informasi");

        Dosen ds = new Dosen("Dr Vito", "D001", "202001", "Teknik Informatika");

        TataTertib tt1 = new TataTertib("Dilarang Merokok di Area Kampus", "Denda Rp.100.000");
        TataTertib tt2 = new TataTertib("Pakaian Wajib Berkerah", "Denda Rp.500.000");

        SistemInformasiTataTertib sitt = new SistemInformasiTataTertib();
        Pelanggaran pl1 = new Pelanggaran(mhs1, tt2, "25-03-2024");
        Pelanggaran pl2 = new Pelanggaran(mhs2, tt2, "01-10-1014");

        System.out.println("\n");
        sitt.catatPelanggaran(pl1);
        sitt.catatPelanggaran(pl2);

        System.out.println("\n");
        Pelanggaran[] semuPelanggaran = {pl1, pl2};
        sitt.lihatRiwayatPelanggaran(mhs1, semuPelanggaran);
        sitt.lihatRiwayatPelanggaran(mhs2, semuPelanggaran);
        sitt.lihatRiwayatPelanggaran(ds, semuPelanggaran);
    }
}
