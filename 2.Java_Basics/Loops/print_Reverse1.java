package Loops;

public class print_Reverse1 {
    public static void main(String[] args){
        int rev=0;  
        int n=12345;
        while (n>0) {
            int last_digit=n%10;
            int reverse=(rev*10)+last_digit;
           System.out.print(reverse);
            n=n/10;
        } 
        }    
    
}
