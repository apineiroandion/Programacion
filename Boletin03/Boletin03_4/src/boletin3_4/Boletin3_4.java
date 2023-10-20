package boletin3_4;
import java.util.Scanner;
public class Boletin3_4 {
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidadIntroducida;
        int billete100=0;
        int billete20=0;
        int billete5=0;
        int moneda1=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce una cantidad");
        cantidadIntroducida=scan.nextInt();
        if(cantidadIntroducida!=0){
            while(cantidadIntroducida>100){
                billete100++;
                cantidadIntroducida=cantidadIntroducida-100;     
            }
            while(cantidadIntroducida<100 && cantidadIntroducida>20){
                billete20++;
                cantidadIntroducida=cantidadIntroducida-20;     
            }
            while(cantidadIntroducida<20 && cantidadIntroducida>5){
                billete5++;
                cantidadIntroducida=cantidadIntroducida-5;     
            }
            while(cantidadIntroducida<5 && cantidadIntroducida>1){
                moneda1++;
                cantidadIntroducida=cantidadIntroducida-1;     
            }
        System.out.println("Has introducido: ");
        System.out.println(billete100+" billetes de 100€");
        System.out.println(billete20+" billetes de 20€");
        System.out.println(billete5+" billetes de 5€");
        System.out.println(moneda1+" monedas de 1€");
        
        
        
        }
        System.out.println("Has introducido: ");
        System.out.println(billete100+" billetes de 100€");
        System.out.println(billete20+" billetes de 20€");
        System.out.println(billete5+" billetes de 5€");
        System.out.println(moneda1+" monedas de 1€");
        
        
    }
    
     
    
}
