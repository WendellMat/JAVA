package exercicio2.beecrowd;
import java.util.Scanner;

class QFibonacci1151 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        int n1 = 0, n2 = 1;
        
        if (0 < N && N < 46) {
            for (int cont=1; cont<=N; cont++) {
                if (cont == N) {
                    System.out.println(n1);
                } else {
                    System.out.print(n1 + " ");
                    int n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }
            }
        }
        sc.close();
    }
}