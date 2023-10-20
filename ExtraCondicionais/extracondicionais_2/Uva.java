
package extracondicionais_2;

import javax.swing.JOptionPane;

public class Uva {
    float precioBase;
   
    public Uva(){}
    public Uva(float precioBase){
        this.precioBase=precioBase;
    }
    public void calcularPrecioFinal(int i){
        switch(i){
            case 1:
                precioBase=precioBase+0.20f;
                break;
            case 2:
                precioBase=precioBase+0.30f;
                break;
            case 3:
                precioBase=precioBase-0.30f;
                break;
            case 4:
                precioBase=precioBase-0.50f;
                break;
        }
        JOptionPane.showMessageDialog(null, "El precio de la uva es de "+precioBase+" euros");
    }
    
}
