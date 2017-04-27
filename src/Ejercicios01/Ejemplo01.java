package Ejercicios01;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        int nota1;
        int nota2;
        double promedio; 
        
        //Leer nota 1
        System.out.print("Ingresa la nota 1: ");
        nota1 = sc.nextInt();
        //Leer nota 2
        System.out.print("Ingresa la nota 2: ");
        nota2 = sc.nextInt();
        
        //Calcular el promedio
        promedio = (nota1 + nota2)/2.0;
        
        //Escribir Promedio
        System.out.println("El promedio es: " + promedio);
    }
    
}
