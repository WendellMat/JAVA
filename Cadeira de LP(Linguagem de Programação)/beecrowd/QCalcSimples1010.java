import java.util.Scanner;

public class QCalcSimples1010 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String peca1 = sc.nextLine();
        String peca1Array[] = peca1.split(" ");
        String peca2 = sc.nextLine();
        String peca2Array[] = peca2.split(" ");

        double total1 = Double.parseDouble(peca1Array[1]) * Double.parseDouble(peca1Array[2]);
        double total2 = Double.parseDouble(peca2Array[1]) * Double.parseDouble(peca2Array[2]);
        double total = total1 + total2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}