
package boletinextra02_2;

public class Calculadora {
    private double a;
    private double b;
    private double c;
    
    public Calculadora(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public void resolverEcuacion(double discriminante){
        System.out.println("Los resultados son: ");
        System.out.println((-b+Math.sqrt(discriminante))/(2*a));
        System.out.println((-b-Math.sqrt(discriminante))/(2*a));
    }
    
    //METODOS DE ACCESO
    public void setA(double a){
        this.a=a;
    }
    public double getA(){
        return a;
    }
    public void setB(double b){
        this.b=b;
    }
    public double getB(){
        return b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double getC(){
        return c;
    }
}
