package function;

public class Range_Prime_Number {
    
        public static boolean prime_no(int n){
            //corner case 
            if(n==1){
                return false;
            }
            if(n==2){
                return true;
            }
            for(int i=2;i<=(n-1);i++){
                if(n%i==0){
                    return false;
                }
    
            }
            return true;
        }
            public static void range_prime_no_fun(int n){
                for(int i=1;i<=n;i++){
                    if(prime_no(i)==true){
                        System.out.println(i+" ");
                    }
                   
                }
            }
        
        public static void main(String args[]){
        //    System.out.println(prime_no(16));
           range_prime_no_fun(20);
    
        }
        
    }
    
    

