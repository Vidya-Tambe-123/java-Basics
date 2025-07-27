package Conditional_Statements;
import java.util.Scanner;
public class leap_year {
  public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
    if(no%4==0){
        System.out.println("Year is leap");
    }
    else if(no%100==0){
        System.out.println("Year is leap");
    }
    else if(no%400==0){
        System.out.println("Year is leap");
    }
    else{
        System.out.println("Year is not leap");
    }
    sc.close();

    }
    
}
