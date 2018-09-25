package Ejercicio3;

public class NumNat {
    int n;
    NumNat (int x) {
    this.n=x;
}
    int Cero() {
        n=0;
        return n;
}
    int Sucesor() {
        n++;
        return n;
}
    int Antecesor() {
        n--;
        return n;
}
   String EsCero()
{
    String ce;
       if (n==0)
           ce= "Es cero";
       else 
           ce= "No es cero";
       return ce;
   }
   String Igual (int x)
   {
       String i;
       if (n==x)
           i= " es igual";
       else
           i= " no es igual";
       return i;
   }
   int Suma (int x){
       int s;
       s= n+x;
       return s;
   }
   String Menor (int x){
       String m;
       if (n<x){
           m= " es menor3";
       }
       else 
           m= " es mayor";
       return m;
   }
   int Diferencia(int x){
       int d;
       d= n-x;
       return d;
   }
}
