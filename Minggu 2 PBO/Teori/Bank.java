public class Bank {
    public static void main(String[] args) {
        Tabungan tb = new Tabungan("202122", "NIEL", 2000000);

        tb.cekSaldo();
        System.out.println("--------------------------");
        tb.ambilUang(1000000);
        tb.cekSaldo();
        System.out.println("--------------------------");
        tb.simpanUang(2500000);
        tb.cekSaldo();
         
    }
}
