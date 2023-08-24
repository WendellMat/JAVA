package exercicio3;
import java.util.Scanner;

public class PostoC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double somaValor = 0;
        double menorValor = 0;
        double totais[] = new double[5];

        //Recebimento de litros abastecidos e seus respectivos preços
        for (int k = 0; k < 5; k++) {
            System.out.println("Quantos litros ?");
            double qtdeLitros = Double.parseDouble(leitor.nextLine());
            System.out.println("Qual o preço do litro de gasolina?");
            double precoGasolina = Double.parseDouble(leitor.nextLine());
            double total = qtdeLitros * precoGasolina;
            totais[k] = total;
        }

        //Lógica para descobrir o menor valor pago
        for (int i = 0; i < totais.length; i++) {
            if (totais[i] < menorValor || menorValor == 0) {
                menorValor = totais[i];
            }
        }

        //Lógica para a soma de todos os valores dentro do vetor
        for (int j = 0; j < totais.length; j++) {
            somaValor += totais[j];
        }

        //Apresentação do menor valor e cálculo da média paga após os 5 abastecimentos
        System.out.printf("Menor valor: %.2f\n", menorValor);
        System.out.printf("Média abastecimentos: %.2f\n", somaValor / 5);
        leitor.close();
    }
}