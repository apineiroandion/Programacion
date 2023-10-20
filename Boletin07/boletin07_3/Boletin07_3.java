
package boletin07_3;

import java.util.Scanner;

public class Boletin07_3 {

    public static void main(String[] args) {
        double input;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el numero");
        input=scan.nextDouble();
        
        Comparador comparador=new Comparador(input);
        comparador.hacerComparacion();
    }
    
}
