package cap03;
import javax.swing.*;

public class IfComElse {
    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog("Forneça o número do mês");
        String mesVigente = "";
        
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                switch (mes) {
                    case 1:
                        mesVigente = String.valueOf("Janeiro");
                        break;
                    case 2:
                        mesVigente = String.valueOf("Fevereiro");
                        break;
                    case 3:
                        mesVigente = String.valueOf("Março");
                        break;
                    case 4:
                        mesVigente = String.valueOf("Abril");
                        break;
                    case 5:
                        mesVigente = String.valueOf("Maio");
                        break;
                    case 6:
                        mesVigente = String.valueOf("Junho");
                        break;
                    case 7:
                        mesVigente = String.valueOf("Julho");
                        break;
                    case 8:
                        mesVigente = String.valueOf("Agosto");
                        break;
                    case 9:
                        mesVigente = String.valueOf("Setembro");
                        break;
                    case 10:
                        mesVigente = String.valueOf("Outubro");
                        break;
                    case 11:
                        mesVigente = String.valueOf("Novembro");
                        break;
                    case 12:
                        mesVigente = String.valueOf("Dezembro");
                        break;
                    }
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null, "Número do mês válido!\n" + mesVigente);
                } else {
                    JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros " + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação Cancelada.");
        }
        System.exit(0);
    }
}