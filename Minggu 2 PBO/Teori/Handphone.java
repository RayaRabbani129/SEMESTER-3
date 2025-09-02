public class Handphone {
    private boolean statusAktif;
    private String statusPanggilan;
    private String statusSms;

    public Handphone(){
        statusAktif = false;
        statusPanggilan = "Menunggu";
        statusSms = "Manunggu";
    }

    public void setStatusAktif(int status){
        if(status == 0){
            statusAktif = false;
        }else{
            statusAktif = true;
        }
    }

    public void setStatusPanggilan(int status){
        switch(status){
            case 0 -> statusPanggilan = "Menunggu panggilan";
            case 1 -> statusPanggilan = "Menerima Panggilan";
            case 2 -> statusPanggilan = "Melakukan panggilan";
            default -> 
                throw new AssertionError();
        }
    }

    public void setStatusSms(int status){
        switch (status){
            case 0 -> statusSms = "Menunggu SMS";
            case 1 -> statusSms = "Menerima SMS";
            case 2-> statusSms = "Mengirim SMS";
            default ->
                throw new AssertionError();
        }
    }

    public void tampilStatus(){
        System.out.println("Status aktif: " + (statusAktif ? "ON" : "OFF"));
        System.out.println("Status panggilan: " + statusPanggilan);
        System.out.println("Status SMS: " + statusSms);
    }
}
