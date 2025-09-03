public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilkanBiodata();
        System.out.println("---------------------------------");

        mhs2.nim = 102;
        mhs2.nama = "Gilang";
        mhs2.alamat = "Jl. Bunga No 11";
        mhs2.kelas = "1B";
        mhs2.tampilkanBiodata();
        System.out.println("---------------------------------");

        mhs3.nim = 103;
        mhs3.nama = "Dana";
        mhs3.alamat = "Jl. Kamu No 22";
        mhs3.kelas = "1F";
        mhs3.tampilkanBiodata();
    }
}
