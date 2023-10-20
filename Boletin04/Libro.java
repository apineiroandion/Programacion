
package boletin4;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    //CONSTRUCTORES
    public Libro(){}
    public Libro(String titulo,String autor,int ano, short numPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.ano=ano;
        this.numPaginas=numPaginas;
    }
    //METODO QUE AMOSA AS CARACTERISTICAS
    public void amosar(){
        System.out.println("CARACTERISTICAS DO LIBRO: "
                + "\n titulo: "+titulo
                + "\n autor: "+autor
                + "\n ano: "+ano
                + "\n numero de paxinas: "+numPaginas
                + "\n valoracion: "+valoracion);
    }
    //METODOS DE ACCCESO
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public String getAutor(){
        return autor;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public int getAno(){
        return ano;
    }
    public void setNumPaginas(short numPaginas){
        this.numPaginas=numPaginas;
    }
    public short getNumPaginas(){
        return numPaginas;
    }
    public void setValoracion(float valoracion){
        this.valoracion=valoracion;
    }
    public float getValoracion(){
        return valoracion;
    }
}
