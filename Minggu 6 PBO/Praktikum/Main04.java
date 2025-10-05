public class Main04 {
    public static void main(String[] args) {
        Kucing04 kucing = new Kucing04("Miko", 0, "Putih");
        kucing.info();
        kucing.berjalan();
        // System.out.println(kucing.nama); Error Karena Modifier Private
        System.out.println(kucing.umur);
        System.out.println();

        Anjing04 anjing = new Anjing04("Marco", 0, "Coklat");
        anjing.info();
        anjing.berjalan();
    }
}
