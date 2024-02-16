package datos;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;
import java.lang.NumberFormatException;
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
    //LEER DATOS POSITIVOS:
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
    public static int lerIntEntreDosNumeros(String mensaxe, int a,int b){
        int dato=0;
        do{
            try{
            dato=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));    
                if(dato<a || dato>b){
                }
            }
            catch(java.util.InputMismatchException | java.lang.NumberFormatException e){
                LerDatos.lerIntEntreDosNumeros(mensaxe, a, b);
            }
        }while(dato<a || dato>b);
        return dato;
    }
    //NUMEROS ALEATORIOS
    public static double darAleatorio100(){
        return Math.random()*(0-100)+100;
    }
    public static double darAleatorioEntre(double n, double m){
        return Math.random()*(n-m)+m;
    }
    //COMPARAR STRING
    public static boolean compararString(String s1, String s2){
        return s1.equals(s2);
        //compareTo(=0 iguais, >0 s1>s2, <0 s1<s2)
    }
}
