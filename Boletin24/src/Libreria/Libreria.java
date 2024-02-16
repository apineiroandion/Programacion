
package Libreria;
import datos.LerDatos;
import java.util.ArrayList;
import java.util.Scanner;

public class Libreria {
    Scanner scan=new Scanner(System.in);
    ArrayList<Libro> libros=new ArrayList<>();

    public Libreria() {
    }
    
    public Libro crearLibro(){
        String titulo=LerDatos.lerString("Introduce el titulo");
        String autor=LerDatos.lerString("Introduce el autor");
        String ISBN=LerDatos.lerString("Introduce el ISBN");
        Float prezo=LerDatos.lerFloat("Introduce el precio");
        Integer numeroUnidades=LerDatos.lerEnteiro("Cantas unidades queres engadir?");
        return new Libro(titulo,autor,ISBN,prezo,numeroUnidades);
    }
    
    public String añadirLibro(){
        libros.add(crearLibro());
        return "libro añadido";
    }
    
    public void mostrarLibros(){
        for(int i=0;i<libros.size();i++){
            System.out.println(i+" "+libros.get(i).getTitulo()+" "+libros.get(i).getNumeroUnidades());
        }
    }
    
    public void venderLibros(){
        mostrarLibros();
        System.out.println("ELIGE EL INDICE DEL LIBRO QUE QUIERES VENDER:");
        int opcion=scan.nextInt();
        System.out.println("Elige el numero de unidades a vender:");
        int unidades=scan.nextInt();
        
        libros.get(opcion).setNumeroUnidades(libros.get(opcion).getNumeroUnidades()-unidades);
        
        if(libros.get(opcion).getNumeroUnidades()==0){
            System.out.println("Queda 0 unidades, el libro ha desaparecido de la base");
        }
        else if(libros.get(opcion).getNumeroUnidades()<0){
            System.out.println("No puedes vender mas libros de los que quedan, vuelve a intentarlo");
            venderLibros();
        }
        else{
            System.out.println("Quedan "+libros.get(opcion).getNumeroUnidades()+" unidades");
        }
    }
    
    public void consultarUnLibro(){
        mostrarLibros();
        System.out.println("ELIGE EL INDICE DEL LIBRO QUE QUIERES VISUALIZAR:");
        int opcion=scan.nextInt();
        Libro libroAMostrar=libros.get(opcion);
        System.out.println(libroAMostrar.toString());
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
}
