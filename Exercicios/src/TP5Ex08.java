import java.util.Arrays;
import java.util.Scanner;

public class TP5Ex08 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Digite um número entre 0 e 20: ");
            numero = sc.nextInt();
            
            if (numero <= 0 || numero >= 20) {
                System.out.println("Número inválido! Tente novamente.");
            }
        } while(numero <=0 || numero >= 20);
        
        int[] vetor = new int[numero];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = numero;
        }

        System.out.println("\nVetor criado com tamanho " + numero + ":");
        System.out.println(Arrays.toString(vetor));

        sc.close();


    }

}
