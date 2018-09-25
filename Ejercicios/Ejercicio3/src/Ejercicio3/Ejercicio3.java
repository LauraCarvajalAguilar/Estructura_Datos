package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int x;
        int op;
        do {
           System.out.println("\n*Operaciones*\n");
           System.out.println("1.- Cero");
           System.out.println("2.- Sucesor");
           System.out.println("3.- Es cero");
           System.out.println("4.- Igual");
           System.out.println("5.- Suma");
           System.out.println("6.- Antecesor");
           System.out.println("7.- Diferencia");
           System.out.println("8.- Menor");
           System.out.println("\nElige una opcion: ");
           op = teclado.nextInt();
           System.out.println("Ingrese un numero natural: ");
           x = teclado.nextInt();
           
           NumNat ob1=new NumNat(x);
           if(op == 1){
                System.out.println(ob1.Cero());      
           }
           else if(op == 2){
               System.out.println("El numero sucesor de " +x+ " es: " + ob1.Sucesor());
           }
           else if (op ==3){
               System.out.println(ob1.EsCero());
           }
           else if (op ==4){
               int a;
               System.out.println("Ingrese un nuevo numero: ");
               a=teclado.nextInt();
               System.out.println("El numero " +x+ ob1.Igual(a) + " a "+ a );
           }
           else if (op ==5){
               int b;
               System.out.println("Ingrese un numero: ");
               b=teclado.nextInt();
               System.out.println("La suma de los numeros es: "+ ob1.Suma(b));
           }
           else if (op ==6){
                System.out.println("El numero antecesor de "+x+" es: " + ob1.Antecesor());
           }
           else if (op ==7){
               int c;
               System.out.println("Ingrese un nuevo numero: ");
               c=teclado.nextInt();
               System.out.println("La diferencia de " +x+ " es: " + ob1.Diferencia(c));
           }
           else if (op ==8){
               int d;
               System.out.println("Ingrese un nuevo numero: ");
               d=teclado.nextInt();
               System.out.println("El numero " +x+ ob1.Menor(d)+ " a " + d);
           }
        }while(op!=8);
    }
 }
