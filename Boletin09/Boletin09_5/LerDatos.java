
package boletin09_5;
import javax.swing.JOptionPane;
public class LerDatos {
    //LEER DATOS:
    public static int lerEnteiro(String mensaxe){
        //int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        //return resposta;
        //tamen se pode facer
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    public static short lerShort(String mensaxe){
        return Short.parseShort(JOptionPane.showInputDialog(mensaxe));
    }
    public static float lerFloat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
    }
    public static double lerDouble(String mensaxe){
        return Double.parseDouble(JOptionPane.showInputDialog(mensaxe));
    }
    public static long lerLong(String mensaxe){
        return Long.parseLong(JOptionPane.showInputDialog(mensaxe));
    }
    public static String lerString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
    
    public static float lerFloatPositivo(String mensaxe){
        float dato=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        while (dato<=0){
            dato=Float.parseFloat(JOptionPane.showInputDialog("Introduce un valor positivo: "));
        }
        return dato;
    }
    public static int lerIntPositivo(String mensaxe){
        int dato=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        while(dato<=0){
            dato=Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor positivo: "));
        }
        return dato;
    }
}
