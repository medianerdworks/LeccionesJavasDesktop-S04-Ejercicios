package Ejercicios01;

import java.util.Scanner;

public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de contante
        final double PI = 3.14159;
        //Declaracion de variables
        double radio;
        double area;
        
        //Leer radio
        System.out.print("Ingresa el radio del Círculo: ");
        radio = sc.nextDouble();
        
        //Calcular Área
        area = PI*radio*radio;
        
        //Escribir el área
        System.out.println("El área del círculo es: " + area);
    }
    
}
