
package boletin16;

public class Libro extends Publicacion{
    private boolean prestado=false;

    public Libro() {
    }

    public Libro(Integer codigo, String titulo, Integer ano) {
        super(codigo, titulo, ano);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"prestado=" + prestado;
    }
    
    
}
