public class Main {
    public static void main(String[] args) {
        Manusia m = new Manusia();

        System.out.println("\n=== MAHASISWA DYNAMIC ===");
        m = new Mahasiswa();
        m.bernafas();
        m.makan();

        System.out.println("\n=== DOSEN DYNAMIC ===");
        m = new Dosen();
        m.bernafas();
        m.makan();
    }
}
