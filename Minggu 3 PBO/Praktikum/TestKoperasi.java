import java.util.Scanner;

public class TestKoperasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No. KTP: ");
        String ktp = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Limit pinjaman: ");
        int limit = sc.nextInt();

        Anggota a = new Anggota(ktp, nama, limit);
        System.out.println("\nNama Anggota: " + a.getNama());
        System.out.println("Limit Pinjaman: " + a.getLimitPinjaman());

        System.out.print("\nMasukkan nominal pinjaman pertama: ");
        int p1 = sc.nextInt();
        System.out.println("Meminjam uang " + p1 + "...");
        a.pinjam(p1);
        System.out.println("Jumlah pinjaman saat ini: " + a.getJumlahPinjaman());

        System.out.print("\nMasukkan nominal pinjaman kedua: ");
        int p2 = sc.nextInt();
        System.out.println("Meminjam uang " + p2 + "...");
        a.pinjam(p2);
        System.out.println("Jumlah pinjaman saat ini: " + a.getJumlahPinjaman());

        System.out.print("\nMasukkan angsuran pertama: ");
        int ang1 = sc.nextInt();
        System.out.println("Membayar angsuran " + ang1);
        a.angsur(ang1);
        System.out.println("Jumlah pinjaman saat ini: " + a.getJumlahPinjaman());

        System.out.print("\nMasukkan angsuran kedua: ");
        int ang2 = sc.nextInt();
        System.out.println("Membayar angsuran " + ang2);
        a.angsur(ang2);
        System.out.println("Jumlah pinjaman saat ini: " + a.getJumlahPinjaman());

        sc.close();
    }
}
