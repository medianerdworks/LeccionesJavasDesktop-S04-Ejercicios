package Ejercicios01;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Ejemplo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int a;
        int n;
        int P;
        
        //Leer a
        System.out.print("Ingresa la base a: ");
        a = sc.nextInt();
        //Leer n
        System.out.print("Ingresa la potencia n: ");
        n = sc.nextInt();
        
        //Calcular la potencia
        P = (int) pow(a,n);
        
        //Escribir P
        System.out.println("la potencia de " + a + " elevado a la " + n + " es: " + P);
    }
    
}
