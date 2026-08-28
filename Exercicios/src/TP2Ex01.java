import java.util.Scanner;

public class TP2Ex01 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um ano com os quatro digitos: ");
        int aNo = sc.nextInt();

        sc.close();

        if (aNo%4==0) {           
          System.out.printf("O ano " + aNo + " é bissexto");
            
        }
        else if (aNo%4!=0 || aNo%100==0)
            System.out.print("O ano " + aNo + " não é bissexto"); 

    }

}
