package Conditional_Statements;
import java.util.Scanner;
public class basic {
   public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>33){
            System.out.print("Pass");
        }
        else {
            System.out.print("Fail");
               
        }
        sc.close();
    }
    }

    

// public class basic {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int age=sc.nextInt();
//         if(age>18){
//             System.out.print("You are adult");
//         }
//         else if(age>13 && age<18){
//             System.out.print("you are teeneger");
//         }
//         else{
//             System.out.print("You are baby");
//         }
//         sc.close();
//     }
    
// }
