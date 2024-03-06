
package repasoserializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class GestorTareas implements Serializable{
    private ArrayList<Tarea> tareas = new ArrayList();
    
    public GestorTareas() {
    }
    
    public void añadirTarea(){
        String descripcion=LerDatos.lerString("Introduce la descripcion de la tarea: ");
        tareas.add(new Tarea(descripcion));
    }
    
    public void verTareas(){
        System.out.println("DESCRIPCION // ESTADO");
        for(int i=0;i<tareas.size();i++){
            String estado;
            if(tareas.get(i).getCompletada()==false) estado = "Pendiente";
            else estado = "Completada";
            
            System.out.println("Numero: "+(i+1)+ "Descripcion: "+tareas.get(i).getDescripcion()+" Estado: "+estado);
        }
    }
    
    public void completarTareas(){
        verTareas();
        int opcion= LerDatos.lerEnteiro("Elige la tarea que quieras de la consola :")-1;
        if(tareas.get(opcion).getCompletada()==false){
            tareas.get(opcion).setCompletada(Boolean.TRUE);
            System.out.println("La tarea ha sido completada");
        }
        else System.out.println("No se puede completar la tarea "+opcion+" porque ya esta completada");
    }
    
    public void guardarDatos(GestorTareas gestor){
        try{
            FileOutputStream fos = new FileOutputStream("tareas.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gestor);
            oos.close();
            fos.close();
            System.out.println("Objeto Serializado");
        }catch(IOException e){
            e.printStackTrace();        
        }
    }
    
    public GestorTareas cargarDatos(GestorTareas gestor){
        try{
            FileInputStream fis = new FileInputStream("tareas.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            gestor = (GestorTareas) ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Objeto desserializado");
        return gestor;
    }
}
