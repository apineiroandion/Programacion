
package ejercicicoclasesabstractas2;

public class Rectangulo implements IEsUnaFigura {
        private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public float calcularArea() {
        return base*altura;
    }

    @Override
    public float calcularPerimetro() {
        return 2*(base*altura);
    }
}
