package cap02;
public class OperadoresAritmeticos {
    public static void main(String args[]) {
        //Declaração e inicialização de Variáveis
        int x = 10;
        int y = 3;
        //Várias Operações com as Variáveis
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
        System.out.println("-X = " + (-x));
        System.out.println("-Y = " + (-y));
        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X/Y = " + (x/y));
        System.out.println("Y/X = " + (y/x));
        System.out.println("Resto da divisão de X por Y: " + (x%y));
        System.out.println("Resultado da divisão inteira de X por Y: " + (int) (x/y));
        System.out.println("X + 1 = " + (++x));
    }
}
