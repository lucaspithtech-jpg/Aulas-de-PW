public class TP6Ex6 {
    public static void main(String[] args) throws Exception{
        int[] meuVetor = new int[5];
        int valor = 44;

        atribuirValor(meuVetor, valor);

        for (int elemento : meuVetor) {
            System.out.print(elemento + " ");
        }

    }
    public static void atribuirValor(int[] vetor, int valor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = valor;
        }
    }
    

}
