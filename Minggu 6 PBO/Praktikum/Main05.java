public class Main05 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Koenisegg", 2021, 2);
        mobil.info();
        mobil.jalankan();
        System.out.println("------------------------------");
        Motor motor = new Motor("Vario", 2022, 150);
        motor.info();
        motor.jalankan();
        System.out.println("------------------------------");
        Truk truk = new Truk("Volvo", 2016, 5);
        truk.info();
        truk.jalankan();
    }
}
