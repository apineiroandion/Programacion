
package boletin24;
import Libreria.*;
import datos.LerDatos;
public class Menu {
   static Libreria libreria=new Libreria();
   public static void pintarMenu(){
        int opcion=LerDatos.lerEnteiro("Elixe unha opcion: "
                + "\n1) DAR DE ALTA UN LIBRO"
                + "\n2) VENDER UN LIBRO"
                + "\n3) CONSULTAR UN LIBRO"
                + "\n4) SALIR");
        switch(opcion){
            case 1:
                libreria.añadirLibro();
                pintarMenu();
                break;
            case 2:
                libreria.venderLibros();
                pintarMenu();
                break;
            case 3:
                libreria.consultarUnLibro();
                pintarMenu();
                break;
            case 4:
                break;
            default:
                pintarMenu();
                break;
        }
    }
}
