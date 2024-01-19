
package ejercicio02interfaces;

public class CuadradoDibujable implements FiguraDibujable {

    public CuadradoDibujable() {
    }
    

    @Override
    public void dibujar() {
        System.out.println("Imprimo cuadrado");
    }
    
}
