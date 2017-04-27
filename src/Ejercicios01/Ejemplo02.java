package Ejercicios01;

import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaracion de contante
        final double IGV = 0.18;
        //Declaracion de variables
        double precio_compra;
        double precio_parcial;
        double precio_neto;
        double monto_igv;
        double cantidad;
        
        //Leer precio de compra unitario
        System.out.print("Ingresa el precio de compra unitario: ");
        precio_compra = sc.nextDouble();
        //Leer la cantidad de compra de dicho prducto
        System.out.print("Ingresa la cantidad: ");
        cantidad = sc.nextDouble();
        
        //Calcular el precio parcial
        precio_parcial = cantidad*precio_compra;
        //Calcula el monto mas IGV
        monto_igv = IGV*precio_parcial;
        //Calcula el monto neto
        precio_neto = precio_parcial + monto_igv;
        
        //Escribir el precio neto
        System.out.println("El precio neto es: " + precio_neto);
    }
    
}
