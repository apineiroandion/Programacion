
package ejercicio01interfaces;

public class ReproductorStreaming implements ReproductorMusical {

    @Override
    public void play() {
        System.out.println("reproduciendo Streaming");
    }

    @Override
    public void pause() {
        System.out.println("reproduciendo Streaming");
    }

    @Override
    public void stop() {
        System.out.println("reproduciendo Streaming");
    }
    
}
