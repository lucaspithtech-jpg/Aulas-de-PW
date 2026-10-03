import java.util.Scanner;

public class TP4Ex2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String palavra = sc.nextLine();

        String palavra_criptografada = "";

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            switch (letra) {

                case 'a':
                    palavra_criptografada += 'z';
                    break;
                case 'b':
                    palavra_criptografada += 'y';
                    break;
                case 'c':
                    palavra_criptografada += 'x';
                    break;
                case 'd':
                    palavra_criptografada += 'w';
                    break;
                case 'e':
                    palavra_criptografada += 'v';
                    break;
                case 'f':
                    palavra_criptografada += 'u';
                    break;
                case 'g':
                    palavra_criptografada += 't';
                    break;
                case 'h':
                    palavra_criptografada += 's';
                    break;
                case 'i':
                    palavra_criptografada += 'r';
                    break;
                case 'j':
                    palavra_criptografada += 'q';
                    break;
                case 'k':
                    palavra_criptografada += 'p';
                    break;
                case 'l':
                    palavra_criptografada += 'o';
                    break;
                case 'm':
                    palavra_criptografada += 'n';
                    break;
                case 'n':
                    palavra_criptografada += 'm';
                    break;
                case 'o':
                    palavra_criptografada += 'l';
                    break;
                case 'p':
                    palavra_criptografada += 'k';
                    break;
                case 'q':
                    palavra_criptografada += 'j';
                    break;
                case 'r':
                    palavra_criptografada += 'i';
                    break;
                case 's':
                    palavra_criptografada += 'h';
                    break;
                case 't':
                    palavra_criptografada += 'g';
                    break;
                case 'u':
                    palavra_criptografada += 'f';
                    break;
                case 'v':
                    palavra_criptografada += 'e';
                    break;
                case 'w':
                    palavra_criptografada += 'd';
                    break;
                case 'x':
                    palavra_criptografada += 'c';
                    break;
                case 'y':
                    palavra_criptografada += 'b';
                    break;
                case 'z':
                    palavra_criptografada += 'a';
                    break;
                case ' ':
                    palavra_criptografada += ' ';
                    break;
            }
        }

        System.out.println("Frase criptografada: " + palavra_criptografada);

        String palavra_descriptografada = "";

        for (int j = 0; j < palavra_criptografada.length(); j++) {
            char letra1 = palavra_criptografada.charAt(j);

            switch (letra1) {

                case 'z':
                    palavra_descriptografada += 'a';
                    break;
                case 'y':
                    palavra_descriptografada += 'b';
                    break;
                case 'x':
                    palavra_descriptografada += 'c';
                    break;
                case 'w':
                    palavra_descriptografada += 'd';
                    break;
                case 'v':
                    palavra_descriptografada += 'e';
                    break;
                case 'u':
                    palavra_descriptografada += 'f';
                    break;
                case 't':
                    palavra_descriptografada += 'g';
                    break;
                case 's':
                    palavra_descriptografada += 'h';
                    break;
                case 'r':
                    palavra_descriptografada += 'i';
                    break;
                case 'q':
                    palavra_descriptografada += 'j';
                    break;
                case 'p':
                    palavra_descriptografada += 'k';
                    break;
                case 'o':
                    palavra_descriptografada += 'l';
                    break;
                case 'n':
                    palavra_descriptografada += 'm';
                    break;
                case 'm':
                    palavra_descriptografada += 'n';
                    break;
                case 'l':
                    palavra_descriptografada += 'o';
                    break;
                case 'k':
                    palavra_descriptografada += 'p';
                    break;
                case 'j':
                    palavra_descriptografada += 'q';
                    break;
                case 'i':
                    palavra_descriptografada += 'r';
                    break;
                case 'h':
                    palavra_descriptografada += 's';
                    break;
                case 'g':
                    palavra_descriptografada += 't';
                    break;
                case 'f':
                    palavra_descriptografada += 'u';
                    break;
                case 'e':
                    palavra_descriptografada += 'v';
                    break;
                case 'd':
                    palavra_descriptografada += 'w';
                    break;
                case 'c':
                    palavra_descriptografada += 'x';
                    break;
                case 'b':
                    palavra_descriptografada += 'y';
                    break;
                case 'a':
                    palavra_descriptografada += 'z';
                    break;
                case ' ':
                    palavra_descriptografada += ' ';
                    break;
            }
        }

        System.out.println("Frase descriptografada: " + palavra_descriptografada);

        sc.close();

    }
}
