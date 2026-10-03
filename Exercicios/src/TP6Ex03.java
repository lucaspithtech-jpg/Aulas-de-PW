import java.util.Random;

public class TP6Ex03 {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[10];

        preencherVetor(vetor);

        System.out.println("--- Vetor Original ---");
        imprimirVetor(vetor);

        System.out.println("\n--- Vetor Crescente ---");
        ordenarVetor(vetor, "crescente");
        imprimirVetor(vetor);

        System.out.println("\n--- Vetor Decrescente ---");
        ordenarVetor(vetor, "decrescente");
        imprimirVetor(vetor);
    }

    public static void preencherVetor(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(500, 1001);
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }

    public static void ordenarVetor(int[] vetor, String ordem) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                boolean precisaTrocar = false;

                if (ordem.equalsIgnoreCase("crescente")) {
                    precisaTrocar = vetor[j] > vetor[j + 1];
                } else if (ordem.equalsIgnoreCase("decrescente")) {
                    precisaTrocar = vetor[j] < vetor[j + 1];
                }

                if (precisaTrocar) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

}
