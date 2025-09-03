public class Karyawan {
    private int id;
    private String nama;
    private String jabatan;
    private char jenisKelamin;
    private double gaji;

    public void tampilkanData(){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Jumlah Gaji: " + gaji);
    }

    public double ambilGaji(){
        return gaji;
    }
}
