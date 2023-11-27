
package boletin17;

public class Ahorro extends Conta{
    private double interese;
    private final double SOLDO_MINIMO=1000;

    public Ahorro(double interese) {
        this.interese = interese;
    }

    public Ahorro(double interese, Long numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
        this.interese = interese;
    }
    public Ahorro(double interese, Long numeroConta, Double saldo, Cliente cliente) {
        super(numeroConta,saldo , cliente);
        this.interese = interese;
    }
    
    

    public double getInterese() {
        return interese;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    @Override
    public String toString() {
        return super.toString()+" interese=" + interese + ", SOLDO_MINIMO=" + SOLDO_MINIMO;
    }
    
    
}
