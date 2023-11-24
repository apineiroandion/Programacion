
package boletin16;

public class Publicacion {
    private Integer codigo;
    private String titulo;
    private Integer ano;

    public Publicacion() {
    }

    public Publicacion(Integer codigo, String titulo, Integer ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano = ano;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", titulo=" + titulo + ", ano=" + ano;
    }
    
    
}
