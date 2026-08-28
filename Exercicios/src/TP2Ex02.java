import java.util.Scanner;

public class TP2Ex02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$");
        float vCompra = sc.nextFloat();

        System.out.print("Digite quanto o cliente pretende pagar: R$");
        float vCliente = sc.nextFloat();

        sc.close();

        double troco = vCliente - vCompra;

        int centavos = (int) Math.round(troco * 100);

        int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0;
        int m1 = 0, m50 = 0, m25 = 0, m10 = 0, m05 = 0;

        if (centavos >= 10000) {
            n100 = centavos / 10000;
            centavos = centavos % 10000;
        }

        if (centavos >= 5000) {
            n50 = centavos / 5000;
            centavos = centavos % 5000;
        }

        if (centavos >= 2000) {
            n20 = centavos / 2000;
            centavos = centavos % 2000;
        }

        if (centavos >= 1000) {
            n10 = centavos / 1000;
            centavos = centavos % 1000;
        }

        if (centavos >= 500) {
            n5 = centavos / 500;
            centavos = centavos % 500;
        }

        if (centavos >= 200) {
            n2 = centavos / 200;
            centavos = centavos % 200;
        }

        if (centavos >= 100) {
            m1 = centavos / 100;
            centavos = centavos % 100;
        }

        if (centavos >= 50) {
            m50 = centavos / 50;
            centavos = centavos % 50;
        }

        if (centavos >= 25) {
            m25 = centavos / 25;
            centavos = centavos % 25;
        }

        if (centavos >= 10) {
            m10 = centavos / 100;
            m10 = centavos / 10;
            centavos = centavos % 10;
        }

        if (centavos >= 5) {
            m05 = centavos / 5;
            centavos = centavos % 5;
        }

        System.out.println();

        System.out.println("O valor do troco será de: R$" + troco);
        System.out.println("A composição do troco será:");
        System.out.println(n100 + " notas de R$100");
        System.out.println(n50 + " notas de R$50");
        System.out.println(n20 + " notas de R$20");
        System.out.println(n10 + " notas de R$10");
        System.out.println(n5 + " notas de R$5");
        System.out.println(n2 + " notas de R$2");
        System.out.println(m1 + " moedas de R$1");
        System.out.println(m50 + " moedas de R$0,50");
        System.out.println(m25 + " moedas de R$0,25");
        System.out.println(m10 + " moedas de R$0,10");
        System.out.println(m05 + " moedas de R$0,05");

    }

}
