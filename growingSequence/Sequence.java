package growingSequence;

public class Sequence {

    public static boolean isGrowingSequence(int number){

        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int forthDigit = number / 1 % 10;

        return  (firstDigit < secondDigit && secondDigit < thirdDigit && thirdDigit < forthDigit);
    }
}
