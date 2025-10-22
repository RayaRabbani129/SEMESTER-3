public class Manager1 {
    private String nama;
    protected String gaji;

    public Manager1(String nama, String gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void naikkanGaji() {
        gaji += 1000000; 
    }

    public void cetakStatus() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: Manager");
        System.out.println("Gaji: " + gaji);
    }
}
