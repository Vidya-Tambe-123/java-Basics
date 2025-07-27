package Conditional_Statements;

public class largest_no {
    public static void main(String args[]){
        int a=10;
        int b=12;
        int c=14;
        if(a>b &&a>c){
            System.out.println("a is greater number");
        }
        else if(b>a && b>c){
            System.out.println("b is greater number");
        }
        else{
            System.out.println("c is greater number");
        }
    }
    
}
