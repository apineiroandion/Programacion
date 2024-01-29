
package boletinrefuerzoarrays01_2;

public class Aplicacion {
    private int[] numeros=new int[6];

    public Aplicacion() {
    }
    
    
    public void iniciarArray(){
        for(int i=0;i<numeros.length;i++){
            numeros[i]=LerDatos.lerEnteiro("Introduce un valor ("+(i+1)+"/6)");
        }
    }
    public void visualizar(){
        Ver.visualizar(numeros);
    }
}
