
package extracondicionais_2;
import javax.swing.JOptionPane;
public class ExtraCondicionais_2 {

    public static void main(String[] args) {
        float precioBase=Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio base de la uva"));
        Uva uva=new Uva(precioBase);
        int i=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion "
                + "\n1) tipo A tamaño uno"
                + "\n2) tipo A tamaño dos"
                + "\n3) tipo B tamaño uno"
                + "\n4) tipo B tamaño dos"));
        uva.calcularPrecioFinal(i);
    }
    
}
