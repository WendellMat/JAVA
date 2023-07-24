//package cap01;
import javax.swing.JOptionPane;

public class Parabens {
    public static void main(String args[]) {
        String nome, auxString;
        int idade;

        nome = JOptionPane.showInputDialog("Digite seu nome");

        auxString = JOptionPane.showInputDialog("Digite a sua idade");
        idade = Integer.parseInt(auxString);

        JOptionPane.showMessageDialog(null, "Parabéns " + nome + ", pelos seus " + idade + " anos");
    }
}