public class Main2 {
    public static void main(String[] args) {
        Mobil m =  new Mobil();
        m.setMerk("Xenia");
        m.setBiaya(400000);

        Sopir s= new Sopir();
        s.setNama("Randu");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Roni");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(3);

        System.out.println("Biaya total: Rp." + p.hitungBiayaTotal());
        System.out.println("Merk mobil pelanggan: " + p.getMobil().getMerk());
    }
}
