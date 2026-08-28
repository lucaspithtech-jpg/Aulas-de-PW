import java.util.Scanner;

public class TP3Ex2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero <= 0){
            System.out.printf("Fibonacci (n) = 0");
        } else if (numero == 1 || numero == 2) {
            System.out.print("Fibonacci (n) = 1");
            
        } else{
            int penultimo = 1;
            int ultimo = 1;
            int atual = 0;
            int contador = 3;

            while (contador <= numero) {
                atual = penultimo + ultimo;
                penultimo = ultimo;
                ultimo = atual;
                contador ++;
                
            }
            System.out.println("Fibonacci (n) = " + atual);
        }
    }

}
