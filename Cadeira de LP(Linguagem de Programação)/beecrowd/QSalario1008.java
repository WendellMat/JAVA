import java.util.Scanner;

public class QSalario1008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, horas;
        double valorHora, salario;

        num = Integer.parseInt(sc.nextLine());
        horas = Integer.parseInt(sc.nextLine());
        valorHora = Double.parseDouble(sc.nextLine());
        salario = horas * valorHora;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);
        sc.close();
    }
}