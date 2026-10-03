
public class Colinha {
    public static void main(String[] args) throws Exception {

    }

    public static void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }

    public static void imprimeMatriz(int matriz[][]) {
        System.out.println("--------------------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
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