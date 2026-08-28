import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x1: ");
        float vXum = sc.nextFloat();
        System.out.print("Digite o valor de x2: ");
        float vXdois = sc.nextFloat();
        System.out.print("Digite o valor de y1: ");
        float vYum = sc.nextFloat();
        System.out.print("Digite o valor de y2: ");
        float vYdois = sc.nextFloat();

        sc.close();
        
        double dEuclidiana = Math.abs(Math.sqrt(((vXdois - vXum) + (vYdois - vYum))));

        System.out.printf("A distância euclidiana é: %.1f", dEuclidiana);

    }
}

