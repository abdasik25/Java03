package arithmetical_geometrical_Mean;

public class ArithmeticalMean {
    public static double findArithmeticalMean(double number) {
        return (number % 10 + (number /= 10) % 10 + (number /= 10) % 10 + (number /= 10)
                % 10 + (number /= 10) % 10 + (number / 10) % 10) / 6;
    }
}
