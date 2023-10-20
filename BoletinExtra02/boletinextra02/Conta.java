
package boletinextra02;

public class Conta {
    private String nomeDoCliente;
    private String numeroDeConta;
    private double tipoDeInterese;
    private double saldo;
    
    public Conta(){}
    
    public Conta(String nomeDoCliente, String numeroDeConta, double tipoDeInterese,double saldo){
        this.nomeDoCliente=nomeDoCliente;
        this.numeroDeConta=numeroDeConta;
        this.tipoDeInterese=tipoDeInterese;
        this.saldo=saldo;
    }
    
    public String getNomeDoCliente(){
        return nomeDoCliente;
    }
    public String getNumeroDeConta(){
        return numeroDeConta;
    }
    public double getTipoDeInterese(){
        return tipoDeInterese;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setNomeDoCliente(String nomeDoCliente){
        this.nomeDoCliente=nomeDoCliente;
    }
    public void setNumeroDeConta(String numeroDeConta){
        this.numeroDeConta=numeroDeConta;
    }
    public void setTipoDeInterese(double tipoDeInterese){
        this.tipoDeInterese=tipoDeInterese;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
   
    //metodos ejercicios
    
    public void ingreso(double cartosAIngresar){
        saldo=saldo+cartosAIngresar;
    }
    public void reintegro(double cartosARetirar){
        saldo=saldo-cartosARetirar;
    }
    public void transferencia(Conta contaDestino, double importe){
        saldo=saldo-importe;
        contaDestino.setSaldo(contaDestino.getSaldo()+importe);
    }
    
}
