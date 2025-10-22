public class SalesManager extends Manager1{
    private String department;

    public SalesManager(String nama, String gaji, String department) {
        super(nama, gaji);
        this.department = department;
    }
    
    public void naikkanGaji(){
        gaji += 1000000;
    }

    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Department: " + department);
    }
}
