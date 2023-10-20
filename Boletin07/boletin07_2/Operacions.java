
package boletin07_2;

public class Operacions {
    short num1, num2;
    
    public Operacions(){}
    public Operacions(short num1, short num2){
        this.num1=num1;
        this.num2=num2;
    }
    
    public void facerSumaeResta(){
        if(num1>=num2){
            System.out.println(num1 + " - "+ num2+ " = " + (num1-num2));
            System.out.println(num1 + " + "+ num2+ " = " + (num1+num2));
        }
        else{
            System.out.println(num1 + " + "+ num2+ " = " + (num1+num2));
        }
    }
}
