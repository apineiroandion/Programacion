
package boletin2_4;

import java.util.Scanner;

public class Boletin2_4 {
    public static void main(String[] args) {
        float numeroUno;
        float numeroDos;
        float suma;
        float resta;
        float producto;
        float cociente;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        numeroUno=scan.nextFloat();
        System.out.println("Introduce el segundo numero");
        numeroDos=scan.nextFloat();
        suma=numeroUno+numeroDos;
        resta=numeroUno-numeroDos;
        producto=numeroUno*numeroDos;
        cociente=numeroUno/numeroDos;
        System.out.println("Las operaciones realizadas con ambos numeros son:" +
        "\nSuma: "+suma +
        "\nResta: "+resta+
        "\nProducto "+producto+
        "\nCociente "+cociente);
        //Tamen se pode facer como nos exemplos anteriores e non declarar as variables das operaciones
        //faise directamente o calculo no println
    }
    
}
