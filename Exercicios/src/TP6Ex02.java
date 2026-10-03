import java.util.Random;

public class TP6Ex02 {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        int[] vetor = new int[50];

        System.out.println("\n\n--- Vetor Original ---");
        for(int i = 0; i < vetor.length; i++){
            int vAleatorio = random.nextInt(10,100);
            vetor[i] = vAleatorio;
            System.out.print(vetor[i] + "\t");
        }
        for(int i = 0; i < vetor.length; i++){
            vetor[i] += 100;
        }
        System.out.println("\n\n--- Vetor Atualizado (+100) ---");

        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + "\t");
        }

            
    }

}
