
package boletin09_3;

public class Comprobador {
    public static int comprobarDatos(int num1){
        while(num1<0){
            num1=LerDatos.lerEnteiro("El numero es negativo, introduce otro: ");
        }
        return num1;  
    }
}
