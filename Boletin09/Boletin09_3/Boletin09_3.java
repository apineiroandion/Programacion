
package boletin09_3;

import javax.swing.JOptionPane;

public class Boletin09_3 {

    public static void main(String[] args) {
        int base=Comprobador.comprobarDatos(LerDatos.lerEnteiro("Introduce la base:"));
        int altura=Comprobador.comprobarDatos(LerDatos.lerEnteiro("Introduce la altura:"));
        JOptionPane.showMessageDialog(null, "El area es: "+ base*altura);
    }
}
