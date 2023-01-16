import java.util.Scanner;

public class IMPLICA_TEJOME_Nested_Problem_Number_7 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = sc.nextInt();
    
     // #6 easy - iverted hollow triangle
     for (int rows = n; rows >= 1; rows--) {
        for (int spaces = 1; spaces <= n-rows; spaces++) {
            System.out.print(" ");
        }
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
