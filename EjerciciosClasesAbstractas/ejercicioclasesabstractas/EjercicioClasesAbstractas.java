
package ejercicioclasesabstractas;

public class EjercicioClasesAbstractas {

    public static void main(String[] args) {
        Coche coche=new Coche();
        coche.detenerse();
        coche.moverse();
        Bicicleta b=new Bicicleta();
        b.moverse();
        b.detenerse();
    }
    
}
