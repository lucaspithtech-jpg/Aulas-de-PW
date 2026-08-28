import java.util.Scanner;

public class TP3Ex5 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            System.out.print("/");
            
            for (int k = 1; k <= (2 * i) - 2; k++) {
                System.out.print("*");
            }
            
            System.out.println("\\");
        }
        
        for (int j = 1; j <= n - 1; j++) {
            System.out.print(" ");
        }
        System.out.println("| |");
        
        sc.close();
    }

}
