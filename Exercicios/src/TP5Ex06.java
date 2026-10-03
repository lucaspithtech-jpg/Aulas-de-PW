public class TP5Ex06 {
    public static void main(String[] args) throws Exception {
        int matriz[][] = { { 497, 424, 432, 634 },
                { 413, 746, 525, 976 },
                { 213, 879, 976, 800 } };

        System.out.println("--------------------------");
        int i = 0;
        while (i < matriz.length) {
            int j = 0;
            while (j < matriz[i].length) {
                System.out.print(matriz[i][j] + "\t");
                j++;
                
            }
            System.out.println();
            i++;
        }   
        System.out.println("--------------------------");
        
    }

}
