import java.util.Scanner;

public class TP5Ex02 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 5;
        int[] vetorOriginal = new int[tamanho];
        int[] vetorInvertido = new int[tamanho];
        
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorOriginal[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < tamanho; i++) {
            vetorInvertido[i] = vetorOriginal[tamanho - 1 - i];
        }
        
        // Exibição dos resultados
        System.out.println("\nVetor Original:");
        exibirVetor(vetorOriginal);
        
        System.out.println("\nVetor Invertido:");
        exibirVetor(vetorInvertido);
        
        scanner.close();
    }
    
    public static void exibirVetor(int[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("]");
    }


}
