
package boletin08_7;

import javax.swing.JOptionPane;

public class Circulo {
    private float radio;
    
    public Circulo(){}
    public Circulo(float radio){
        this.radio=radio;
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del circulo es: "+(Math.PI*(radio*radio)));
    }
}
