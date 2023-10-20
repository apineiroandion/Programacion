
package boletin07_3;

public class Comparador {
    double input;
    
    public Comparador(){}
    public Comparador(double input){
        this.input=input;
    }
    
    public void hacerComparacion(){
        if(input>0){
            System.out.println("+");
        }
        else{
            if(input==0){
                System.out.println("0");
            }
            else{
                System.out.println("-");
            }
        }
    }
}
