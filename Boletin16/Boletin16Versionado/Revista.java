
package boletin16;

public class Revista extends Publicacion{
    private Integer numero;

    public Revista(Integer numero) {
        this.numero = numero;
    }

    public Revista(Integer numero, Integer codigo, String titulo, Integer ano) {
        super(codigo, titulo, ano);
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+" numero=" + numero;
    }
    
    
}
