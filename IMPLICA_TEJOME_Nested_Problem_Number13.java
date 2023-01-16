import java.util.Scanner;

public class IMPLICA_TEJOME_Nested_Problem_Number13 {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int n = sc.nextInt();

    for (int rows= n; rows >= 1; rows--) {
        for (int columns= n; columns > rows; columns--) {
            System.out.print("  "); 
        }

        for (int space = 1; space <= (rows * 2)-1; space++) {
            if (space == 1 || space == (rows * 2)-1 || rows==n) {
                System.out.print("*  ");
            } else {
                System.out.print("  ");
            }
            
            System.out.print("\n");
        
    }
    }
    }
}
