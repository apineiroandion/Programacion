
package boletin11_1;

import javax.swing.JOptionPane;

public class Xogo {
    
    public static void xogar(){
        int numero=LerDatos.lerEnteiro("Introduce o numero a adiviñar");
        int trys=LerDatos.lerEnteiro("Introduce o numero de intentos");
        int intento;
        
        do{
            intento=LerDatos.lerEnteiro("Introduce un numero: (tienes "+trys+" intentos)");
            if(intento>numero) JOptionPane.showMessageDialog(null, "El numero es mas pequeño");
            else if(intento<numero)JOptionPane.showMessageDialog(null, "El numero es mas grande");
            trys--;
        }while(numero!=intento && trys>0);
        
        if(trys==0){
            JOptionPane.showMessageDialog(null, "PERDISTE");
            }
        else{
            JOptionPane.showMessageDialog(null, "GANASTE!");
        }
        Xogo.xogar();
    }
}
