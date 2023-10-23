
package boletin08_6;
import javax.swing.JOptionPane;
public class Menu {
    public void pintarMenu(){
        int input=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:"
                + "\n1) Introducir Producto"
                + "\n2) Salir"));
        switch(input){
            case 1:
                String nome=JOptionPane.showInputDialog("Introduce el nombre del producto");
                int ventasAnuais=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de ventas del producto"));
                Productos producto=new Productos(nome,ventasAnuais);
                producto.verDatos();
                pintarMenu();
                break;
            case 2: 
                break;
            default:
                pintarMenu();
                
        }
    }
}
