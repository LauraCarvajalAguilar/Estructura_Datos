package Ejercicio2;

import Clase.Proceso;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner ing = new Scanner(System.in);
       Random n = new Random(); //Se crea un numero random
       String[] palabras = {"gato", "perro", "caballo", "hamster", "ardilla", "peces"}; //Se escriben las palabras que podran salir en el juego del ahorcado
       int n_azar = n.nextInt(palabras.length); //Se convierte la variable n a intenger
       
       //Se declara el objeto que se usara en el juego
       Proceso cam = new Proceso(); 
       
       cam.Cadena(palabras, n_azar); //Se convierte la cadena string a char
       cam.OcultarCadena(); //Se oculta la palabra
       
       for(int i = 1; i <= 5; i++){
           cam.Juego(ing, i);
           System.out.println(cam.getCadenaJuego());
           cam.Verificacion(i); //Se llama al proceso para verificar el resultado
       }
    }
  }
  
