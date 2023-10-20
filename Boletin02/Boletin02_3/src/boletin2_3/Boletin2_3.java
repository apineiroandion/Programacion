package boletin2_3;
import java.util.Scanner;
public class Boletin2_3 {
    public static void main(String[] args) {
        float euros;
        float dolares;
        final float conversion=1.06f;
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros que quieres convertir: ");
        euros=scan.nextFloat();
        dolares=euros*conversion;
        System.out.println(euros+"euros son "+dolares+"dolares");
        //TAMEN
        //asi non declaramos dolares
        //System.out.println(euros+"euros son "+euros*conversion"dolares");
    }
    
}
