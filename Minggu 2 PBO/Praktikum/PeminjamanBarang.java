public class PeminjamanBarang {
    public int id;
    public String namaMember;
    public String namaGame;
    public int hargaPerHari;
    public int lamaSewa;

    public int totalBayar(){
        return hargaPerHari * lamaSewa;
    }

    public void tampilData(){
        System.out.println("ID                   : " + id);
        System.out.println("Nama Member          : " + namaMember);
        System.out.println("Nama Game            : " + namaGame);
        System.out.println("Harga Sewa Per Hari  : " + hargaPerHari);
        System.out.println("Lama Sewa            : " + lamaSewa);
        System.out.println("Total Bayar          : " + totalBayar());
    }
}
