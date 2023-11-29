
package boletin18_2.pkg1;
import javax.swing.JOptionPane;
public class Transporte {
    private final double NORTH_AMERICA_PRICE=24.00;
    private final double CENTRAL_AMERICA_PRICE=20.00;
    private final double SOUTH_AMERICA_PRICE=21.00;
    private final double EUROPE_PRICE=10.00;
    private final double ASIA_PRICE=18.00;
    private final double WEIGHT_LIMIT=5;
    private boolean isSafe;
    private double weight;
    private double price;
    
    public boolean isForSend(){
        if(weight>WEIGHT_LIMIT)isSafe=false;
        else isSafe=true;
        return isSafe;
    }
    
    public void calcPrice(){
        weight=LerDatos.lerDouble("Introduce el peso:");
        isSafe=isForSend();
        if(isSafe==true){
            int zone=LerDatos.lerEnteiro("Introduce a zona:"
                    + "\n1)AMERICA NORTE"
                    + "\n2)AMERICA CENTRO"
                    + "\n3)AMERICA SUR"
                    + "\n4)EUROPA"
                    + "\n5)ASIA");
            switch(zone){
                case 1:
                    price=weight*NORTH_AMERICA_PRICE;
                    break;
                case 2:
                    price=weight*CENTRAL_AMERICA_PRICE;
                    break;
                case 3:
                    price=weight*SOUTH_AMERICA_PRICE;
                    break;
                case 4:
                    price=weight*EUROPE_PRICE;
                    break;
                case 5:
                    price=weight*ASIA_PRICE;
                    break;
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "El precio del envio es: "+price+" €");
            
        }
        else JOptionPane.showMessageDialog(null, "No se puede enviar, porque pesa mas de 5Kg");
        calcPrice();
    }
}
