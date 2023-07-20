package cap02.exercicios;
import javax.swing.JOptionPane;

public class Q4Media {
    public static void main(String args[]) {

        //Declaração de Constantes
        double media, nota1, nota2, notaTrab;
        String notaaux, resultado;

        try {
            //Entrada das Notas
            notaaux = JOptionPane.showInputDialog("Digite a nota da primeira prova");
            nota1 = Double.parseDouble(notaaux);

            notaaux = JOptionPane.showInputDialog("Digite a nota da segunda prova");
            nota2 = Double.parseDouble(notaaux);

            notaaux = JOptionPane.showInputDialog("Digite a nota do trabalho");
            notaTrab = Double.parseDouble(notaaux);

            //Cálculo da Média
            media = (nota1 + nota2 + notaTrab) / 3;

            //Verificação para o resultado de aprovado ou reprovado
            if (media >= 6) {
                resultado = "APROVADO";
            } else {
                resultado = "REPROVADO";
            }

            //Arredandamento da média para apenas duas casa decimais ou menos, se possível
            media = (double) Math.round(media * 100) / 100;

            //Apresentação final da entrada de dados e resultado final do aluno
            JOptionPane.showMessageDialog(null, "A nota da primeira prova foi " + nota1 + "\n"
            + "A nota da segunda prova foi " + nota2 + "\n" + "A nota do trabalho prova foi " + notaTrab +
            "\n" + "A média das três notas é igual a " + media + "\n" + "Você foi " + resultado);
        } catch (NumberFormatException erro) {

            //Mensagem de erro caso o usuário entre com algum valor não Numérico
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas caracteres numéricos" + erro.toString());
        }
        //Finalização do Sistema
        System.exit(0);
    }
}