
package boletin09_5;

import javax.swing.JOptionPane;

public class Contador {
    public static void contarSoldos(){
        int soldos=0;
        int solodosEntre=0;
        int solodosMenos=0;
        int soldo;
        do{
            soldo=Integer.parseInt(JOptionPane.showInputDialog("Introduce un soldo:"));
            if(soldo>=1000 && soldo<=1750)solodosEntre++;
            else if(soldo<1000)solodosMenos++;
            soldos++;
        }while(soldo!=0);
        JOptionPane.showMessageDialog(null, "Hay "+solodosEntre+" entre 1000€ e 1750€"
                + "\nE o "+((solodosMenos*100)/soldos)+"% dos empleados cobran menos de 1000€");
    }
}
