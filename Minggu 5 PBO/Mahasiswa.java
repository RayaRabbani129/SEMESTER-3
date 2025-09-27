public class Mahasiswa extends Orang{
    private String nim;

    public Mahasiswa(String id, String nama, String nim){
        super(id, nama);
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public String toString(){
        return String.format("Student[%s - %s]", nim, getNama());
    }

    
}
