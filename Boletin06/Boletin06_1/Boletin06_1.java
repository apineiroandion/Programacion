
package boletin06_1;
import javax.swing.*;
public class Boletin06_1 {

    public static void main(String[] args) {
        Coche coche=new Coche();
        int valor=Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad que vas a acelerar"));
        coche.acelerar(valor);
        int menos=Integer.parseInt(JOptionPane.showInputDialog("Tu velocidad actual es: "+coche.getVelocidade()+
                "\n Introduce lacantidad que quieres disminuir:"));
        coche.frenar(menos);
        JOptionPane.showMessageDialog(null, "la velocidad actual es: "+coche.getVelocidade());
        
    }
    
}
