
package boletinrefuerzoarrays;

public class Aplicacion {
    private int[] numeros=new int[6];

    public Aplicacion() {
    }
    
    public void iniciarArray(){
        for(int i=0; i<numeros.length;i++){
            numeros[i]=(int) LerDatos.darAleatorio100();
        }
    }
    public void visualizarArray(){
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
}
