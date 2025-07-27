package Array;

import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int mark[]=new int[100];
        mark[0]=sc.nextInt();
        mark[1]=sc.nextInt();
        mark[2]=sc.nextInt();


        System.out.println("marks of phy"+mark[0]);
        System.out.println("marks of chem"+mark[1]);
        System.out.println("marks of math"+mark[2]);

        // int avg=(phy+chem+math/3);
 
        // System.out.println(avg);
        sc.close();
    }
    
}
