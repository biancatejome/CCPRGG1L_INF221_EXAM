import java.util.Scanner;
public class IMPLICA_TEJOME_Nested_PROBLEM10
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.print("Enter the value: ");

        int n = scanner.nextInt();
        
        
        for (int rows = 1; rows <= n; rows++) 
        { 
           
            for (int col=1; col<= n-rows; col++)
            {
                System.out.print("  ");
            }
            
            for (int col=1; col<=rows * 2-1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}