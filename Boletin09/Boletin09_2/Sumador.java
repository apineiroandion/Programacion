
package boletin09_2;

import javax.swing.JOptionPane;

public class Sumador {
    public void sumarNumeros(){
        int i=0;
        int variadorSuma=11;
        int suma=10;
        while(i<80){
            suma=suma+variadorSuma;
            variadorSuma++;
            i++; 
        }
        JOptionPane.showMessageDialog(null, suma);
    }
}
