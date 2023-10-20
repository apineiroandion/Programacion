
package boletin07_2;

import java.util.Scanner;

public class Boletin07_2 {

    public static void main(String[] args) {
        
        short num1, num2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1=scan.nextShort();
        System.out.println("Introduce el segundo numero");
        num2=scan.nextShort();
        
        Operacions operacions= new Operacions(num1,num2);
        operacions.facerSumaeResta();
        
    }
    
}
