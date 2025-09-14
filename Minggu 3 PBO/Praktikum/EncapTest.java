public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        encap.setName("Budi");
        encap.setAge(18);

        System.out.println("Name: " + encap.getName());
        System.out.println("Age: " + encap.getAge());
    }
}
