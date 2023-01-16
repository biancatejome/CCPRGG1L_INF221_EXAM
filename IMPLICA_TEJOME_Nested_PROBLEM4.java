import java.util.Scanner;
public class IMPLICA_TEJOME_Nested_PROBLEM4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();

            for(int rows = 1 ; rows <= n; rows++){
                System.out.print(" \n ");
                for(int columns = 1 ; columns <= rows ; columns++){
                    if(columns == 1 || rows == n || rows == columns || columns == rows){
                     System.out.print(" * ");
                }
                    else{
                         System.out.print("   ");
                }
         }
       
        }
            sc.close();
    }
}