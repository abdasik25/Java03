package growingSequence;

public class Main {

    public static void main(String[] args) {
        int number = 1234;

        System.out.println("Is digits of " + number + " make a growing sequence?" +
                (Sequence.isGrowingSequence(number) ? " Yes" : " No"));

    }

}