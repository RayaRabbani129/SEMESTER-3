public class Program2 {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        //Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumalude = new PascaSarjana("Elok");

        //pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        //pakRektor.beriSertifikatCumlaude(masterCumalude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumalude);
    }
}
