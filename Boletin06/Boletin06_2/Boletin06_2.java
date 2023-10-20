
package boletin06_2;
import javax.swing.*;
public class Boletin06_2 {

    public static void main(String[] args) {
        double m=Double.parseDouble(JOptionPane.showInputDialog("intoduce el meridiano:"));
        double p=Double.parseDouble(JOptionPane.showInputDialog("intoduce el paralelo:"));
        double d=Double.parseDouble(JOptionPane.showInputDialog("intoduce a distancia a terra:"));
        Satelite satelite=new Satelite(m,p,d);
        satelite.verPosicion();
    }
    
}
