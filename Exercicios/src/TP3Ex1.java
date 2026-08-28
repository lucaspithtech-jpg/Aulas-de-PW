
import javax.swing.JOptionPane;

public class TP3Ex1 {
    public static void main(String[] args) throws Exception{

        String sCent;
        StringBuilder mensagem = new StringBuilder();

        sCent = JOptionPane.showInputDialog("Digite seu o valor em centímetros:");

        int iCent = Integer.parseInt(sCent);
        double vPol = iCent/2.54;
        double vPes = vPol/12;

        String sPol = String.format("%.2f", vPol);
        String sPes = String.format("%.2f", vPes);

        mensagem.append("O valor em polegadas ").append(sPol).append("!");
        JOptionPane.showMessageDialog(null, mensagem);
        mensagem.setLength(0);
        mensagem.append("O valor em pés ").append(sPes).append("!");
        JOptionPane.showMessageDialog(null, mensagem);

    }

}
