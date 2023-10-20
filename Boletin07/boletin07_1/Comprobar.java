
package boletin07_1;

import java.util.Scanner;

public class Comprobar {
     
    public void comprobarNumero(){
        double input;
        Scanner scan = new Scanner(System.in);
        System.out.println("introduce el numero:");
        input=scan.nextDouble();
        if(input>0){
                System.out.println(input + " es positivo");
            }
        else{
            System.out.println("es negativo");
            
        }
    }
}
