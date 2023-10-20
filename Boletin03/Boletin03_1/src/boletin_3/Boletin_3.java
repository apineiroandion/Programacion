
package boletin_3;
import java.util.Scanner;
public class Boletin_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        float prezoTarifa,prezoPagado,totalDescontado,porcentaxeDescontado;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el precio de la tarifa:");
        prezoTarifa=scan.nextFloat();
        System.out.println("Introduce el precio pagado:");
        prezoPagado=scan.nextFloat();
        totalDescontado=prezoTarifa-prezoPagado;
        porcentaxeDescontado=(totalDescontado*100)/prezoTarifa;
        System.out.println("Te han descontado el "+porcentaxeDescontado+"%");
    }
    
}
