package exercicio3;
import java.util.Scanner;

public class MenorValorAtravesDeUmMetodo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores você deseja como entrada?");

        int quantValores = Integer.parseInt(sc.nextLine());
        double valores[] = new double[quantValores];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = Double.parseDouble(sc.nextLine());
        }

        System.out.println("O menor valor é " + menorValor(valores));

        sc.close();
    }

    public static double menorValor(double valores[]) {
        double menor = 0;

        for (int k = 0; k < valores.length; k++) {
            if (valores[k] < menor || menor == 0) {
                menor = valores[k];
            }
        }

        return menor;
    }
}