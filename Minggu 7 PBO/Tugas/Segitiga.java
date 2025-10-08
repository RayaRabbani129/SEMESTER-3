public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    public int kelling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    public double kelling(int sisiA, int sisiB) {
        return Math.sqrt(Math.pow(sisiA, 2) + Math.sqrt(Math.pow(sisiB, 2)));
    }
}
