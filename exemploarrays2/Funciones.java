
package exemploarrays2;

public class Funciones {
    public static String[] diasSemana={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    
    public static void verDia(int dia){
        if(dia>0 && dia<=7) System.out.println(diasSemana[dia-1]);
        else Funciones.verDia(dia=LerDatos.lerEnteiro("Introduce un valor valido"));
    }
}
