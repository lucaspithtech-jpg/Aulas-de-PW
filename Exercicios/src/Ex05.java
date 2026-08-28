import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de M1: ");
        float mM1 = sc.nextFloat();
        System.out.print("Digite o valor de M2: ");
        float mM2 = sc.nextFloat();
        System.out.print("Digite o valor de M3: ");
        float mM3 = sc.nextFloat();

        sc.close();

        double vMedia = (mM1+mM2+mM3)/3;
        double vSomaDesvio = (mM1-vMedia)+(mM2-vMedia)+(mM3-vMedia);
        double vSomaDesvio2 = ((mM1-vMedia)*(mM1-vMedia))+((mM2-vMedia)*(mM2-vMedia))+((mM3-vMedia)*(mM3-vMedia));
        double vVariancia = vSomaDesvio2/3;
        double desvioPadrao = Math.abs(Math.sqrt(vVariancia));

        System.out.printf("Média: %.2f\nSoma dos desvios: %.2f\nVariância: %.2f\nDesvio padrão: %.2f ", vMedia, vSomaDesvio, vVariancia, desvioPadrao);
    }

}
