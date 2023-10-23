
package boletin08_7;

import javax.swing.JOptionPane;

public class Cadrado {
    private float base;
    private float altura;
    
    public Cadrado(){}
    public Cadrado(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+(base*altura));
    }
}
