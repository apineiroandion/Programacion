
package diassemana;

import javax.swing.JOptionPane;

public class MenuSwitch {
    public void pintarMenu(){
    
        int input=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la semana en numero"));
        
        switch (input) {
            case 1:
                JOptionPane.showMessageDialog(null, "lunes");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "martes");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "miercoles");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "jueves");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "viernes");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "sabado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "domingo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "introduce un numero entre 1 y 7");
                break;
        }
        
    }
}
