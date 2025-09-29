public class Main1 {
    public static void main(String[] args) {
        Processor p = new Processor("Ryzen 9", 4);
        Laptop l = new Laptop("Lenovo", p);
        l.info();
        
        System.out.println("--- Contoh Kedua ---");
        Processor p1 = new Processor();
        p1.setMerk("intel i5");
        p1.setCache(3);
        Laptop l1 = new Laptop();
        l1.setMerk("Asus");
        l1.setProc(p1);
        l1.info();
    }
}
