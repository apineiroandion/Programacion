
package boletin17;

public class Corriente extends Conta{
    private final double INTERESE=1.5;

    public Corriente() {
    }

    public Corriente(Long numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public String toString() {
        return super.toString()+" INTERESE=" + INTERESE;
    }
    
}
