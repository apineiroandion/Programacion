
package boletin09_1;

import javax.swing.JOptionPane;

public class Contador {
    int positivos;
    int negativos;
    int ceros;
   
    public void contadorNumeros(){
        int i=9;
        while(i>=0){
            int numero=LerDatos.lerEnteiro("Introduce un numero: (Te quedan "+(1+i)+")");
            if (numero>0){
                positivos++;
                i--;
            }
            else if(numero<0){
                negativos++;
                i--;
            }
            else{
                ceros++;
                i--;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Has introducido "+positivos+" numeros positivos"
        + "\n"+negativos+"negativos"
        + "\n"+ceros+"ceros");
    }
}
