package cap02.exercicios;
import javax.swing.JOptionPane;

public class Q3ImpostoITBI {
    public static void main(String args[]){
        double valorTrans, valorVenal, percImposto, imposto;
        String entrada;
        try {
            entrada = JOptionPane.showInputDialog("Qual é o valor Transacional?");
            valorTrans = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Qual é o valor Venal?");
            valorVenal = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Qual é a porcentagem do imposto?");
            percImposto = Double.parseDouble(entrada);

            if (valorTrans > valorVenal) {
                imposto = valorTrans * (percImposto / 100);
            } else {
                imposto = valorVenal * (percImposto / 100);
            }

            JOptionPane.showMessageDialog(null, "O valor de Transação informado foi R$" + valorTrans + "\n"
            + "O valor Venal informado foi R$" + valorVenal + "\n" + "O percentual do imposto informado foi " +
            percImposto + "%\n" + "O valor a ser pago de imposto será R$" + imposto);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos"
                    +erro.toString());
        }
    }
}
