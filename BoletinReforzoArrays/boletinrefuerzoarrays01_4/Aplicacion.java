
package boletinrefuerzoarrays03_2;

public class Aplicacion {
    private int[] numeros=new int[12];

    public Aplicacion() {
    }
    
    public void iniciarArray(){
        for(int i=0 ;i<numeros.length; i++){
            numeros[i]=(int) LerDatos.darAleatorioEntre(1, 30);
        }
    }

    public int[] getNumeros() {
        return numeros;
    }
    
}
