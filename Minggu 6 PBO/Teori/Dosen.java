public class Dosen extends AnggotaKampus{
    private String nip;
    private String departement;

    public Dosen(String nama, String id, String nip, String department){
        super(nama, id);
        this.nip = nip;
        this.departement = department;
    }

    public String getNip(){
        return nip;
    }

    public String getDepartment(){
        return departement;
    }
}
