
package boletin21_1;

public class Funcion {
    int[] numeros=new int[6];
    public Funcion() {
    }
    
    public void introducirValores(){
        for(int i=0;i<=5;i++){
            numeros[i]=LerDatos.darAleatorioEntre(1, 50);
        }
    }
    public void visualizarValores(){
        for(int i=5;i>=0;i--){
            System.out.println(numeros[i]+" ");
        }
    }
}
