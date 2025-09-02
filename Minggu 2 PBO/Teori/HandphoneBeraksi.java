public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hp = new Handphone();

        hp.setStatusAktif(1);
        hp.setStatusPanggilan(2);
        hp.setStatusSms(2);

        hp.tampilStatus();
    }
}
