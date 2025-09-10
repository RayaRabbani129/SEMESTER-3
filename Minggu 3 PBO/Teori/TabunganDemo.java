public class TabunganDemo {
    public static void main(String[] args) {
        Tabungan tb1 = new Tabungan("21223","JOY",1000000);

        tb1.cekSaldo();
        System.out.println("---------------------");
        tb1.simpanUang(2000000);
        System.out.println("---------------------");
        tb1.ambilUang(1000000);
        System.out.println("---------------------");
        tb1.penyesuaianSaldo();
        System.out.println("---------------------");
        tb1.kirimUang(200000);
        System.out.println("---------------------");
        tb1.cekSaldo();
    }
}
