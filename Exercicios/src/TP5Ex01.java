public class TP5Ex01 {
    public static void main(String[] args) throws Exception {
        int linhas = 5;
        int colunas = 5;
        double[][] matriz = new double[linhas][colunas];

        for (int a = 0; a < linhas; a++) {
            for (int b = 0; b < colunas; b++) {
                matriz[a][b] = (3.0 * a + 2.0 * b) / 3.0;
            }
        }

        System.out.println("Matriz 5x5 gerada:");
        for (int a = 0; a < linhas; a++) {
            for (int b = 0; b < colunas; b++) {
                System.out.printf("[%6.2f] ", matriz[a][b]);
            }
            System.out.println();
        }
    }

   

}
