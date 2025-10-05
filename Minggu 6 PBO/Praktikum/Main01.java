public class Main01 {
    public static void main(String[] args) {
        Kucing01 kucing = new Kucing01("Milo");
        kucing.bersuara();
        kucing.mengeong();
        System.out.println();

        Anjing01 anjing = new Anjing01("Lula");
        anjing.bersuara();
        anjing.menggonggong();
    }
}
