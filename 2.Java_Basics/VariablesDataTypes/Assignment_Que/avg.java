package VariablesDataTypes.Assignment_Que;
import java.util.*;
public class avg {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=((a+b+c)/3);
        System.out.println("Avg of three no's input from users:"+avg);
        sc.close();
    }
    
}
