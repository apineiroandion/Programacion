
package boletin15;

public class Masaxista extends SeleccionFutbol{
    private String titulo;
    private Integer anosExperiencia;

    public Masaxista(String titulo, Integer anosExperiencia) {
        this.titulo = titulo;
        this.anosExperiencia = anosExperiencia;
    }

    public Masaxista(String titulo, Integer anosExperiencia, Integer id, String nome, String apelidos, Integer idade) {
        super(id, nome, apelidos, idade);
        this.titulo = titulo;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
     public void darMasaxes(){}
}
