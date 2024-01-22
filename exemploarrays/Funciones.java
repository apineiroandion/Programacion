
package exemploarrays;

import javax.swing.JOptionPane;

public class Funciones {
    int calificaciones[] = new int[10];
    
    public void llenarArray(){
        for(int i=0;i<calificaciones.length;i++){
            calificaciones[i]=LerDatos.lerIntEntreDosNumeros("Introduce una calificacion:    "+"("+(i+1)+"/10)", 0, 10);
        }
    }
    public void calcularNotaMedia(){
        float suma=0;
        for(int i=0;i<calificaciones.length;i++){
            suma+=calificaciones[i];
        }
        JOptionPane.showMessageDialog(null, "La nota media es: "+suma/calificaciones.length);
    }
    public void maxAndMin(){
        int max=calificaciones[0];
        int min=calificaciones[0];
        for(int i=0;i<calificaciones.length;i++){
            if(calificaciones[i]>max){
                max=calificaciones[i];
            }
            else if(calificaciones[i]<min){
                min=calificaciones[i];
            }
        }
        JOptionPane.showMessageDialog(null, "MAX= "+max
                + "\nMIN= "+min);
    }
    
}
