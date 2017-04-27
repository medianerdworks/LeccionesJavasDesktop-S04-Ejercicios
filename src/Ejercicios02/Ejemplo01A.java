package Ejercicios02;

import java.util.Scanner;

public class Ejemplo01A {
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
        double venta,comision=0;
        String zona;
        System.out.print("Escoja la zona de la venta (Norte, Centro, Sur): ");
        zona = sc.nextLine();
        System.out.print("Ingrese el monto de la venta realizada: ");
        venta = sc.nextDouble();
        
        if (zona.equals("Norte") || zona.equals("norte")) {
            comision=venta*10/100;
        }
        else if(zona.equals("Centro") || zona.equals("centro")){
            comision=venta*15/100;
        }
        else if(zona.equals("Sur") || zona.equals("sur")){
            comision=venta*30/100;
        }
        System.out.println("La comision de la venta es: "+ comision);
 
    }
   
}
