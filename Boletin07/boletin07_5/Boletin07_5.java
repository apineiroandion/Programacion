
package boletin07_5;

import java.util.Scanner;

public class Boletin07_5 {

    public static void main(String[] args) {
        int num1, num2,num3;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        num1=scan.nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2=scan.nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3=scan.nextInt();
        
        ComparadorDeNumeros comparador=new ComparadorDeNumeros();
        comparador.comparador(num1, num2, num3);
    }
    
}
