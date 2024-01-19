
package ejercicioclasesabstractas;

public abstract class Vehiculo implements IPuedeMoverse{

    @Override
    public void moverse() {
        System.out.println("se esta moviendo");
    }

    @Override
    public void detenerse() {
        System.out.println("se esta deteniendo");
    }
    
}
