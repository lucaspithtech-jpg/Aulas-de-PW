import java.util.Locale;
import java.util.Scanner;

public class TP2Ex05 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Digite sua altura (em centímetros): ");
        int aCentimetros = sc.nextInt();

        System.out.print("Digite seu sexo (M para masculino, F para feminino): ");
        String sExo = sc.next();

        System.out.print("Digite seu peso atual (em kilos): ");
        float pAtual = sc.nextFloat();

        sc.close();
        
        float aMetros = (float)aCentimetros/100;
        double pIdeal = 0;
        if (sExo.toLowerCase().equals("m")) {
            pIdeal = ( aMetros * 72.7 ) - 58;          
        }
        else if (sExo.toLowerCase().equals("f")){
            pIdeal = ( aMetros * 62.1) - 44.7;
        }
        else {
            System.out.println("Sexo inválido!");
            return;
        }

        double diferencaPercentual = Math.abs((pAtual - pIdeal) / pIdeal) * 100;

        System.out.printf(Locale.US,"Para sua altura %.2f m, o seu peso atual %.1f kg está %.0f%% distante do peso ideal, que é %.1f kg", aMetros, pAtual, diferencaPercentual, pIdeal);
        
    }

}
