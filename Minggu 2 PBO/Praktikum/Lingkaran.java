public class Lingkaran {
    public double phi;
    public double r;

    public double hitungLuas(){
        return phi * r * r;
    }

    public double hitungKeliling(){
        return 2 * phi * r;
    }

    public void hitungSemua(){
        System.out.println("Jari-jari   : " + r);
        System.out.println("Luas        : " + hitungLuas());
        System.out.println("Keliling    : " + hitungKeliling());
    }
}
