import java.util.Random;

public class TP7Ex03 {
    public static void main(String[] args) throws Exception {
        int[] vetor = new int[100];

        System.out.println("----Vetor original----\n");
        preencherComSorteio(vetor);
        imprimirVetor(vetor);

        System.out.println();

        System.out.println("----Vetor ordenado----\n");
        ordenadorDecrescenteVetor(vetor);
        imprimirVetor(vetor);

    }

    public static void preencherComSorteio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(1000, 10000);
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }

    public static void ordenadorDecrescenteVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
    }
}
