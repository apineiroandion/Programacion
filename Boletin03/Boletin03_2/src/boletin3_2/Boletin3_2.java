
package boletin3_2;
import java.util.Scanner;
public class Boletin3_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        float gradosC,gradosF,gradosK;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce los grados celsius(Cº):");
        gradosC=scan.nextFloat();
        gradosF=((gradosC*9f)/5f)+32f;
        gradosK=gradosC+273.15f;
        System.out.println(gradosC+"ºC son "+gradosF+"ºF y "+gradosK+"ºK");
    }
    
}
