
package ejercicicoclasesabstractas2;

public class Rectangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("El area del rectangulo es: "+
                base*altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es: "+ 2*(base*altura));
    }
    
}
