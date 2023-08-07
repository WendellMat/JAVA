/*package exercicio2.beecrowd;
import java.util.Scanner;

public class QNumeroPrimo1165 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, num;

        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int count = 0;
            num = (sc.nextInt());
            if (num == 2 || num == 1) {
                System.out.println("É primo");
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("É primo");
                } else {
                    System.out.println("Não é primo");
                }
            }
        }
    }
}*/

package exercicio2.beecrowd;
import java.util.Scanner;
public class QNumeroPrimo1165 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = Integer.parseInt(leitor.nextLine());
        for (int k=0; k<n; k++) {
            int num = Integer.parseInt(leitor.nextLine());
            boolean ehPrimo = true;
            for (int j=2; j<num; j++) {
                if (num % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.printf("%d eh primo\n", num);
            } else {
                System.out.printf("%d nao eh primo\n", num);
            }
        }
        leitor.close();
    }
}