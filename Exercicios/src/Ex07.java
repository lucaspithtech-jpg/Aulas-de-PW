import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor do lado do quadrado: ");
        float vLado = sc.nextFloat();

        sc.close();

        float perimetro = vLado*4;
        double area = Math.pow(vLado, 2);

        System.out.printf("O valor do perímetro é: %.2f\nO valor da área: %.2f", perimetro, area);
    }

}
