package VariablesDataTypes.Assignment_Que;
import java.util.*;
public class gst {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in); 
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float GSt=0.18f;
        float  totalPrice=(pen+pencil+eraser)*GSt;

        System.out.println("Total bill is :"+totalPrice);
        sc.close();
    }
    
}
