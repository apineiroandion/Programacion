
package boletin4;

public class Boletin4 {

    public static void main(String[] args) {
        Libro libroUn=new Libro();
        Libro libroDous=new Libro("El Quijote","Cervantes",1605,(short)80);
        libroUn.setTitulo("NuevoLibro");
        libroUn.setAutor("UnTipo");
        libroUn.setAno(1940);
        libroUn.setNumPaginas((short)25);
        libroUn.setValoracion(10f);
        
        //Prueba
        
        libroUn.amosar();
        libroDous.amosar();
    }
    
}
