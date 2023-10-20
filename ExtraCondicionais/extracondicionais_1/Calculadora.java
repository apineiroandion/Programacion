
package extracondicionais_1;

import javax.swing.JOptionPane;

public class Calculadora {
    public void verNumeros(int input){
        if(input>0 && input<=9) JOptionPane.showMessageDialog(null,"el numero tiene una cifra");
        else if(input>9 && input<=99) JOptionPane.showMessageDialog(null,"el numero tiene dos cifras");
        else if(input>99 && input<=999) JOptionPane.showMessageDialog(null,"el numero tiene tres cifras");
        else if(input>999 && input<=9999) JOptionPane.showMessageDialog(null,"el numero tiene cuatro cifras");
        else if(input>9999 && input<=99999) JOptionPane.showMessageDialog(null,"el numero tiene cinco cifras");
        else JOptionPane.showMessageDialog(null,"el numero tiene mas de cinco cifras");
    }
}
