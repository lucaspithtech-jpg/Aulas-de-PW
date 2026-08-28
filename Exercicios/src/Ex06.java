import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu ano de nascimento: ");
        String ano = sc.nextLine();

        System.out.print("Digite sua altura em metros: ");
        String altura = sc.nextLine();

        System.out.print("Digite seu número favorito: ");
        String numero = sc.nextLine();

        sc.close();

        int anoNas = Integer.parseInt(ano);
        float altMetros = Float.parseFloat(altura);
        int numFav = Integer.parseInt(numero);

        int iAproximada = 2026-anoNas;
        float altCenti = altMetros*100;
        int numDobro = numFav*2;
        int codigo = iAproximada+numFav;
        int compNome = nome.length();

        System.out.println();

        System.out.println("Visitante: " + nome);
        System.out.println("Idade aproximada: " + iAproximada);
        System.out.println("Altura: " + altCenti + "cm");
        System.out.println("Dobro do número favorito: " + numDobro);
        System.out.println("Código secreto: " + codigo);
        System.out.println("Seu nome possui " + compNome + " letras.");

    }

}
