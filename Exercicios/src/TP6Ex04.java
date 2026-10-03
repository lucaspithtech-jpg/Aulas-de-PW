import java.util.Random;

public class TP6Ex04 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int vetor[] = new int[5];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(9);
        }
        imprimeVetor(vetor);

        for(int i = 0; i < vetor.length; i++){
            vetor[i] *= 2;
        }
        imprimeVetor(vetor);
            

    }
    public static void imprimeVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

}
