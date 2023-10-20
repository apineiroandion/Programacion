
package extracondicionais_3;

public class CalculadoraDePrecios {
    public void calcularPrecio(int nalumnos){
        if(nalumnos<30) System.out.println("O autobus custa 4000€ e cada alumno debe pagar "+(4000/30f)+"€");
        else if(nalumnos>=30 && nalumnos<50) System.out.println("O autobus custa "+(nalumnos*95f)+"€ e cada alumno debe pagar "+((nalumnos*95f)/nalumnos)+"€");
        else if(nalumnos>=50 && nalumnos<100) System.out.println("O autobus custa "+(nalumnos*70f)+"€ e cada alumno debe pagar "+((nalumnos*70f)/nalumnos)+"€");
        else if(nalumnos>=100) System.out.println("O autobus custa "+(nalumnos*65f)+"€ e cada alumno debe pagar "+((nalumnos*65f)/nalumnos)+"€");
    }
}
