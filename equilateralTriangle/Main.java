package equilateralTriangle;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        System.out.println("Is it an equilateral triangle?" +
                (EquilateralTriangle.isEquilateralTriangle(a,b,c) ? " Yes" : " No"));
    }
}
