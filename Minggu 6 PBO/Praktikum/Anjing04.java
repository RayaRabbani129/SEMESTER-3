public class Anjing04 extends Hewan04{
    private String jenisBulu;

    public Anjing04(String nama, int umur, String jenisBulu){
        super(nama, umur);
        this.jenisBulu = jenisBulu;
    }
    
    public void setJenisBulu(String jenisBulu){
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu(){
        return jenisBulu;
    }

    public void info(){
        super.info();
        System.out.println("Jenis bulu: " + jenisBulu);
    }
}
