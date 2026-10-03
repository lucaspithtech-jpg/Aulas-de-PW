import java.util.Scanner;

public class TP5Ex03 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(String.class.cast(System.in));
        double[] pesos = new double[10];
        double somaPesos = 0;

        for (int i = 0; i < pesos.length; i++) {
            System.out.print("Digite o peso da pessoa (Código " + i + "): ");
            pesos[i] = sc.nextDouble();
            somaPesos += pesos[i];
        }

        double media = somaPesos / pesos.length;
        System.out.printf("\nA média dos pesos das 10 pessoas é: %.2f kg\n", media);

        int contadorAcimaMedia = 0;
        System.out.println("\nPessoas com peso acima da média:");

        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > media) {
                System.out.println("- Código (Índice): " + i + " | Peso: " + pesos[i] + " kg");
                contadorAcimaMedia++;
            }
        }

        System.out.println("\nTotal de pessoas acima da média: " + contadorAcimaMedia);

        sc.close();
    }

}
