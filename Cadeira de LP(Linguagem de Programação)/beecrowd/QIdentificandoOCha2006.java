import java.util.Scanner;

public class QIdentificandoOCha2006 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String tipoDeCha = sc.nextLine();
        String respostas[] = sc.nextLine().split(" ");

        System.out.println(ContaRespostasCorretas(respostas, tipoDeCha));

        sc.close();
    }

    public static int ContaRespostasCorretas(String respostas[], String tipoDeCha) {
        int cont = 0;
        for (int i = 0; i < respostas.length; i++) {
            if (respostas[i].equals(tipoDeCha)) {
                cont++;
            }
        }
        return cont;
    }
}