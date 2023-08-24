import java.util.Scanner;

public class QConsumo1014 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double distancia = Double.parseDouble(sc.nextLine());
        double litros = Double.parseDouble(sc.nextLine());
        double consumo = distancia / litros;

        System.out.printf("%.3f km/l", consumo);

        sc.close();
    }
}
