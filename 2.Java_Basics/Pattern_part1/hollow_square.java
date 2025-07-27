
package Pattern_part1;

public class hollow_square{
    
    public static void main(String[] args) {
        int n = 4; 
        int m=4; // Modify this value to change the size of the square
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
