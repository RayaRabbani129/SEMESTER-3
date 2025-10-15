public class Orang23 {
    private String nama23;
    private boolean jenisKelamin23; 
    private String alamat23;
    private String noTelp23;

    public Orang23(String nama, boolean jenisKelamin23, String alamat23, String noTelp23){
        this.nama23 = nama23;
        this.jenisKelamin23 = jenisKelamin23;
        this.alamat23 = alamat23;
        this.noTelp23 = noTelp23;
    }

    //overloading
    public Orang23(String nama23, boolean jenisKelamin23){
        this(nama23, jenisKelamin23, "-", "-");
    }

    //Setter & Getter
    public void setNama23(String nama23){
        this.nama23 = nama23;
    }

    public String getNama23() { 
        return nama23; 
    }

    public boolean isJenisKelamin23() { 
        return jenisKelamin23; 
    }

    public void setJenisKelamin23(boolean jenisKelamin23) { 
        this.jenisKelamin23 = jenisKelamin23; 
    }
    
    public void setAlamat23(String alamat23) { 
        this.alamat23 = alamat23; 
    }

    public void setNoTelp23(String noTelp23) { 
        this.noTelp23 = noTelp23; 
    }
    
    public String getAlamat23() { 
        return alamat23; 
    }

    public String getNoTelp23() { 
        return noTelp23; 
    }

    public void tampilkanInfo23() {
        System.out.println("Nama\t\t: " + nama23);
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin23 ? "Laki-laki" : "Perempuan"));
        System.out.println("Alamat\t\t: " + alamat23);
        System.out.println("No. Telepon\t: " + noTelp23);
    }
}
