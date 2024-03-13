import javax.swing.*;

public class Menu {
    public static void pintarMenu(Libreria lib){
        int opcion = LerDatos.lerEnteiro("Elige la opcion:" +
                "\n1) Añadir Libro" +
                "\n2) Consultar libro" +
                "\n3) Amosar Libro" +
                "\n4) Borrar Libro" +
                "\n5) Modificar Precio" +
                "\n6) Guardar Datos" +
                "\n7) Cargar Datos");
        switch (opcion){
            case 1:
                lib.engadirLibro(LerDatos.lerString("Introduce el nombre:"),
                        LerDatos.lerString("Introduce el nombre del autor"),
                        LerDatos.lerFloat("Introduce el precio:"),
                        LerDatos.lerEnteiro("Introduce el numero de unidades"));
                pintarMenu(lib);
                break;
            case 2:
                String titulo = LerDatos.lerString("Introduce o libro a consultar:");
                lib.consultarLibro(titulo);
                pintarMenu(lib);
                break;
            case 3:
                lib.amosarLibros();
                pintarMenu(lib);
                break;
            case 4:
                lib.borrarLibros();
                pintarMenu(lib);
                break;
            case 5:
                lib.modificarPrecio();
                pintarMenu(lib);
                break;
            case 6:
                lib.guardarDatos(lib);
                pintarMenu(lib);
                break;
            case 7:
                lib = lib.cargarDatos(lib);
                pintarMenu(lib);
                break;
        }
    }
}
