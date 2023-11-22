
package boletin15;

public class Futbolista extends SeleccionFutbol{
    private String posicion;

    public Futbolista() {
    }

    public Futbolista(String posicion) {
        this.posicion = posicion;
    }

    public Futbolista(String posicion, Integer id, String nome, String apelidos, Integer idade) {
        super(id, nome, apelidos, idade);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public void xogarPartido(){}
    public void entrenar(){}
}
