public class practise{
    public static boolean isPrime(int n){
        // base case
        boolean IsPrime=true;
        if(n==0){
            IsPrime=false;
        }
        if(n==1){
            IsPrime=false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                IsPrime=false;
                break;
            }
            
        }
        return IsPrime;
    }
    public static void primeRange(int n){
        for(int i=1;i<=n;i++){
            boolean result=isPrime(i);
            if(result==true){
                System.out.println(i+"no is prime");
            }
            else{
                System.out.println(i+"no is not prime");
            }
            
        }
    }

    public static void main (String args[]){
        primeRange(10);
    }
}