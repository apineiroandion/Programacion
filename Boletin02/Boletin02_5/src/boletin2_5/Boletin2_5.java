package boletin2_5;
import java.util.Scanner;
public class Boletin2_5 {
    public static void main(String[] args) {
        float numeroDeMillas;
        float metros;
        final float FACTORDECONVERSION=1852;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el numero de millas:" );
        numeroDeMillas=scan.nextFloat();
        metros=numeroDeMillas*FACTORDECONVERSION;
        System.out.println(numeroDeMillas+" millas,son: "+metros+" metros");
    }
    
}
