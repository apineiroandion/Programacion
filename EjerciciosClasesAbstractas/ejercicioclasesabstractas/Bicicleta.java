
package ejercicioclasesabstractas;

public class Bicicleta extends Vehiculo {

    public Bicicleta() {
    }

    @Override
    public void detenerse() {
        System.out.print("La Biciclta: ");
        super.detenerse(); 
    }

    @Override
    public void moverse() {
        System.out.print("La Biciclta: ");
        super.moverse(); 
    }
    
}
