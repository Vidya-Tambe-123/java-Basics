package Pattern_part2;

public class floyld_triangle {
    public static void main(String[]args){
        int n=5;
        int num=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                num=num+1;
                System.out.print(num+" ");
                
            }
            

            System.out.println("");
        }
    }
    
}
