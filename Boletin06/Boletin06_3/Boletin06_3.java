
package boletin06_3;
import javax.swing.JOptionPane;
public class Boletin06_3 {

    public static void main(String[] args) {
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
        Circulo circulo=new Circulo(radio);
        circulo.calcularArea();
        circulo.calcularLonxitude();
    }
    
}
