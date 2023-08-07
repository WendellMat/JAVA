package exercicio2.beecrowd;
import java.util.Scanner;

public class QCombustivel1134 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int combustivel, alcool, gasolina, diesel;

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        combustivel = 0;

        while (combustivel != 4) {
            combustivel = sc.nextInt();
            if (combustivel == 1) {
                alcool = alcool + 1;
            } else if (combustivel == 2) {
                gasolina = gasolina + 1;
            } else if (combustivel == 3) {
                diesel = diesel + 1;
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}