import java.util.ArrayList;
import java.util.List;

public class Kursus {
    private String kode;
    private String judul;
    private List<Mahasiswa> mahasiswa;

    public Kursus(String kode, String judul){
        this.kode = kode;
        this.judul = judul;
        this.mahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m){
        if(!mahasiswa.contains(m)) mahasiswa.add(m);
    }

    public void kurangiMahasiswa(Mahasiswa m){
        mahasiswa.remove(m);
    }

    public List<Mahasiswa> getMahasiswa(){
        return mahasiswa;
    }

    public String getKode(){
        return kode;
    }

    public String getJudul(){
        return judul;
    }

    public String toString(){
        return kode + " - " + judul;
    }
}
