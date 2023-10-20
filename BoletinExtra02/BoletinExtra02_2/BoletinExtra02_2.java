
package boletinextra02_2;

import java.util.Scanner;

public class BoletinExtra02_2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double a;
        double b;
        double c;
        double discriminante;
        System.out.println("Introduce el parametro a: ");
        a=scan.nextDouble();
        System.out.println("Introduce el parametro b: ");
        b=scan.nextDouble();
        System.out.println("Introduce el parametro c: ");
        c=scan.nextDouble();
        discriminante= (b*b)-(4*a*c);
        while(0 > discriminante){
            System.out.println("El discriminante es menor que 0");
            System.out.println("vuelve a introducir el parametro a: ");
            a=scan.nextDouble();
            System.out.println("vuelve a introducir el parametro b: ");
            b=scan.nextDouble();
            System.out.println("vuelve a introducir el parametro c: ");
            c=scan.nextDouble();
            discriminante= (b*b)-(4*a*c);
        }
        Calculadora calculadora=new Calculadora(a,b,c);
        calculadora.resolverEcuacion(discriminante);
    }
    
}
