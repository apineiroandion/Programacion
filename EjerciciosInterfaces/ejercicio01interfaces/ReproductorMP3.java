
package ejercicio01interfaces;

public class ReproductorMP3 implements ReproductorMusical {

    @Override
    public void play() {
        System.out.println("reproduciendo mp3");
    }

    @Override
    public void pause() {
        System.out.println("pausando mp3");
    }

    @Override
    public void stop() {
        System.out.println("parando mp3");
    }
    
}
