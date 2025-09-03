public class BarangDiskon {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        return (int)(hargaDasar - (diskon * hargaDasar));
    }

    public void tampilDataBarang(){
        System.out.println("Kode Barang    : " + kode);
        System.out.println("Nama Barang    : " + namaBarang);
        System.out.println("Harga Dasar    : " + hargaDasar);
        System.out.println("Jumlah Diskon  : " + diskon);
        System.out.println("Harga Jual     : " + hitungHargaJual());
    }
}
