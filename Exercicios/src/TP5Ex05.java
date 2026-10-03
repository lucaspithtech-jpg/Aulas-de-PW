import java.util.Random;
import java.util.Scanner;
public class TP5Ex05 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int var[] = new int[10];
        for (int i = 0; i < var.length; i++){
            var[i] = random.nextInt(100, 200 + 1);;
        }
        char escolha = ' ';

        while (escolha != 'c'){
            System.out.println("'a' => imprime o vetor da primeira posição até a última");
            System.out.println("'b' => faz o inverso de 'a'");
            System.out.println("'c' => sai do programa");
            System.out.print("Escolha uma das opções: ");
            escolha = sc.next().toLowerCase().charAt(0);

            
            switch (escolha) {
                case 'a':for (int i = 0; i < var.length; i++) {
                    System.out.print(var[i] + " ");
                }
                System.out.println();
                break;
                case 'b':for (int i = var.length - 1; i >= 0; i--) {
                    System.out.print(var[i] + " ");
                }
                System.out.println();
                break;
                case 'c':System.out.println("Programa finalizado!");
                break;
                
                default:System.out.println("Opção inválida! Tente novamente.");
                break;
                
            }
            System.out.println();
        }
        sc.close();
        
    }

}
