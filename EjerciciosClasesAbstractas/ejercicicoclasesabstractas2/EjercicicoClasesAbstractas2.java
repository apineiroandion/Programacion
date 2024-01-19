/*
*     ENUNCIADO
Clase Abstracta FiguraGeometrica
    calcularElArea()
    calcularElPerimetro()
Clase Circulo
Clase Rectangulo
*/

package ejercicicoclasesabstractas2;

public class EjercicicoClasesAbstractas2 {

    public static void main(String[] args) {
        float base=LerDatos.lerFloat("Introduce la base del rectangulo");
        float altura=LerDatos.lerFloat("Introduce la altura del rectangulo");
        float radio=LerDatos.lerFloat("Introduce el radio del circulo");
        
        Circulo c=new Circulo(radio);
        Rectangulo r=new Rectangulo(base, altura);
        c.calcularArea();
        c.calcularPerimetro();
        r.calcularArea();
        r.calcularPerimetro();
    }
    
}
