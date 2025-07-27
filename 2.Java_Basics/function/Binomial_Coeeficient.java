package function;
public class Binomial_Coeeficient{
    public static int  fact(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static int coefficient(int n,int r){
        int  fact_n=fact(5);
        int fact_r=fact(2);
        int fmn=fact(n-r);
        int result=fact_n/(fact_r*fmn);
        return result;
    }
    public static void main(String args[]){

       System.out.println( coefficient(5, 2));
    }
}