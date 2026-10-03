public class TP7Ex02 {
    public static void main(String[] args) throws Exception{
        int matriz[][] = {{13, 5 ,93},{3, 51, 15}};

        System.out.println("Matriz original:");
        imprimeMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = matriz[i][j] / 2;
            }
        }
        System.out.println("Matriz Atualizada:");
        imprimeMatriz(matriz);
       
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

}
