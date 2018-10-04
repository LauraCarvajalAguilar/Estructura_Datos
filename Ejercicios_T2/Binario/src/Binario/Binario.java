package Binario;
import java.util.Scanner;

public class Binario
{
    public static int numero(int n) {
        if (n < 0x2) {
            System.out.print(n);
            System.out.print("");
        } else {
            numero(n / 2);
            System.out.print(n % 2);
            System.out.print("");
        }
        return 0;
    }

    public static void main(String[] x) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int enter = entrada.nextInt();
        System.out.print("En binario es: ");
      
        num = numero(enter);
        System.out.println ("");

    }
}