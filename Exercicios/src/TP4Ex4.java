import java.util.Scanner;

public class TP4Ex4 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int num = sc.nextInt();

        sc.close();

        if (num < 1 || num > 7){
            System.out.print("Valor inválido.");
        } else{
            switch (num) {
                case 1: System.out.print("Domingo");
                break;
                case 2: System.out.print("Segunda-feira");
                break;
                case 3: System.out.print("Terça-feira");
                break;
                case 4: System.out.print("Quarta-feira");
                break;
                case 5: System.out.print("Quinta-feira");
                break;
                case 6: System.out.print("Sexta-feira");
                break;
                case 7: System.out.print("Sábado");
                    
                    
            }
        }
    }

}
