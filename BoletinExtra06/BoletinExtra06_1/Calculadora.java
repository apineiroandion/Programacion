
package boletinextra06_1;
import javax.swing.JOptionPane;
public class Calculadora {
    public static void calcularCuota(){
        int edade=LerDatos.lerIntPositivo("Introduce a idade: ");
        boolean padres=false;
        if(edade<21) {
            int input=Integer.parseInt(JOptionPane.showInputDialog("Tus padres son socios: (1=SI, 2=NO)"));
            switch(input){
                case 1:
                    padres=true; 
                    break;
                case 2:
                    padres=false;  
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error, vuleve a empezar");
                    calcularCuota();
                    break;
                    
            }
        }
        
        float cuota=800;
        
        
        
        if(edade>65)cuota=800-((800/100)*45);
        else if(edade<21 && padres==false)cuota=800-((800/100)*25);
        else if(edade<21 && padres==true)cuota=800-((800/100)*45);
        else cuota=800;
        
        JOptionPane.showMessageDialog(null, "Te corresponde una cuota de : "+cuota+"€");
    }
}
