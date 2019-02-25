package dinosaurMass;

public class Main {
    public static void main(String[] args) {

        double dinosaurMass = 304.56;

        System.out.println("Calculation dinosaur mass:");
        System.out.println("Mass in kilos = " + dinosaurMass +
                "\nMass in tons = " + DinosaurMass.CalculateMassInTons(dinosaurMass) +
               "\nMass in grams = " + DinosaurMass.CalculateMassInGrams(dinosaurMass) +
                "\nMass in milligrammes = " + DinosaurMass.CalculateMassInMilligrammes(dinosaurMass));
    }
}
