package Loops;
public class print_Reverse {

    public static void main(String[] args){
       
    int n=12345;
    while (n>0) {
       int reverse = n%10;
       System.out.print(reverse);
       n=n/10;
    } 
    }    
}

