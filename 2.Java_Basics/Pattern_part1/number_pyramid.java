package Pattern_part1;

public class number_pyramid {
   
        public static void main(String args[]){
            int n=5;
            int num=0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    num++;
                    System.out.print(num+" ");
                }
                System.out.println(" ");
            }
        }
        
    }
    
    

