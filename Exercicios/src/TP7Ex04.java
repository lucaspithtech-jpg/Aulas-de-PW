import java.util.Random;
import java.util.Scanner;

public class TP7Ex04 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] mapa = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                mapa[i][j] = gerador.nextInt(4);
            }
        }

        int linhaTesouro = gerador.nextInt(linhas);
        int colunaTesouro = gerador.nextInt(colunas);
        mapa[linhaTesouro][colunaTesouro] = 9;

        boolean acertou = false;
        int tentativas = 0;

        System.out.println("Tente adivinhar onde o tesouro está escondido!");

        while (!acertou) {
            System.out.println("\n--- Tentativa " + (tentativas + 1) + " ---");
            int linhaPalpite;
            int colunaPalpite;

            while (true) {
                System.out.print("Digite a linha (0 até " + (linhas - 1) + "): ");
                linhaPalpite = sc.nextInt();

                System.out.print("Digite a coluna (0 até " + (colunas - 1) + "): ");
                colunaPalpite = sc.nextInt();

                if (linhaPalpite < 0 || linhaPalpite >= linhas || colunaPalpite < 0 || colunaPalpite >= colunas) {
                    System.out.println("⚠️ Coordenada inválida! Escolha valores de linha entre 0 e " 
                                       + (linhas - 1) + " e coluna entre 0 e " + (colunas - 1) + ".\n");
                } else {
                    break;
                }
            }

            tentativas++;

            if (linhaPalpite == linhaTesouro && colunaPalpite == linhaTesouro) {
                acertou = true;
            } else {
                if (linhaPalpite > linhaTesouro) {
                    System.out.println("Dica: O tesouro está mais ao norte.");
                } else if (linhaPalpite < linhaTesouro) {
                    System.out.println("Dica: O tesouro está mais ao sul.");
                }
                if (colunaPalpite > colunaTesouro) {
                    System.out.println("Dica: O tesouro está mais ao oeste.");
                } else if (colunaPalpite < colunaTesouro) {
                    System.out.println("Dica: O tesouro está mais ao leste.");
                }

            }
            {

            }

        }

        System.out.println("\n=========================================");
        System.out.println("Parabéns: Você encontrou o tesouro!");
        System.out.println("Toral de tentativas: " + tentativas);
        System.out.println("=========================================\n");

        System.out.println("Mapa Revelado:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                switch (mapa[i][j]) {
            case 0:
                System.out.print("🌊 "); 
                break;
            case 1:
                System.out.print("🏖️ "); 
                break;
            case 2:
                System.out.print("🌲 "); 
                break;
            case 3:
                System.out.print("⛰️ "); 
                break;
            case 9:
                System.out.print("💎 "); 
                break;
        }
            }
            System.out.println();
        }

        sc.close();

    }

}
