
package boletin07_4;

import java.util.Scanner;

public class Boletin07_4 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        String nombre;
        String nombre2;
        System.out.println("Intruduce el nombre de la primera persona: ");
        nombre=scan.nextLine();
        System.out.println("Intruduce el peso de la primera persona: ");
        Persoas persoaUn=new Persoas(scan.nextFloat(),nombre);
        System.out.println("Intruduce el nombre de la segunda persona: ");
        nombre2=scan2.nextLine();
        System.out.println("Intruduce el peso de la segunda persona: ");
        Persoas persoaDous=new Persoas(scan.nextFloat(),nombre2);
        
        if(persoaUn.peso>persoaDous.peso){
            System.out.println(persoaUn.nombre+" pesa "+(persoaUn.peso-persoaDous.peso)+" mais que "+persoaDous.nombre);
        }
        else if(persoaUn.peso<persoaDous.peso){
            System.out.println(persoaDous.nombre+" pesa "+(persoaDous.peso-persoaUn.peso)+" mais que "+persoaUn.nombre);
        }
        else{
            System.out.println("Pesan o mesmno");
        }
    }
    
}
