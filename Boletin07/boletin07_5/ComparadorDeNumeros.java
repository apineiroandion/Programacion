
package boletin07_5;

public class ComparadorDeNumeros {
    public void comparador(int num1, int num2, int num3){
        int eleccion;
        
        if(num1>num2 && num1>num3){
            eleccion=num1;
        }
        else if(num2>num1 && num2>num3){
            eleccion=num2;
        }
        else{
            eleccion=num3;
        }
        
        System.out.println(eleccion+" e o maior");
    }
}
