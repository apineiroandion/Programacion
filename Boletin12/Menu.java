
package boletin12;

import java.util.ArrayList;

public class Menu {
    public static void pintarMenu(ArrayList coches){
        int opcion=LerDatos.lerEnteiro("ELIGE UNA OPCION"
                + "\n1)Aparcar un coche"
                + "\n2)Sacar un coche");
        switch(opcion){
            case 1:
                Garaxe.aparcarCoche(coches);
                pintarMenu(coches);
                break;
            case 2:
                Garaxe.sacarCoche(coches);
                pintarMenu(coches);
                break;
        }
    }
}
