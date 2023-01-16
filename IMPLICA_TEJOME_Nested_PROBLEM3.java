import java.util.Scanner;
public class IMPLICA_TEJOME_Nested_PROBLEM3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the square size: ");
        int n = sc.nextInt();
        for(int rows = n ; rows >= 1 ; rows--){
            for(int columns = 1 ; columns <= rows ; columns++){
                System.out.print(" * ");
            }
            System.out.println("  ");
        }
}
}