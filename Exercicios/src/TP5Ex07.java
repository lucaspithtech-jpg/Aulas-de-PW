import java.util.Scanner;

public class TP5Ex07 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] vetorC = new  double[10];

        System.out.println("Digite 10 valores reais: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print("Valor " + (i + 1) + ": ");
            vetorA[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.println("Digite 10 outros valores reais: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print("Valor " + (i + 1) + ": ");
            vetorB[i] = sc.nextDouble();
        }

        System.out.println();

        for (int i = 0; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Vetor da soma dos vetores:");
        for (int i = 0; i < vetorC.length; i++){
            System.out.println("vetorC[" + i + "] = " + vetorC[i]);
        }
        sc.close();

    }
}
