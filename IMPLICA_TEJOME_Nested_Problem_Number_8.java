import java.util.Scanner;

public class IMPLICA_TEJOME_Nested_Problem_Number_8 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();
    
     // #9 easy - iverted right hollow triangle
     for (int rows = 1; rows <= n; rows++) {
        for (int spaces = 1; spaces <= n-rows; spaces++) {
            System.out.print(" ");
        }
            for (int columns = 1; columns <= rows; columns++) {
                if (columns==1 || rows==n || columns==rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}


