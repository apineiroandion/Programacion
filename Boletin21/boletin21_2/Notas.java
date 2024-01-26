
package boletin21_2;

public class Notas {
    int[] notas=new int[30];

    public Notas() {
    }
    
    public void introducirNotas(){
        for(int i=0;i<notas.length;i++){
            notas[i]=(int) LerDatos.darAleatorioEntre(0, 10);
        }
    }
    public void verAprobados(){
        int aprobados=0;
        int suspensos=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>=5) aprobados++;
            else suspensos++;
        }
        System.out.println("APROBADOS: "+aprobados
                + "\nSUSPENSOS:"+suspensos);
    }
    public void verNotaMedia(){
        int sumatorio=0;
        for(int i=0;i<notas.length;i++){
            sumatorio=sumatorio+notas[i];
        }
        System.out.println("Media: "+(sumatorio/notas.length));
    }
    public void verNotaMasAlta(){
        int notaMasAlta=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaMasAlta) notaMasAlta=notas[i];
        }
        System.out.println("Nota mas alta: "+notaMasAlta);
    }
}
