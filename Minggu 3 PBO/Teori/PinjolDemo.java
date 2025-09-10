public class PinjolDemo {
    public static void main(String[] args) {
        Pinjol pj1 = new Pinjol("21269", "Sahrino", 1200000, 0.5);

        pj1.cekPeminjaman();
        System.out.println("---------------------");
        pj1.ajukanPeminjaman(2000000);
        System.out.println("---------------------");
        pj1.terlambatBayarPinjaman(3);
        System.out.println("---------------------");
        pj1.bayarPeminjaman(1000000);
        System.out.println("---------------------");
        pj1.cekPeminjaman();
    }
}
