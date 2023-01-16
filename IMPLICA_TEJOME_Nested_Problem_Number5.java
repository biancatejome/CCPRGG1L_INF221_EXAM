import java.util.Scanner;

public class IMPLICA_TEJOME_Nested_Problem_Number5 {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a value: ");
    int n = sc.nextInt();

    // #5 easy - iverted hollow triangle
    for (int rows = n; rows >= 1; rows--) {
        for (int column = 1; column <= rows; column++) {
            if (column == 1 || rows == n || column == rows){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
            System.out.println(" \n");
        }
    }
}

