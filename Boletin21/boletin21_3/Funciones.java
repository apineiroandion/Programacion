
package boletin21_3;
import java.util.*;
import java.util.ArrayList;

public class Funciones {
    Scanner scan=new Scanner(System.in);
    public static void crearAlumno(ArrayList<Alumno> alumnos){
        String nombre=LerDatos.lerString("Introduce el nombre");
        Integer nota=LerDatos.lerEnteiro("Introduce su nota");
        alumnos.add(new Alumno(nombre,nota));
    }
    public void verNota(ArrayList<Alumno> alumnos){
        System.out.println("Introduce el identificados del alumno del que quieres verla nota:");
        for(int i=0;i<alumnos.size();i++){
            System.out.println((i+1)+") "+alumnos.get(i).getNombre());
        }
        int choice;
        choice = scan.nextInt();
        
        System.out.println("La nota de "+ alumnos.get(choice).getNombre()+ 
                " es " + alumnos.get(choice).getNota());
        
    }
    
    public static void verAlumnosAprovados(ArrayList<Alumno> alumnos){
        for(int i=0; i<alumnos.size();i++){
            if(alumnos.get(i).getNota()>=5) System.out.println(alumnos.get(i).getNombre()+" "
                    +alumnos.get(i).getNota());
        }
    }
    
    public static ArrayList<Alumno> listaNotasOrden(ArrayList<Alumno> alumnos){
        ArrayList<Alumno> ordenados=new ArrayList();
        for(int i=0;i<alumnos.size();i++){
            if (alumnos.get(i).getNota()>alumnos.get(i-1).getNota()){
                ordenados.add(alumnos.get(i));
            }
        else{
            for(int c=0;c<ordenados.size();c++){
                if(alumnos.get(i).getNota()<ordenados.get(c).getNota())
                    ordenados.add(c-1, alumnos.get(i));
                }
            }
        }
        return ordenados;
    }
}
