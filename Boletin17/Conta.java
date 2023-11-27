
package boletin17;

import javax.swing.JOptionPane;

public class Conta {
    private Long numeroConta;
    private Double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(Long numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    public Conta(Long numeroConta, Double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    
    public void ingresar(double cantidade){
        saldo=saldo+cantidade;
        JOptionPane.showMessageDialog(null, "Has ingresado "
                + cantidade+" € "
                        + "\n Tienes "+saldo+ " €");
    }
    public void retirar(double cantidade){
        if(cantidade<saldo){
            saldo=saldo-cantidade;
            JOptionPane.showMessageDialog(null, "Has retirado "+
                cantidade+" €"
                + "\n Te quedan "+saldo+" €");
        }
        else{
            JOptionPane.showMessageDialog(null, "No tienes "
                    + "dinero suficiente para retirar esa cantidad");
        }
    }
    public void actualizarSaldo(){
        JOptionPane.showMessageDialog(null, "Tines "+saldo+" €");
    }

    public Long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente;
    }
    
    
}
