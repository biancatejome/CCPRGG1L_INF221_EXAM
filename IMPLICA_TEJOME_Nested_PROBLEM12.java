import java.util.Scanner;

public class IMPLICA_TEJOME_Nested_PROBLEM12
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");

        int n = scanner.nextInt();
        
        for (int rows = 1; rows <= n; rows++)
        {
          
            for (int col = n; col > rows; col--)
            {
                System.out.print("  ");
            }
            
            for (int space=1; space<=(rows * 2) -1; space++)
            {
                if( space == 1 || space == (rows * 2) -1 || rows == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        scanner.close();
    }
}