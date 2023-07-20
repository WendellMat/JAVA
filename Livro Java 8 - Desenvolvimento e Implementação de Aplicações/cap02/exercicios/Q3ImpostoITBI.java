package cap02.exercicios;
import javax.swing.JOptionPane;

public class Q3ImpostoITBI {
    public static void main(String args[]){
        
        //Declaração de Constantes
        double valorTrans, valorVenal, percImposto, imposto;
        String entrada;
        try {
            //Entrada dos Valores Transacional, venal e a porcentagem do imposto
            entrada = JOptionPane.showInputDialog("Qual é o valor Transacional?");
            valorTrans = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Qual é o valor Venal?");
            valorVenal = Double.parseDouble(entrada);

            entrada = JOptionPane.showInputDialog("Qual é a porcentagem do imposto?");
            percImposto = Double.parseDouble(entrada);

            //Verificação para saber qual o maior valor informado, o venal ou o transacional
            if (valorTrans > valorVenal) {
                imposto = valorTrans * (percImposto / 100);
            } else {
                imposto = valorVenal * (percImposto / 100);
            }

            //Apresentação final da entrada de dados e valor do imposto a ser pago
            JOptionPane.showMessageDialog(null, "O valor de Transação informado foi R$" + valorTrans + "\n"
            + "O valor Venal informado foi R$" + valorVenal + "\n" + "O percentual do imposto informado foi " +
            percImposto + "%\n" + "O valor a ser pago de imposto será R$" + imposto);
        } catch (NumberFormatException erro) {

            //Mensagem de erro caso o usuário entre com algum valor não Numérico
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos"
                    +erro.toString());
        }
        //Finalização do Sistema
        System.exit(0);
    }
}
