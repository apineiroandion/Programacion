
package calcularnotafinal;

import javax.swing.JOptionPane;

public class Calculadora {
    static private float primerExamen;
    static private float segundoExamen;
    static private float examenPractico;
    static private float mediaExamenes;
    static private float notaFinal;
    static private float boletines;
    
    public static void calcularTeorico(){
        mediaExamenes=(primerExamen+segundoExamen)/2;
    }
    public static void calcularBoletines(int input){
        switch(input){
            case 1:
                boletines=2;
                break;
            case 2:
                boletines=1;
                break;
            case 3:
                boletines=0;
                break;
            default:
                break;
        }
    }
    public static void calcularNotaFinal(){
        notaFinal=((mediaExamenes/100)*40)+((examenPractico/100)*40)+boletines;
    }
    public static void verResultado(){
        JOptionPane.showMessageDialog(null, 
                "PROBAS TEORICAS:  "+mediaExamenes+
                "\nPROBAS PRACTICAS:  "+examenPractico+
                "\nBOLETINS:  "+boletines+
                "\nNOTA TOTAL:  "+notaFinal);
    }

    public static float getPrimerExamen() {
        return primerExamen;
    }

    public static void setPrimerExamen(float primerExamen) {
        Calculadora.primerExamen = primerExamen;
    }

    public static float getSegundoExamen() {
        return segundoExamen;
    }

    public static void setSegundoExamen(float segundoExamen) {
        Calculadora.segundoExamen = segundoExamen;
    }

    public static float getExamenPractico() {
        return examenPractico;
    }

    public static void setExamenPractico(float examenPractico) {
        Calculadora.examenPractico = examenPractico;
    }

    public static float getMediaExamenes() {
        return mediaExamenes;
    }

    public static void setMediaExamenes(float mediaExamenes) {
        Calculadora.mediaExamenes = mediaExamenes;
    }

    public static float getNotaFinal() {
        return notaFinal;
    }

    public static void setNotaFinal(float notaFinal) {
        Calculadora.notaFinal = notaFinal;
    }

    public static float getBoletines() {
        return boletines;
    }

    public static void setBoletines(float boletines) {
        Calculadora.boletines = boletines;
    }
    
}
