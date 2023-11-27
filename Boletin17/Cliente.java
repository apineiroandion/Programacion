
package boletin17;

public class Cliente {
    private String nome;
    private String apelido;
    private String nif;

    public Cliente() {
    }

    public Cliente(String nome, String apelido, String nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", apelido=" + apelido + ", nif=" + nif;
    }
    
}
