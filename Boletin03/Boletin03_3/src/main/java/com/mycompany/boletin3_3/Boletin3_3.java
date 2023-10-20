package com.mycompany.boletin3_3;
import java.util.Scanner;
public class Boletin3_3 {

    public static void main(String[] args) {
       int billete100=0;
       int billete20=0;
       int billete5=0;
       int moneda1=0;
       int totalDinero;
       Scanner scan=new Scanner(System.in);
       System.out.println("Introduce dinero: ");
       System.out.println("1) 100€ ");
       System.out.println("2) 20€");
       System.out.println("3) 5€");
       System.out.println("4) 1€");
       System.out.println("Dejar de meter dinero");
       int i=0;
       while(i!=5){
        i=scan.nextInt();
        switch(i){
            case 1 -> {
                billete100++;
                System.out.println("billete de 100 añadido ");
                break;
               }
            case 2 -> {
                billete20++;
                System.out.println("billete de 20 añadido ");
                break;
               }
            case 3 -> {
                billete5++;
                System.out.println("billete de 5 añadido ");
                break;
               }
            case 4 -> {
                moneda1++;
                System.out.println("monedade 1 añadida ");
                break;
               }
            case 5 -> {
                totalDinero=(billete100*100)+(billete20*20)+(billete5*5)+(moneda1*1);
                System.out.println("Has introducido "+totalDinero+"€");
                break;
               }
            default -> {
                break;
               }
        }
        }

    }
}
