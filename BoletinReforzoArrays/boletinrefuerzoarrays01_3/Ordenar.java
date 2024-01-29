
package boletinrefuerzoarrays03_2;

import java.util.Arrays;

public class Ordenar {
    public static void ordenar(int[] numeros){
        System.out.println("--ORDENADOS--");
        Arrays.sort(numeros);
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
   
}
