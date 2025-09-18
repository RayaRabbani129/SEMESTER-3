public class Main {
    public static void main(String[] args) {
        Kursus ks = new Kursus("PBO", "Pemrogramman Berbasis Objek");
        Peserta ps = new Peserta("Yuel");
        Instruktur ins = new Instruktur("Diogo");
        Video v = new Video("Enkapsulai", "Belajar metode Enkasulasi", 100);
        Artikel a = new Artikel("Metode Enkapsulasi", "Penelitian metode Enkapsulasi", 50);

        ins.tampilkanIns();
        a.tampilkan();

        Pembayaran p =new Pembayaran(1000000, "QRIS");
        p.tampilkan();
    }
}
