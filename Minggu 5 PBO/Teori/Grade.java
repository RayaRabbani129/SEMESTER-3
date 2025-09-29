public class Grade {
    private Mahasiswa mahasiswa;
    private Kursus kursus;
    private int nilai;

    public Grade(Mahasiswa mahasiswa, Kursus kursus, int nilai){
        this.mahasiswa = mahasiswa;
        this.kursus = kursus;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa(){
        return mahasiswa;
    }
    public Kursus getKursus(){
        return kursus;
    }
    public int getNilai(){
        return nilai;
    }

    public String toString() {
         return String.format("Grade[%s, %s] = %d", mahasiswa.getId(), kursus.getKode(), nilai);
    }
}
