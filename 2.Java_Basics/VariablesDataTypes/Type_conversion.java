package VariablesDataTypes;

public class Type_conversion {
    public static void main(String args[]){
        // it is possible to store int into long
        int a=24;
        long b=a;
        System.out.println(a);
        System.out.println(b);
        // but long to float is loosy conversion java not allowed

        // long a=24;
        // int b = a;
        // System.out.println(a);
        // System.out.println(b);

        // type cast
        // by forcefully conversion of float to int
        float c=3.14f;
        int d=(int)c;
        System.out.println(c);
        System.out.println(d);

    }
    
}
