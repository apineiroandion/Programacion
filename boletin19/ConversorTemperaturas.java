
package boletin19;

public class ConversorTemperaturas {
    private final float TEMPERATURA_MIN=80f;
    
    public static float centigradosAFharenheit(float temperaturaCentidrados){
        float temperaturaFharenheit;
        temperaturaFharenheit = (float) ((9.0/5.0)*temperaturaCentidrados+32.4);
        return temperaturaFharenheit;
    }
    
    public static float centígradosAReamur(float temperaturaCentidrados){
        float temperaturaReamur;
        temperaturaReamur = (float)  (4.0/5.0*temperaturaCentidrados);
        return temperaturaReamur;
    }
    
    public static void mostrarDatos(float temperaturaC,float temperaturaF, float temperaturaR){
        System.out.println("Centigrados: "+temperaturaC+
        "\nFarenhein: "+temperaturaF+
        "\nReamur: "+temperaturaR);
    }
}
