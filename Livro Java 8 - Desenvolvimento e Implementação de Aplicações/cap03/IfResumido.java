package cap03;
import javax.swing.JOptionPane;

public class IfResumido {
    public static void main(String args[]) {
        int a, b, maior;

        a = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Forneça outro número"));

        maior = (a > b) ? a : b;
        JOptionPane.showMessageDialog(null, "Usando um if resumido, o seu maior número é: " + maior);
    }
}
