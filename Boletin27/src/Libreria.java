import java.io.Serializable;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Libreria implements Serializable {
    private ArrayList<Libro> libros = new ArrayList<>();

    public Libreria() {
    }

    public void engadirLibro(String nome, String autor, Float precio, Integer unidades){
        libros.add(new Libro(nome, autor, precio, unidades));
    }
    public void consultarLibro(String titulo){
        int contador = 0;
        for (int i=0; i<libros.size(); i++){
            if(libros.get(i).getNome().equals(titulo)){
                System.out.println(libros.get(i).getNome()+" custa: "+libros.get(i).getPrecio().toString());
                contador ++;
            }
        }
        if (contador == 0){
            System.out.println("El libro: "+titulo+"no se encuentra en el sistema");
        }
    }
    public void amosarLibros(){
        for (int i=0; i<libros.size(); i++){
            System.out.println((i+1)+" "+libros.get(i).toString());
        }
    }
    public void borrarLibros(){
        for (int i=0; i<libros.size(); i++){
            if (libros.get(i).getUnidades() == 0){
                libros.remove(i);
            }
        }
    }
    public void modificarPrecio(){
        amosarLibros();
        int indice = LerDatos.lerEnteiro("Introduce el indice: ")-1;
        Float nuevoPrecio = LerDatos.lerFloat("Introduce el nuevo precio: ");
        libros.get(indice).setPrecio(nuevoPrecio);
    }
    public void guardarDatos(Libreria lib){
        try{
            FileOutputStream fos = new FileOutputStream("libreria.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lib);
            oos.close();
            fos.close();
            System.out.println("Objeto Serializado");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public Libreria cargarDatos(Libreria lib){
        try{
            FileInputStream fis = new FileInputStream("libreria.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            lib = (Libreria) ois.readObject();
            ois.close();
            fis.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Objeto desserializado");
        return lib;
    }


    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
