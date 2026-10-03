import java.util.Scanner;

public class TP5Ex04 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        double soma = 0;

        System.out.println("Digite 10 valores reais: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        double menor = vetor[0];

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];               
            }
            if (vetor[i] < menor){
                menor = vetor[i];
            }
            soma += vetor[i];
        }

        double media = soma/vetor.length;

        System.out.println("\n--- Resultados ---");
        System.out.printf("Maior elemento: %.2f\n", maior);
        System.out.printf("Menor elemento: %.2f\n", menor);
        System.out.printf("Média aritmética: %.2f\n", media);

        sc.close();
    }

}
