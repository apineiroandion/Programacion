
package boletinrefuerzoarrays03_2;

public class Contar {
    public static void conta(int[] numeros){
        int treses=0;
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]==3) treses++;
        }
        System.out.println(treses);
    }
    public static void comprobarCincos(int[] numeros){
        int cincos=0;
            for(int i=0;i<numeros.length;i++){
                if(numeros[i]==5) cincos++;
            }
        if(cincos!=0)System.out.println("Hay "+cincos+" cincos");
        else System.out.println("No hay cincos");
    }
}
