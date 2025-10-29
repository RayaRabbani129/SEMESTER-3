public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);  //Pay for eBill
        System.out.println("------------------------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp); //pay for pemp
        System.out.println("------------------------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); //show pemp info
        System.out.println("------------------------------------------------");
        ow.showMyEmployee(iEmp); //show iEmp info
    }
}
