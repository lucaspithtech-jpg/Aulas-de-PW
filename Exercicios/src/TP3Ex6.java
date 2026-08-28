import java.util.Scanner;

public class TP3Ex6 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        int k = sc.nextInt();
        
        System.out.print("Digite o valor limite: ");
        int n = sc.nextInt();

        sc.close();

        for(int i = 1; i <= n; i ++){
            double resultado = Math.pow(k, i);
            System.out.println(k + "^" + i + " = " + resultado);
        }
    }

}
