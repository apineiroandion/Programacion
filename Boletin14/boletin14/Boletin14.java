
package boletin14;

import boletin14.Partes.*;

public class Boletin14 {

    public static void main(String[] args) {
        Monitor mo=new Monitor("Samsung");
        Procesador pro=new Procesador(5f);
        Teclado te=new Teclado("Samsung");
        Ordenador or=new Ordenador(mo,te,pro,1500f);
        or.toString();
        or.verPrecio();
        or.verMarcaTeclado();
        or.verVelocidadeCPU();
    }
    
}
