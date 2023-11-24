
package boletin16;

public class Boletin16 {

    public static void main(String[] args) {
        Libro libre=new Libro(1,"nome",1900);
        Revista revista=new Revista(2,5,"revista",2004);
        System.out.println(libre.toString());
        System.out.println(revista.toString());
    }
    
}
