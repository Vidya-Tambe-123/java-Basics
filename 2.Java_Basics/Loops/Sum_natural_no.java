package Loops;
import java.util.*;
public class Sum_natural_no {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int sum=0;
        while(a<=n){
            sum+=a;
            System.out.println(sum);
            a++;
        }
        sc.close();
        
    }
   
    
}
