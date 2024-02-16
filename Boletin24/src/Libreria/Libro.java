
package Libreria;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private Float prezo;
    private Integer numeroUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String ISBN, Float prezo, Integer numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Float getPrezo() {
        return prezo;
    }

    public void setPrezo(Float prezo) {
        this.prezo = prezo;
    }

    public Integer getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(Integer numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", prezo=" + prezo + ", numeroUnidades=" + numeroUnidades;
    }
    
    
}
