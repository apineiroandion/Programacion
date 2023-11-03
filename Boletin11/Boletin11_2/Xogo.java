
package boletin11_2;

import javax.swing.JOptionPane;

public class Xogo {
    
    public static void xogar(){
        int numero=(int)LerDatos.darAleatorioEntre(1, 50);
        int trys=LerDatos.lerEnteiro("Introduce o numero de intentos");
        int intento;
        int diferencia = 0;
        do{
            intento=LerDatos.lerEnteiro("Introduce un numero: (tienes "+trys+" intentos)");
            if(intento>numero) diferencia=intento-numero;
            else if(intento<numero) diferencia=numero-intento;
            if(diferencia>20) JOptionPane.showMessageDialog(null, "moi lonxe");
            else if(diferencia>=5 && diferencia<=10) JOptionPane.showMessageDialog(null, "preto");
            else if(diferencia<5) JOptionPane.showMessageDialog(null, "moi preto");
            trys--;
            
        }while(numero!=intento && trys>0);
        
        if(trys==0){
            JOptionPane.showMessageDialog(null, "PERDISTE, el numero era: "+numero);
            }
        else{
            JOptionPane.showMessageDialog(null, "GANASTE!, el numero es: "+numero);
        }
        Xogo.xogar();
    }
}
