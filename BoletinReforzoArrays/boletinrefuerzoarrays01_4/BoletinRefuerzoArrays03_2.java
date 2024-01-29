
package boletinrefuerzoarrays03_2;

public class BoletinRefuerzoArrays03_2 {

    public static void main(String[] args) {
        Aplicacion app=new Aplicacion();
        app.iniciarArray();
        Contar.conta(app.getNumeros());
        Ver.visualizar(app.getNumeros());
        Ordenar.ordenar(app.getNumeros());
        Contar.comprobarCincos(app.getNumeros());
    }
    
}
