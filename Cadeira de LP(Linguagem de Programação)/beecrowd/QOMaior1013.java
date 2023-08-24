import java.util.Scanner;

public class QOMaior1013 {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        String valores[] = sc.nextLine().split(" ");

        int A = Integer.parseInt(valores[0]);
        int B = Integer.parseInt(valores[1]);
        int C = Integer.parseInt(valores[2]);

        if (A > B && A > C) {
            System.out.println(A + " eh o maior");
        } else if (B > C) {
            System.out.println(B + " eh o maior");
        } else {
            System.out.println(C + " eh o maior");
        }

        sc.close();
    }
}