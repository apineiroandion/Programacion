
package extracondicionais_3;

import java.util.Scanner;

public class ExtraCondicionais_3 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("introduce el numero de alumnos");
        CalculadoraDePrecios obx=new CalculadoraDePrecios();
        obx.calcularPrecio(scan.nextInt());
    }
    
}
