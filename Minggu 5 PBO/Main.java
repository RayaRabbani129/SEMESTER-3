import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mahasiswa alice = new Mahasiswa("P1", "Alice", "S001");
        Mahasiswa bob = new Mahasiswa("P2", "Bob", "S002");

        Kursus math = new Kursus("C101", "Mathematics");
        Kursus hist = new Kursus("C102", "History");

        math.tambahMahasiswa(alice);
        math.tambahMahasiswa(bob);
        hist.tambahMahasiswa(bob);

        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade(alice, math, 85));
        grades.add(new Grade(bob, math, 92));
        grades.add(new Grade(bob, hist, 78));

        System.out.println("Course s and their students:");
        for (Mahasiswa s : math.getMahasiswa()) System.out.println(" - " + s);

        System.out.println("\nGrades:");
        for (Grade g : grades) {
        System.out.println(String.format("%s in %s => %d", g.getMahasiswa().getNama(), g.getKursus().getJudul(), g.getNilai()));
        }
    }
}