package Conditional_Statements;
import java.util.*;
public class income_tax {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if(income<500000){
           System.out.print("No tax");
        }
        else if(income > 500000 && income<1000000); 
        {
             tax=(int) (income*0.2);  
        }
        if(income>1500000 && income<2000000){
           tax=(int) (income*0.3);
        }
        System.out.print("Tax is:"+tax);
            sc.close();
    }
    
}
