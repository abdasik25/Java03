package ringSquare;

public class Ring {

    public static int RingSquare(int smallRadius, int bigRadius){
        return (int) (Math.PI * (bigRadius - smallRadius) * (bigRadius + smallRadius));
    }
}
