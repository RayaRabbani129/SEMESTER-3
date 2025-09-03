public class TestBarangDiskon {
    public static void main(String[] args) {
        BarangDiskon bd = new BarangDiskon();

        bd.kode = "BDG-111";
        bd.namaBarang = "Garam Ruqyah";
        bd.hargaDasar = 200000;
        bd.diskon = 0.25f;
        bd.tampilDataBarang();
    }
}
