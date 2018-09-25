package Clase;

import java.util.Arrays;
import java.util.Scanner;

public class Proceso {
    char cadena[];
    char cadenaJuego[];
    char intento;
    String[] palabras;
    
    public char[] getCadena() {
        return cadena;
    }

    public char[] getCadenaJuego() {
        return cadenaJuego;
    }

    public void setCadena(char[] cadena) {
        this.cadena = cadena;
    }

    public void setCadenaJuego(char[] cadenaJuego) {
        this.cadenaJuego = cadenaJuego;
    }
    
    public void Cadena(String[] palabras, int tamaño){
        cadena = palabras[tamaño].toCharArray(); // Se convierte el String a Char.
        cadenaJuego = palabras[tamaño].toCharArray();
    }
    
    public void OcultarCadena(){
        for(int i = 0; i < cadenaJuego.length; i++){
            cadenaJuego[i] = '*';
        }
        System.out.println("Adivina la palabra " + Arrays.toString(cadenaJuego));
    }
    
    public void Juego(Scanner en, int i) {
        System.out.print(i + " .- Intento: ");
        intento = en.next().charAt(0);
          for(int x = 0; x < cadena.length; x++) { //Se verifica la letra ingresada
                if(cadena[x]==intento){
                 cadenaJuego[x] = intento;
                }
           } 
    }
    
    public void Verificacion(int i) {
         if(Arrays.equals(cadena, cadenaJuego)) {  //Se imprimie un mensaje dependiendo del resultado
                System.out.println("\n¡Felicidades! Has adivinado la palabra.");
                 i = 5;
            } else if(i == 5) {
                System.out.println("\nSe te acabaron las oportunidades.");
                System.exit(0);
          }
    }
}
