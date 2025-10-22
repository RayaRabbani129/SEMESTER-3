public class Kepegaiwan {
    public static void main(String[] args) {
        Manager1 mg = new Manager1("Nami", "5000000");
        Supervisior sv = new Supervisior("Robin", "4000000");
        SalesManager sm = new SalesManager("Vivi", "3500000", "IT");

        mg.naikkanGaji();
        sv.naikkanGaji();
        sm.naikkanGaji();

        mg.cetakStatus();
        System.out.println();
        sv.cetakStatus();
        System.out.println();
        sm.cetakStatus();
    }
}
