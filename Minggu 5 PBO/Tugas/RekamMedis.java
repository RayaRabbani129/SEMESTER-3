public class RekamMedis {
    private Pasien pasien;
    private Dokter dokter;
    private String tanggal;    
    private String diagnosis;
    private String resep;

    public RekamMedis(Pasien pasien, Dokter dokter, String tanggal, String diagnosis, String resep) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.tanggal = tanggal;
        this.diagnosis = diagnosis;
        this.resep = resep;
    }

    public Pasien getPasien(){ 
        return pasien; 
    }

    public Dokter getDokter(){ 
        return dokter; 
    }

    public String getTanggal(){ 
        return tanggal; 
    }

    public String getDiagnosis(){ 
        return diagnosis; 
    }

    public String getResep(){ 
        return resep; 
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tanggal: ").append(tanggal).append("\n");
        sb.append("Pasien: ").append(pasien.getNama()).append(" (RM ").append(pasien.getNoRekamMedis()).append(")\n");
        sb.append("Dokter: ").append(dokter.getNama()).append(" - ").append(dokter.getSpesialis()).append("\n");
        sb.append("Diagnosis: ").append(diagnosis).append("\n");
        sb.append("Resep: ").append(resep).append("\n");
        return sb.toString();
    }
}
