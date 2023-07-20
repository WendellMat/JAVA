package cap02.exercicios;
import java.util.*;
public class Q2PontosEVitorias {
    public static void main(String args[]) {
        String vitoriasString;
        int liderpts, lanternapts, vitorias;
        float vitoriasFloat, liderptsFloat, lanternaptsFloat;
        double vitoriasdb;
        Scanner sc;
        try {
            System.out.println("Digite a pontuação do líder do campeonato");
            sc = new Scanner(System.in);
            liderpts = sc.nextInt();
            liderptsFloat = (float) liderpts;

            System.out.println("Digite a pontuação do time Lanterna");
            sc = new Scanner(System.in);
            lanternapts = sc.nextInt();
            lanternaptsFloat = (float) lanternapts;

            vitoriasFloat = (liderptsFloat - lanternaptsFloat) / 3;
            vitoriasString = String.valueOf(vitoriasFloat);
            vitoriasdb = Math.ceil(Double.parseDouble(vitoriasString));
            vitorias = (int) vitoriasdb;
            System.out.println("O número de vitórias para que o time lanterna alcance o líder do campeonato é " + vitorias);
        } catch (NumberFormatException erro) {
            System.out.println("Houve erro na conversão, digite apenas caracteres numéricos");
        }
    }
}
