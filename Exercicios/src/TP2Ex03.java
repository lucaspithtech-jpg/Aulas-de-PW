public class TP2Ex03 {
    public static void main(String[] args) throws Exception{
        int n = 150;
        int contador = 0;
        while (n <= 1500) {
            if (n % 10 == 0){
                System.out.print(n + " ");
                contador++;
                if ( contador == 10){
                    System.out.println();
                    contador = 0;
                }
            }
            n ++;
            
        }

        System.out.println();
        System.out.println();

        int n1 = 1;
        int soma = 0;
        while(n1 <= 1000){
            soma += n1;
            n1 ++;

        }
        System.out.printf("A soma de 1 até 1000 é %d", soma);

        System.out.println();
        System.out.println();

        int n2 = 3;
        while (n2 <= 100){
            System.out.printf("%d ", n2);
            n2 += 3;
        }

        System.out.println();
        System.out.println();

        int n3 = 1;
        while (n3 <= 100) {
            if (n3 % 3 == 0) {
                System.out.println(n3 + " é múltiplo de 3");
                
            }
            else{
                System.out.println(n3 + " não é multiplo de 3");
            }
            n3 ++;
        }








    }   

}
