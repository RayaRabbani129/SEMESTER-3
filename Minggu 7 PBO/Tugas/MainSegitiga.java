public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        int sudut1 = segitiga.totalSudut(65);
        System.out.println("Sudut ketiga (dengan sudutA=65): " + sudut1);
        
        int sudut2 = segitiga.totalSudut(52, 75);
        System.out.println("Sudut ketiga (dengan sudutA=52, sudutB=75): " + sudut2);
        
        int keliling1 = segitiga.kelling(3, 4, 5);
        System.out.println("Keliling segitiga (sisi 3,4,5): " + keliling1);
        
        double keliling2 = segitiga.kelling(3, 4);
        System.out.println("Sisi miring segitiga (alas=3, tinggi=4): " + keliling2);
    }
}
