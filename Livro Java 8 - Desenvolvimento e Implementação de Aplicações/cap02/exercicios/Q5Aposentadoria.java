package cap02.exercicios;
import javax.swing.JOptionPane;

public class Q5Aposentadoria {
    public static void main(String args[]) {

        //Declaração de variáveis
        String aux, sexo;
        int idade, contribuicao, idadeRest, contribRest;
        
        //Entrada do sexo e conversão da entrada para caixa alta
        sexo = JOptionPane.showInputDialog("Digite seu sexo (M ou F)");
        sexo = sexo.toUpperCase();

        //Entra nessa condição apenas se o usuário tenho se identificado com um sexo válido
        if (sexo.equals("M") || sexo.equals("F")) {

            //O usuário entra com a idade
            aux = JOptionPane.showInputDialog("Qual a sua idade?");
            idade = Integer.parseInt(aux);

            //O usuário entra com os anos contribuídos
            aux = JOptionPane.showInputDialog("Quantos anos de contribuição você possui?");
            contribuicao = Integer.parseInt(aux);

            //Entra nessa condição se o sexo informado foi M(Masculino)
            if (sexo.equals("M")) {

                //Se a idade for maior ou igual a 65 ou os anos de contribuição forem maior ou igual a 35
                if (idade >= 65 || contribuicao >= 35) {
                    JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria");

                //Se não, acontece o cálculo para saber quanto tempo falta e apresenta ao usuário
                } else {
                    idadeRest = 65 - idade;
                    contribRest = 35 - contribuicao;

                    JOptionPane.showMessageDialog(null, "Você ainda não tem direito a aposentadoria \n" 
                    + "Faltam " + idadeRest + " anos de idade para você poder se aposentar \n"
                    + "Ou " + contribRest + " anos de contribuição");
                }

            //Entra nessa condição se o sexo informado foi F(Feminino)
            } else {

                //Se a idade for maior ou igual a 60 ou os anos de contribuição forem maior ou igual a 30
                if (idade >= 60 || contribuicao >= 30) {
                    JOptionPane.showMessageDialog(null, "Você já tem direito a aposentadoria");
                
                //Se não, acontece o cálculo para saber quanto tempo falta e apresenta ao usuário
                } else {
                    idadeRest = 60 - idade;
                    contribRest = 30 - contribuicao;

                    JOptionPane.showMessageDialog(null, "Você ainda não tem direito a aposentadoria \n" 
                    + "Faltam " + idadeRest + " anos de idade para você poder se aposentar \n"
                    + "Ou " + contribRest + " anos de contribuição");
                }
            }
        
        //Acontece quando o usuário entra com um sexo não válido
        } else {
            JOptionPane.showMessageDialog(null, "A entrada foi diferente do esperado");
        }
    }
}