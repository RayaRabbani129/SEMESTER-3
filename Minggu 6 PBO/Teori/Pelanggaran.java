public class Pelanggaran {
    private AnggotaKampus pelanggar;
    private TataTertib tataTertib;
    private String tanggal;

    public Pelanggaran(AnggotaKampus pelanggar, TataTertib tataTertib, String tanggal){
        this.pelanggar = pelanggar;
        this.tataTertib = tataTertib;
        this.tanggal = tanggal;
    }

    public AnggotaKampus getPelanggar(){
        return pelanggar;
    }
    
    public TataTertib getTataTertib(){
        return tataTertib;
    }

    public String getTanggal(){
        return tanggal;
    }
}
