
package ejercicioclasesabstractas;

public class Coche extends Vehiculo {

    public Coche() {
    }

    @Override
    public void detenerse() {
        System.out.print("el coche ");
        super.detenerse();
    }

    @Override
    public void moverse() {
        System.out.print("el coche  ");
        super.detenerse();
    }
    
}
