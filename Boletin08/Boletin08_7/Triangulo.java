
package boletin08_7;

import javax.swing.JOptionPane;

public class Triangulo {
    private float base;
    private float altura;
    
    public Triangulo(){}
    public Triangulo(float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del triangulo es: "+((base*altura)/2));
    }
}
