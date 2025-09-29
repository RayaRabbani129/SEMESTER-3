public class Dokter extends Orang {
    private String spesialis;

    public Dokter(String id, String nama, int umur, String spesialis) {
        super(id, nama, umur);
        this.spesialis = spesialis;
    }

    public String getSpesialis(){ 
        return spesialis; 
    }

    public String info() {
        return "Dokter - " + super.info() + ", Spesialis: " + spesialis;
    }
}
