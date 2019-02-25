package arithmetical_geometrical_Mean;

public class Main {
    public static void main(String[] args) {
        double number = 12345;
        System.out.println("Calculating arithmetical mean with digits of number " + number);
        System.out.println("Arithmetical mean = " + ArithmeticalMean.findArithmeticalMean(number));
        System.out.println("Calculating geometric mean with digits of number " + number);
        System.out.println("Geometric mean = " + GeometricalMean.CountGeometricalMean(number));

    }
}
