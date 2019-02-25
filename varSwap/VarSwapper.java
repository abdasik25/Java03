package varSwap;

public class VarSwapper {
    public static void Swap (int a, int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}
