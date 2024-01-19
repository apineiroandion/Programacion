
package ejercicio01interfaces;

public class Ejercicio01Interfaces {

    public static void main(String[] args) {
        ReproductorMP3 rmp3=new ReproductorMP3();
        ReproductorStreaming rs=new ReproductorStreaming();
        
        rmp3.play();
        rmp3.pause();
        rmp3.stop();
        rs.play();
        rs.pause();
        rs.stop();
    }
    
}
