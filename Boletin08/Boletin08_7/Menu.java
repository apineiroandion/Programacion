
package boletin08_7;

import javax.swing.JOptionPane;

public class Menu {
    public void pintarMenu(){
        int input=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:"
                + "\n1) Calcular area Cadrado"
                + "\n2) Calcular area Triangulo"
                + "\n3) Calcular area Circulo"
                + "\n4) Salir"));
        switch(input){
            case 1:
                float base=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
                float altura=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
                Cadrado cadrado=new Cadrado(base,altura);
                cadrado.calcularArea();
                pintarMenu();
                break;
            case 2:
                float baset=Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
                float alturat=Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
                Triangulo triangulo=new Triangulo(baset,alturat);
                triangulo.calcularArea();
                pintarMenu();
                break;
            case 3:
                float radio=Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio"));
                Circulo circulo = new Circulo(radio);
                circulo.calcularArea();
                pintarMenu();
                break;
            case 4:
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Introduce un valor valido");
                pintarMenu();
        }
    }
}
