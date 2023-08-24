import java.util.Scanner;

public class QBuscaNaInternet2413 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cliquesTerceiroLink = Integer.parseInt(sc.nextLine());

        int cliquesPrimeiroLink = (cliquesTerceiroLink * 2) * 2;
        
        System.out.println(cliquesPrimeiroLink);

        sc.close();
    }
}
