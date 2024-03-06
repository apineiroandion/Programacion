
package repasoserializacion;

public class Menu {
    public static void pintarMenu(GestorTareas gestor){
        int opcion = LerDatos.lerEnteiro("Elige una opcion: "
                + "\n1) AÑADIR TAREA"
                + "\n2) COMPLETAR TAREAS"
                + "\n3) GUARDAR DATOS"
                + "\n4) CARGAR DATOS"
                + "\n5) VER TAREAS");
        switch(opcion){
            case 1:
                gestor.añadirTarea();
                pintarMenu(gestor);
                break;
            case 2:
                gestor.completarTareas();
                pintarMenu(gestor);
                break;
            case 3:
                gestor.guardarDatos(gestor);
                pintarMenu(gestor);
                break;
            case 4:
                gestor = gestor.cargarDatos(gestor);
                pintarMenu(gestor);
                break;
            case 5:
                gestor.verTareas();
                pintarMenu(gestor);
                break;
            default :
                break;
        }
    }
}
