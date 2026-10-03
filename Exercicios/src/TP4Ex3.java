import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TP4Ex3 {
    public static void main(String[] args) throws Exception {
        final JRadioButton button1 = new JRadioButton("Par");
        final JRadioButton button2 = new JRadioButton("Ímpar");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(button1);
        grupo.add(button2);

        JTextField txtNumero = new JTextField(3);

        final JPanel panel = new JPanel();
        panel.add(new JLabel("Sua escolha: "));
        panel.add(button1);
        panel.add(button2);
        panel.add(new JLabel(" Seu número (0 a 10):"));
        panel.add(txtNumero);

        int result = JOptionPane.showConfirmDialog(
            null, 
            panel, 
            "Jogo de Par ou Ímpar", 
            JOptionPane.OK_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE
        );

        if (result == JOptionPane.OK_OPTION) {
            try {
                int jogadaUsuario = Integer.parseInt(txtNumero.getText());
                
                Random random = new Random();
                int jogadaComputador = random.nextInt(11);

                int soma = jogadaUsuario + jogadaComputador;
                boolean somaEhPar = (soma % 2 == 0);
                boolean usuarioEscolheuPar = button1.isSelected();

                boolean usuarioVenceu = (somaEhPar && usuarioEscolheuPar) || (!somaEhPar && !usuarioEscolheuPar);

                StringBuilder mensagem = new StringBuilder();
                mensagem.append("Sua escolha: ").append(usuarioEscolheuPar ? "Par" : "Ímpar").append("\n");
                mensagem.append("Seu número: ").append(jogadaUsuario).append("\n");
                mensagem.append("Número do computador: ").append(jogadaComputador).append("\n");
                mensagem.append("Soma: ").append(soma).append(" (").append(somaEhPar ? "PAR" : "ÍMPAR").append(")\n\n");
                
                if (usuarioVenceu) {
                    mensagem.append(" Parabéns, você VENCEU!");
                } else {
                    mensagem.append(" Que pena, o computador VENCEU!");
                }

                JOptionPane.showMessageDialog(null, mensagem.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

            } 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
