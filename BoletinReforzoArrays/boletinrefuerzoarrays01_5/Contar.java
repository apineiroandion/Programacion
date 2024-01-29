
package boletinrefuerzoarrays03_2;

public class Contar {
    public static void conta(int[] numeros){
        int treses=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==3) treses++;
        }
        System.out.println(treses);
    }
}
