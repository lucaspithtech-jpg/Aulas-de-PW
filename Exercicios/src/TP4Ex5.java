import java.util.Random;

public class TP4Ex5 {
    public static void main(String[] args) throws Exception{
        String[] nomes = {
            "José", "Maria","Pedro","Wenderclevertson Jr"            
        };
        
        Random random = new Random();

        System.out.println("===================================================================================");
        System.out.printf("%-22s | %10s | %10s | %10s | %10s | %10s%n", 
            "Nome da pessoa", "1º Bim", "2º Bim", "3º Bim", "4º Bim", "Total");
        System.out.println("===================================================================================");

        for (String nome : nomes) {
            double total = 0.0;
            
            System.out.printf("%-22s | ", nome);

            for (int b = 1; b <= 4; b++) {
                double nota = random.nextDouble() * 10.0;
                total += nota;

                System.out.printf("%10.1f | ", nota);
            }

            System.out.printf("%10.1f%n", total);
        }

        System.out.println("===================================================================================");
    }

}
