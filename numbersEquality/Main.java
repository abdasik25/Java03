package numbersEquality;

public class Main {

    public static void main(String[] args) {
        double numberOne = 3.141528306;
        double numberTwo = 3.141528306;
        double numberThree = 3;

        System.out.println("Equality of three digits:");
        System.out.println(numberOne + " = " + numberTwo + " = " + numberThree + "?" +
                (numbersEquality.isEqual(numberOne,numberTwo,numberThree) ? " Yes" : " No"));
    }
}
