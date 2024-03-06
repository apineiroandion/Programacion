
package repasoserializacion;

import java.io.Serializable;

public class Tarea implements Serializable{
    private String descripcion;
    private Boolean completada=false;

    public Tarea() {
    }

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }
    

    public Tarea(String descripcion, Boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getCompletada() {
        return completada;
    }

    public void setCompletada(Boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return "Tarea{" + "descripcion=" + descripcion + ", completada=" + completada + '}';
    }
    
}
