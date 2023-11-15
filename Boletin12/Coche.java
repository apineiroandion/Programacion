
package boletin12;

import java.time.LocalTime;

public class Coche {
    String matricula;
    String marca;
    LocalTime horaEntrada;
    LocalTime horaSalida;
    boolean estaDentro;
    
    public Coche() {
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public Coche(String matricula, String marca, LocalTime horaEntrada, boolean estaDentro) {
        this.matricula = matricula;
        this.marca = marca;
        this.horaEntrada = horaEntrada;
        this.estaDentro = estaDentro;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean getEstaDentro() {
        return estaDentro;
    }

    public void setEstaDentro(boolean estaDentro) {
        this.estaDentro = estaDentro;
    }
    

    @Override
    public String toString() {
        return "matricula=" + matricula + ", marca=" + marca + ", horaEntrada=" + horaEntrada;
    }

}
