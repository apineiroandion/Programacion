
package boletin16;

public class Menu {
    public static void pintarMenu(Biblioiteca biblioteca){
        int index=LerDatos.lerEnteiro("Introduce la opcion: "
                + "\n1)AÑADIR LIBRO"
                + "\n2)AÑADIR REVISTA"
                + "\n3)VER DATOS");
    switch(index){
        case 1:
            biblioteca.añadirLibro();
            Menu.pintarMenu(biblioteca);
            break;
        case 2:
            biblioteca.añadirRevista();
            Menu.pintarMenu(biblioteca);
            break;
        case 3:
            biblioteca.verDatos();
            Menu.pintarMenu(biblioteca);
            break;
        default:
            Menu.pintarMenu(biblioteca);
            break;
    }
    }

}
