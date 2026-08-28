import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valr do 1° produto: ");
        float p1 = sc.nextFloat();

        System.out.print("Insira o valor do 2°produto: ");
        float p2 = sc.nextFloat();

        System.out.print("Insira o valor do 3° produto: ");
        float p3 = sc.nextFloat();

        sc.close();

        float vTotal = p1+p2+p3;
        double precoFinal = vTotal*0.85;

        System.out.printf("O preço total a pagar será: %.2f", precoFinal);

    }

}
