package cap03;
import javax.swing.JOptionPane;

public class TryCatch {
    public static void main(String args[]) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º Número:");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º Número:");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        } /*catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        }*/ catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Tecla Cancel pressionada\n" + erro.toString(), "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Fim da Execução");
        }
        System.exit(0);
    }
}
