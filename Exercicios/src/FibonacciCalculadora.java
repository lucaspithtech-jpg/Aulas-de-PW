import java.util.Scanner;

public class FibonacciCalculadora {

    public static int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        
        int resultado = calcularFibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + resultado);
        
        scanner.close();
    }
}
