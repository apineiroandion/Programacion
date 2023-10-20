
package extracondicionais_1;
import javax.swing.JOptionPane;

public class ExtraCondicionais_1 {

    public static void main(String[] args) {
        Calculadora calculadora=new Calculadora();
        int input=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        calculadora.verNumeros(input);
    }
    
}
