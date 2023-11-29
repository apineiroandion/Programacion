
package boletin18_1;

import javax.swing.JOptionPane;

public class Llamada {
    private final double PRICE_FIRST_TRAME=1;
    private final double PRICE_SECOND_TRAME=0.8;
    private final double PRICE_THIRD_TRAME=0.7;
    private final double PRICE_FOURTH_TRAME=0.5;
    private final double EXTRA_SUNDAY=0.3;
    private final double EXTRA_MORNING_NOT_SUNDAY=15;
    private final double EXTRA_AFTERNOON_NOT_SUNDAY=10;
    private final double FIRST_TRAME=5;
    private final double SECOND_TRAME=8;
    private final double THIRD_TRAME=10;
    private double callTime;
    private double priceBeforeTaxes;
    private boolean isSunday=false;
    private boolean isMorning=false;
    private boolean isAfternoon=false;
    private double price;
    
    public double calcPriceCallTime(){
        if(callTime<=FIRST_TRAME){
            priceBeforeTaxes=callTime*PRICE_FIRST_TRAME;
        }
        else if(callTime>FIRST_TRAME && callTime<=SECOND_TRAME){
            priceBeforeTaxes=FIRST_TRAME*PRICE_FIRST_TRAME;
            callTime=callTime-FIRST_TRAME;
            priceBeforeTaxes=priceBeforeTaxes+(callTime*PRICE_SECOND_TRAME);
        }
        else if(callTime>SECOND_TRAME && callTime<=THIRD_TRAME){
            priceBeforeTaxes=FIRST_TRAME*PRICE_FIRST_TRAME;
            callTime=callTime-FIRST_TRAME;
            priceBeforeTaxes=priceBeforeTaxes+((SECOND_TRAME-FIRST_TRAME)*PRICE_SECOND_TRAME);
            callTime=callTime-(SECOND_TRAME-FIRST_TRAME);
            priceBeforeTaxes=priceBeforeTaxes+(callTime*PRICE_THIRD_TRAME);
        }
        else{
            priceBeforeTaxes=FIRST_TRAME*PRICE_FIRST_TRAME;
            callTime=callTime-FIRST_TRAME;
            priceBeforeTaxes=priceBeforeTaxes+((SECOND_TRAME-FIRST_TRAME)*PRICE_SECOND_TRAME);
            callTime=callTime-(SECOND_TRAME-FIRST_TRAME);
            priceBeforeTaxes=priceBeforeTaxes+((THIRD_TRAME-SECOND_TRAME)*PRICE_THIRD_TRAME);
            callTime=callTime-(THIRD_TRAME-SECOND_TRAME);
            priceBeforeTaxes=priceBeforeTaxes+(callTime*PRICE_FOURTH_TRAME);
        }
        return priceBeforeTaxes;
    }
    
    public void calcCallPrice(){
        callTime=LerDatos.lerDouble("Introduce el tiempo de la llamada en minutos");
        int day=LerDatos.lerEnteiro("Elige un dia de la semana:"
                + "\n1) Lunes"
                + "\n2) Martes"
                + "\n3) Miercoles"
                + "\n4) Jueves"
                + "\n5) Viernes"
                + "\n6) Sabado"
                + "\n7) Domingo");
        switch(day){
            case 1:
                isSunday=false;
                break;
            case 2:
                isSunday=false;
                break;
            case 3:
                isSunday=false;
                break;
            case 4:
                isSunday=false;
                break;
            case 5:
                isSunday=false;
                break;
            case 6:
                isSunday=false;
                break;
            case 7:
                isSunday=true;
                break;
            default:
                break;
        }
        if(isSunday==false){
            int shift=LerDatos.lerEnteiro("Es de mañana o de tarde:"
                    + "\n1)MAÑANA"
                    + "\n2)TARDE");
            switch(shift){
                case 1:
                    isMorning=true;
                case 2:
                    isAfternoon=true;
                default:
                    break;
            }
        }
        priceBeforeTaxes=calcPriceCallTime();
        if(isSunday==false && isMorning==true){
            price=priceBeforeTaxes+((priceBeforeTaxes/100)*EXTRA_MORNING_NOT_SUNDAY);
        }
        else if(isSunday==false && isAfternoon==true){
            price=priceBeforeTaxes+((priceBeforeTaxes/100)*EXTRA_AFTERNOON_NOT_SUNDAY);
        }
        else if(isSunday==true){
            price=priceBeforeTaxes+((priceBeforeTaxes/100)*EXTRA_SUNDAY);
        }
        JOptionPane.showMessageDialog(null,"El precio de la llamada es: "+price+" €");
        calcCallPrice();
    }
        
}
