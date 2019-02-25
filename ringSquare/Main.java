package ringSquare;

public class Main {

    public static void main(String[] args) {
        int radiusSmall = 3;
        int radiusBig = 10;

        System.out.println("Find square of the ring:");
        System.out.println("Square = " + Ring.RingSquare(radiusSmall,radiusBig) + " cm^2");
    }
}
