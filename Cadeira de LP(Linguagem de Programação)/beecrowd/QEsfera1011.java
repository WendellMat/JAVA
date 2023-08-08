import java.util.Scanner;

public class QEsfera1011 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double raio = Double.parseDouble(sc.nextLine());

        double volume = (4.0/3) * 3.14159 * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", volume);
        sc.close();
    }
}
