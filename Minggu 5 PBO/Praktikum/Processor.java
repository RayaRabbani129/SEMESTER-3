public class Processor {
    private String merk;
    private double cache;

    public Processor(){

    }

    public Processor(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    public String setMerk(String merk){
        this.merk = merk;
        return merk;
    }

    public double setCache(double cache){
        this.cache = cache;
        return cache;
    }

    public String getMerk(){
        return merk;
    }

    public double getCache(){
        return cache;
    }

    public void info(){
        System.out.printf("Merk Processor\t: %s/n", merk);
        System.out.printf("Cache memory\t: %.2f/n", cache);
    }
}