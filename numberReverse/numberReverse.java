package numberReverse;

public class numberReverse {
    public static int Reverse(int number) {
        int multiplier = 1_000_000;
        return  ((number % 10) * multiplier + ((number /= 10) % 10) * (multiplier/=10)  +
                ((number /= 10) % 10) * (multiplier/=10)  + ((number /= 10) % 10) * (multiplier/=10)  +
                ((number /= 10) % 10) * (multiplier/=10)  + ((number /= 10) % 10) * (multiplier/=10)  +
                ((number / 10) % 10) * (multiplier/10) );
    }
}
