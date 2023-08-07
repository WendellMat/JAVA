package exercicio2.beecrowd;
import java.util.Scanner;

class QParOuImpar1074 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, num;

        N = Integer.parseInt(sc.nextLine());
        if (N < 10000) {
            for (int cont=1; cont<=N; cont++) {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.println("EVEN POSITIVE");
                    } else {
                        System.out.println("ODD POSITIVE");
                    }
                } else if (num < 0) {
                    if (num % 2 == 0) {
                        System.out.println("EVEN NEGATIVE");
                    } else {
                        System.out.println("ODD NEGATIVE");
                    }
                } else {
                    System.out.println("NULL");
                }
            }
        }
    }
}