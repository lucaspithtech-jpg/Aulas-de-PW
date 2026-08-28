import java.util.Scanner;

public class TP3Ex3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva sua renda mensal: R$");
        float rMensal = sc.nextFloat();

        sc.close();

        if (rMensal <= 1164) {
            System.out.print("Isento de imposto de renda.");
            
        } else if (rMensal > 1164 && rMensal <= 2326) {
            rMensal *= 1.15;
            System.out.print("Com 15% de imposto: " + rMensal);
            
        } else{
            rMensal *= 1.275;
            System.out.print("Com 27,5% de imposto: " + rMensal);
        }
    }

}
