package function;
public class Prime_no{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<n/2;i++){
            
              if((n%i)==0){
                isPrime=false;
                //   System.out.println(i);
                break;
              }
                 
              }
       return isPrime; 
    }
    public static void main(String args[]){
        System.out.println(isPrime(4));
    }
}