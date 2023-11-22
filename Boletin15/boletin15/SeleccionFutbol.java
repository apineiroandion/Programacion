
package boletin15;

public class SeleccionFutbol {
    private Integer id;
    private String nome;
    private String apelidos;
    private Integer idade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nome, String apelidos, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }
    public void concentrarse(){}
    public void viaxar(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nome=" + nome + ", apelidos=" + apelidos + ", idade=" + idade;
    }
    
    
}
