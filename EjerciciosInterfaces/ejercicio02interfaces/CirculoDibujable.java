
package ejercicio02interfaces;

public class CirculoDibujable implements FiguraDibujable {

    public CirculoDibujable() {
    }
    

    @Override
    public void dibujar() {
        System.out.println("Imprimo ciculo");
    }
    
}
