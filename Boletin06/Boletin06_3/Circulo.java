
package boletin06_3;

import javax.swing.JOptionPane;

public class Circulo {
    private double radio;
    private final double Pi = 3.14;
    
    public Circulo(){}
    public Circulo(double radio){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "el area del circulo es: "+Pi*(Math.pow(radio, 2)));
    }
    public void calcularLonxitude(){
        JOptionPane.showMessageDialog(null, "a lonxitude do circulo e: "+2*Pi*radio);
    }
}
