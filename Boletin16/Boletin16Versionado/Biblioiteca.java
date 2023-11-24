
package boletin16;

import java.util.ArrayList;

public class Biblioiteca {
    ArrayList<Libro> libros = new ArrayList();
    ArrayList<Revista> revistas = new ArrayList();
    
    public void añadirLibro(){
        Integer codigo=LerDatos.lerEnteiro("Introduce el codigo");
        String titulo=LerDatos.lerString("Introduce el titulo");
        Integer ano=LerDatos.lerEnteiro("Introduceo ano de publicacion");
        libros.add(new Libro(codigo, titulo, ano));
    }
    public void añadirRevista(){
        Integer numero=LerDatos.lerEnteiro("Introduce el numero");
        Integer codigo=LerDatos.lerEnteiro("Introduce el codigo");
        String titulo=LerDatos.lerString("Introduce el titulo");
        Integer ano=LerDatos.lerEnteiro("Introduceo ano de publicacion");
        revistas.add(new Revista(numero, codigo, titulo, ano));
    }
    public void verDatos(){
        System.out.println("REVISTAS");
        for(int i=0; i<revistas.size();i++){
            System.out.println(revistas.get(i).toString());
        }
        System.out.println("LIBROS");
        for(int i=0; i<libros.size();i++){
            System.out.println(libros.get(i).toString());
        }
    }
}
