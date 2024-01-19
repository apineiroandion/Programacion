
package ejercicicoclasesabstractas2;

public class Circulo extends FiguraGeometrica {
    private float radio;
    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del circulo es: "
        +Math.PI*Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es: "+
                2*Math.PI*radio);
    }
    
}
