
package boletin15;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, Integer id, String nome, String apelidos, Integer idade) {
        super(id, nome, apelidos, idade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirixirPartido(){}
    public void dirixirEntrenamento(){}
}
