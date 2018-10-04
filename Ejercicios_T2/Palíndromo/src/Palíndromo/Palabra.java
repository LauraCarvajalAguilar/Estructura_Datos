package Palíndromo;

public class Palabra {
    public boolean palin(String cadena) {
    if (cadena.length() <= 1) {
        return true;
    } else {
        if (cadena.charAt(0) == cadena.charAt(cadena.length() - 1)) {
            return palin(cadena.substring(1, cadena.length() - 1));
        } else {
            return false;
        }
    }
  }
}
