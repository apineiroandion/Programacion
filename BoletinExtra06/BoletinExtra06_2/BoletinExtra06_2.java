
package boletinextra06_2;
import javax.swing.JOptionPane;
public class BoletinExtra06_2 {

    public static void main(String[] args) {
        int dia;
        int mes;
        int ano;
        do{
            dia=LerDatos.lerEnteiro("Introduce un dia:");
                    }while(dia<1||dia>31);
        do{
            mes=LerDatos.lerEnteiro("Introduce un mes:");
                    }while(mes<1||mes>12);
        do{
            ano=LerDatos.lerEnteiro("Introduce un ano entre 1600 e 3000:");
                    }while(ano<1600||ano>3000);
        Comprobador.esFechaValida(dia, mes, ano);
        JOptionPane.showMessageDialog(null, Comprobador.esFechaValida(dia, mes, ano));
    }
    
}
