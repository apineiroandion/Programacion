
package ejercicicoclasesabstractas2;

public class Circulo implements IEsUnaFigura {
    private float radio;
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    @Override
    public float calcularArea() {
        return (float) (Math.PI*(radio*radio));
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2*Math.PI*radio);
    }
    
}
