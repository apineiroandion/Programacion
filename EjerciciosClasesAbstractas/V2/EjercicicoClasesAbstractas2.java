/*
*     ENUNCIADO
Clase Abstracta FiguraGeometrica
    calcularElArea()
    calcularElPerimetro()
Clase Circulo
Clase Rectangulo
*/

package ejercicicoclasesabstractas2;

import javax.swing.JOptionPane;

public class EjercicicoClasesAbstractas2 {

    public static void main(String[] args) {
        float base=LerDatos.lerFloat("Introduce la base del rectangulo");
        float altura=LerDatos.lerFloat("Introduce la altura del rectangulo");
        float radio=LerDatos.lerFloat("Introduce el radio del circulo");
        
        Circulo c=new Circulo(radio);
        Rectangulo r=new Rectangulo(base, altura);
        float areaC=c.calcularArea();
        float perC=c.calcularPerimetro();
        float areaR=r.calcularArea();
        float areaP=r.calcularPerimetro();
        
        JOptionPane.showMessageDialog(null, "DATOS CIRCULO:"
                + "\nAREA: "+areaC
                + "\nPERIMETRO"+perC
                +"\n"
                + "\nDATOS RECTANGULO:"
                + "\nArea"+areaR
                + "\nPERIMETRO"+areaP);
    }
    
}
