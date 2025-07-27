package Conditional_Statements;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a");
        int a = sc.nextInt();
        System.out.print("Enter b");
        int b = sc.nextInt();
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+' : System.out.print(a+b);
                      break;
            case '-' : System.out.print(a-b);
                       break;
            case '*' : System.out.print(a*b);
                        break;
            case '/' : System.out.print(a/b);
                        break;
            case '%' : System.out.print(a%b);
                        break;
            default: System.out.print("YOu entered wrong");
                        
        }

       
       
        sc.close();
    }
}
// import java.util.*;
// public class conditional_switch {
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int  day_no=sc.nextInt();
//         switch(day_no){
//             case 1 : System.out.print("Sunday");
//                     break;
//             case 2 : System.out.print("Monday");
//                     break;
//             case 3 : System.out.print("Thuesday");
//                     break;
//             case 4 : System.out.print("wensday");
//                     break;
//             case 5 : System.out.print("Thursday");
//                     break;
//             case 6 : System.out.print("Friday");
//                     break;
//             case 7 : System.out.print("Saturday");
//                     break;
//             default:System.out.println("you enter incoreect");
//         }
//         sc.close();
//     }
// }

    

