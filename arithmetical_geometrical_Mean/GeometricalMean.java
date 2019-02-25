package arithmetical_geometrical_Mean;

public class GeometricalMean {
    public static double CountGeometricalMean(double number) {
        return Math.pow ((number % 10 * ((number /= 10) % 10) * ((number /= 10) % 10) *
                ((number /= 10) % 10) * ((number /= 10) % 10) * ((number / 10) % 10)), (double) 1 / 6);
    }
}
