
package boletin21_3;

import java.util.ArrayList;

public class Menu {
    public void pintarMenu(ArrayList<Alumno> alumnos){
        int input=LerDatos.lerEnteiro("Elige una opcion:"
                + "\n1)Crear un alumno"
                + "\n2)Ver aprovados"
                + "\n3)Listar notas en orden");
        switch(input){
            case 1:
                Funciones.crearAlumno(alumnos);
                pintarMenu(alumnos);
            break;
            case 2:
                Funciones.verAlumnosAprovados(alumnos);
                pintarMenu(alumnos);
            break;
            case 3:
                Funciones.listaNotasOrden(alumnos);
                pintarMenu(alumnos);
            break;
            default:
                break;
        }
    }
}
