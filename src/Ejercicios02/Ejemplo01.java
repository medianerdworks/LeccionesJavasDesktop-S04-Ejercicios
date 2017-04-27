package Ejercicios02;

import java.util.Scanner;

public class Ejemplo01 {
    ///////////////
    //Segun la zona del vendedor: NORTE, CENTRO, SUR
    //si la venta se realiza en la zona NORTE
    // el vendedor tendra una comision del 10% de su sueldo base
    //Si la venta se realiza en la zona CENTRO
    // el vendedor tendra una comision del 15%
    //Si la venta se realiza en la zona SUR
    // el vendedor tendrá una comisión del 30%
    //Las comisiones obtenidas a partir de un sueldo base.
    ///////////////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double venta,comision;
        int zona;
        System.out.println("Escoja la zona de la venta:");
        System.out.println("1) NORTE");
        System.out.println("2) CENTRO");
        System.out.println("3) SUR");
        System.out.println("");
        System.out.print("Ingrese la opción: ");
        zona = sc.nextInt();
        System.out.print("Ingrese el monto de la venta realizada: ");
        venta = sc.nextDouble();
        
        if (zona==1) {
            comision=venta*10/100;
        }
        else if(zona==2){
            comision=venta*15/100;
        }
        else {
            comision=venta*30/100;
        }
        System.out.println("La comision de la venta es: "+ comision);
 
    }
   
}
