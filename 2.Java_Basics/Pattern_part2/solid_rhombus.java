package Pattern_part2;

public class solid_rhombus {
    public static void main(String args[]){
        //outer loop
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
