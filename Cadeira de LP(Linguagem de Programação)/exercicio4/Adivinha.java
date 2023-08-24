import java.util.Scanner;

public class Adivinha {

	public static int sorteiaNumeroInteiro(int maximo) {
		int x = (int) (Math.random()*(maximo+1));
		return x;
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int maxNum = 100;
        int pontos = 100;
		int y = sorteiaNumeroInteiro(maxNum);
		boolean acertou = false;
		int tentativas = 0;
		while(!acertou) {
			System.out.println("Tente adivinhar y [0-" + maxNum + "]:");
			int numLido = Integer.parseInt(leitor.nextLine());
			tentativas++;
			if (numLido ==y) {
				System.out.println("Parabéns! Você acertou. Número de tentativas:"+tentativas);
                System.out.println("Você obteve " + pontos + " pontos");
				acertou = true;
			} else {
                pontos = pontos - 2;
				System.out.println("Errou! Tente novamente");
                if (numLido < y) {
                    System.out.println("É maior");
                } else {
                    System.out.println("É menor");
                }
			}
		}
		leitor.close();
	}

}