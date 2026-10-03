import java.util.Random;

public class TP6Ex05 {
    public static void main(String[] args) throws Exception {
        int vetor[] = new int[9];
        sorteioValorPosicoes(vetor);
        imprimeVetor(vetor);

        for (int i1 = 0; i1 < vetor.length; i1++) {
            for (int i2 = i1 + 1; i2 < vetor.length; i2++) {
                if (vetor[i2] < vetor[i1]) {
                    int intermediario = vetor[i1];
                    vetor[i1] = vetor[i2];
                    vetor[i2] = intermediario;

                }
            }
        }
        imprimeVetor(vetor);
    }
    public static void imprimeVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
    public static void sorteioValorPosicoes(int[] vetor){
        Random random = new Random();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(1,10);
        }
    }

}
