public class TP2Ex04 {
    public static void main(String[] args) throws Exception {
        int[] coresFundo = {40, 41, 42, 43, 44, 45, 46, 47};
        
        int contador = 0;

        while (contador < 32) {
            int indiceCor = contador % 8;
            
            int codigoFundo = coresFundo[indiceCor];
            
            System.out.println((char)27 + "[37;" + codigoFundo + "m                             " + (char)27 + "[0m");
            
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            
            contador++;
        }
    }
}


