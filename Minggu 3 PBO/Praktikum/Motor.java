public class Motor {
    private int kecepatan = 0;
    private boolean kontak0n = false;

    public void nyalakanMesin(){
        kontak0n = true;
    }

    public void matikanMesin(){
        kontak0n = false;
        kecepatan = 0;
    }

    public void tambahKecepatan(){
        if(kontak0n == true){
            kecepatan += 100;
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan(){
        if(kontak0n == true){
            kecepatan -= 5;
        }else{
            System.out.println("Tidak bisa mengurangi kecepatan karena Mesin Off! \n");
        }
    }

    public void printStatus(){
        if(kontak0n == true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan: " + kecepatan + "\n");
    }
}
