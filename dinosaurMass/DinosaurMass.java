package dinosaurMass;

public class DinosaurMass {

    public static double CalculateMassInGrams(double massKilos){
        return massKilos * 1000;
    }

    public static double CalculateMassInTons(double massKilos){
        return massKilos / 1000;
    }

    public static double CalculateMassInMilligrammes(double massKilos){
        return massKilos * 1000 * 1000;
    }
}
