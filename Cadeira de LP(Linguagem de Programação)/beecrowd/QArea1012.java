import java.util.Scanner;

public class QArea1012 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String valores[] = sc.nextLine().split(" ");

        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);
        double pi = 3.14159;

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        sc.close();
    }
}
