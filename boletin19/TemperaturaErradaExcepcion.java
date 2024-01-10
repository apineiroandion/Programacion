
package boletin19;
import java.util.Scanner;
public class TemperaturaErradaExcepcion {
    Scanner scan=new Scanner(System.in);
    public void temperaturaCentidrados(){
        boolean temperaturaValida=false;
        float temperatura=0f;
        while (!temperaturaValida){
            try{
                System.out.println("Introduce una temperatura mayor de 80º");
                temperatura = Float.parseFloat(scan.nextLine());
                if(temperatura < 80f){
                       throw new IllegalArgumentException("Número fuera de rango.");
                }
            temperaturaValida=true;
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Por favor, intenta de nuevo.");
            }

        }
        float temperaturaC=temperatura;
        float temperaturaF=ConversorTemperaturas.centigradosAFharenheit(temperaturaC);
        float temperaturaR=ConversorTemperaturas.centígradosAReamur(temperaturaC);
        ConversorTemperaturas.mostrarDatos(temperaturaC, temperaturaF, temperaturaR);
    }
}
