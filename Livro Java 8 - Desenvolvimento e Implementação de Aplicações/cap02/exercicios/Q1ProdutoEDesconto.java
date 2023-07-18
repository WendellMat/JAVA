package cap02.exercicios;
import java.io.*;
public class Q1ProdutoEDesconto {
    public static void main(String args[]) {
        String d;
        double valorproduto, desconto, valordodesconto, valorcomdesconto;
        BufferedReader dado;
        try {
            System.out.println("Digite o valor do produto");
            dado = new BufferedReader (new InputStreamReader(System.in));
            d = dado.readLine();
            valorproduto = Double.parseDouble(d);

            System.out.println("Digite o desconto que você deseja em porcentagem");
            dado = new BufferedReader (new InputStreamReader(System.in));
            d = dado.readLine();
            desconto = Double.parseDouble(d);

            valordodesconto = valorproduto * (desconto/100);
            valorcomdesconto = valorproduto - valordodesconto;
            System.out.println("O valor do produto é R$" + valorproduto);
            System.out.println("O desconto que você solicitou foi de " + desconto + "%");
            System.out.println("O desconto em reais dá um total de R$" + valordodesconto);
            System.out.println("O valor final do produto com o desconto aplicado é de R$" + valorcomdesconto);
        } catch (IOException erro) {
            System.out.println("Houve erro na entrada de dados" + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos" + erro.toString());
        }
    }
}
