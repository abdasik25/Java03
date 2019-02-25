package equilateralTriangle;

public class EquilateralTriangle {
    public static boolean isTriangle(int a, int b, int c){
            return ((a + b > c) && (a + c > b) && (b + c > a));
        }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
     return (isTriangle(a,b,c) && a == b && b == c);
    }
}
