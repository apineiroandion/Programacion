
package boletinextra2_1;


public class Producto {
    private float precioSenIva;
    private final float IVA=0.21f;
    
    public Producto (float precioSenIva){
        this.precioSenIva=precioSenIva;
    }
    
    //metodos
    public void mostrarPrecioConIva(){
        System.out.println("El precio con IVA es: "+ (precioSenIva+(precioSenIva*IVA)));
    }
    //metodos de acceso
    
    public void setPrecioSenIva(float precioSenIva){
        this.precioSenIva=precioSenIva;
    }
    public float getPrecioSenIva(){
        return precioSenIva;
    }
}
