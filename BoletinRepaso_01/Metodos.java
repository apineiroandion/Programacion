
package boletinrepaso_01;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
    public static void apartadoUn(){
        for(int i=0;i<5;i++){
            System.out.println("isto e un bucle");
        }
    }
    public static void apartadoDous(){
        int num1=LerDatos.lerEnteiro("Introduce un numero:");
        int num2=LerDatos.lerEnteiro("Introduce un numero:");
        int num3=LerDatos.lerEnteiro("Introduce un numero:");
        int num4=LerDatos.lerEnteiro("Introduce un numero:");
        int num5=LerDatos.lerEnteiro("Introduce un numero:");
        JOptionPane.showMessageDialog(null, num1+" "+num2+" "+num3+" "+num4+" "+num5);
    }
    public static void apartadoTres(){
        ArrayList numeros=new ArrayList();
        Integer input;
        do{
            input=LerDatos.lerEnteiro("Introduce un numero");
            numeros.add(input);
        }while(input!=0);
        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }
    public static void apartadoCuatro(){
        ArrayList numeros=new ArrayList();
        for(int i=0;i<4;i++){
            Integer input=LerDatos.lerIntPositivo("Introduce un numero positivo");
            numeros.add(i, input);
        }
        for(int i=0;i<4;i++){
            System.out.println(numeros.get(i));
        }
    }
    public static void apartadoCinco(){
        ArrayList numeros=new ArrayList();
        for(int i=0;i<4;i++){
            Integer input=LerDatos.lerIntPositivo("Introduce un numero positivo");
            numeros.add(i, input);
        }
        for(int i=0;i<4;i++){
            System.out.println(numeros.get(i));
        }
        int sumador=0;
        for(int i=0;i<numeros.size();i++){
            Integer Aux=(Integer) numeros.get(i);
            sumador=sumador+Aux;
        }
        System.out.println("A suma dos catro numeros e: "+sumador);
    }
    public static void apartadoSeis(){
        int lado=LerDatos.lerEnteiro("Intoduce el lado:");
        JOptionPane.showMessageDialog(null, "El area es: "+(lado*lado));
    }
    public static void apartadoSiete(){
        int lado=LerDatos.lerIntPositivo("Introduce un lado positivo");
        JOptionPane.showMessageDialog(null, "El area es: "+(lado*lado));
    }
    public static void apartadoOcho(){
        int lado;
        do{
        lado=LerDatos.lerIntPositivo("Introduce un lado positivo");
        JOptionPane.showMessageDialog(null, "El area es: "+(lado*lado));
        }while(lado!=0);
    }
    public static void apartadoNueve(){
        int resultado=LerDatos.lerEnteiro("Introduce un numero");
        int suma;
        do{
            suma=LerDatos.lerEnteiro("Introduce otro numero");
            resultado=resultado+suma;
        }while(resultado<100);
        System.out.println("El resultado es: "+resultado);
    }
    public static void apartadoDiez(){
        Float sumanotas=0f;
        for(int i=0;i<6;i++){
            Float input=LerDatos.lerFloat("Introduce a nota do modulo: ("+(i+1)+")");
            sumanotas=(sumanotas+input)/6;
            System.out.println("la nota media es: "+(sumanotas/6));
        }
    }
    public static void apartadoOnce(){
        for(int i=0;i<3;i++){
        Float sumanotas=0f;
            for(int j=0;j<6;j++){
                Float input=LerDatos.lerFloat("Introduce a nota do alumno "+(i+1)+" do modulo: ("+(j+1)+")");
                sumanotas=sumanotas+input;
            }
            System.out.println("la nota media do alumno "+(i+1)+" es: "+(sumanotas/6));
        }
    }
    public static void apartadoDoce(){
        Float sumanotas=0f;
        String confirmacion="si";
        while(LerDatos.compararString(confirmacion, "si")){
            for(int i=0;i<6;i++){
            Float input=LerDatos.lerFloat("Introduce a nota do modulo: ("+(i+1)+")");
            sumanotas=sumanotas+input;
            }
            System.out.println("la nota media es: "+(sumanotas/6));
            confirmacion=JOptionPane.showInputDialog("Escribe si para otro alumno");
        }
    }
}
