package Loops;

public class Prime_No {

    public static boolean Prime_Noo(int n) {
        boolean isPrime = true;
        for (int i = 2; i < (n - 1); i++) {
            if ((n % i) == 0) {
                isPrime = false;
                break;
            }
            
        }
        return isPrime;
    }

    public static void main(String args[]) {
        Prime_Noo(11);
    }
}