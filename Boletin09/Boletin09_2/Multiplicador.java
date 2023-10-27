
package boletin09_2;

import javax.swing.JOptionPane;

public class Multiplicador {
    public void multiplicarNumeros(){
        int i=0;
        int variadorMultiplicador=11;
        double multiplicacion=10;
        while(i<80){
            multiplicacion=multiplicacion*variadorMultiplicador;
            variadorMultiplicador++;
            i++;
        }
        JOptionPane.showMessageDialog(null, multiplicacion);
    }
}
