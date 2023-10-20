
package boletinextra2_1;

import java.util.Scanner;

public class BoletinExtra2_1 {

    public static void main(String[] args) {
       float precioSenIva;
       System.out.println("Indroduce el precio: ");
       Scanner scan=new Scanner(System.in);
       precioSenIva=scan.nextFloat();
       Producto producto=new Producto(precioSenIva);
       producto.setPrecioSenIva(precioSenIva);
       producto.mostrarPrecioConIva();
       
    }
    
}
