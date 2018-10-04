package Palíndromo;
import java.util.*;

public class Palíndromo {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String pa;
    Palabra objclass=new Palabra();
    System.out.println("Ingresa la palabra:");
    pa = teclado.nextLine();
        
        if(objclass.palin(pa)){
            System.out.println("La palabra es un palindromo");
        }
        else
        {
            System.out.println("La palabra no es un palindromo");
        }
    }
}
