import java.util.Scanner;
public class IMPLICA_TEJOME_Nested_PROBLEM1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter value: ");
        int n = sc.nextInt();

    for(int rows = 1 ; rows <= n ; rows++){
        for(int columns = 1 ; columns <= n ; columns++){
            System.out.print(" * ");
        }
        System.out.println("  ");
    }


}
    



}