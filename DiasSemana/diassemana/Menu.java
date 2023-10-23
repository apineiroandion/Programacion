
package diassemana;
import javax.swing.JOptionPane; 
public class Menu {
    public void pintarMenu(){
    
        int input=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la semana en numero"));
        
        if(input==1) JOptionPane.showMessageDialog(null, "lunes");
        else if(input==2) JOptionPane.showMessageDialog(null, "martes");
        else if(input==3) JOptionPane.showMessageDialog(null, "miercoles");
        else if(input==4) JOptionPane.showMessageDialog(null, "jueves");
        else if(input==5) JOptionPane.showMessageDialog(null, "viernes");
        else if(input==6) JOptionPane.showMessageDialog(null, "sabado");
        else if(input==7) JOptionPane.showMessageDialog(null, "domingo");
        else JOptionPane.showMessageDialog(null, "introduce un numero entre 1 y 7");
        
    }
    
}
