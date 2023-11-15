package boletin12;

import java.util.ArrayList;
import java.time.LocalTime;
import javax.swing.JOptionPane;
public class Garaxe {

    static private Integer numeroCoches=0;
    static private final Integer MAX_COCHES=5;
    static private final Integer HORAS_PRECIO_UNO=3;
    static private final Float PRECIO_UNO=1.5f;
    static private final Float PRECIO_DOS=0.20f;

    
    public static void aparcarCoche(ArrayList<Coche> coches){
        if (numeroCoches<MAX_COCHES){
            String matricula=LerDatos.lerString("Introduce la matricula: ");
            String marca=LerDatos.lerString("Introduce la marca: ");
            Integer hora=LerDatos.lerEnteiro("Introduce la hora (sin minutos): ");
            Integer minutos=LerDatos.lerEnteiro("Introduce los minutos");
            LocalTime horaEntrada= LocalTime.of(hora, minutos);
            coches.add(new Coche(matricula, marca, horaEntrada, true));
            numeroCoches++;
        }
        else JOptionPane.showMessageDialog(null,
                "El garaje esta lleno, espere a que salga un coche");
    }
    
    public static void sacarCoche(ArrayList<Coche> coches){
        JOptionPane.showMessageDialog(null, "Introduce el id que aparece en consola: ");
        for (int i=0;i<coches.size();i++){
            if(coches.get(i).getEstaDentro()==true){
                System.out.println((i+1)+" "+coches.get(i).toString());
            }
        }
        Integer auxID=LerDatos.lerEnteiro("Introduce el ID: ");
        Integer hora=LerDatos.lerEnteiro("Introduce la hora de salida (sin minutos): ");
        Integer minutos=LerDatos.lerEnteiro("Introduce los minutos");
        LocalTime horaSalida= LocalTime.of(hora, minutos);
        coches.get(auxID).setHoraSalida(horaSalida);
        Float auxPrecio;
        Integer horasDentro;
        horasDentro = coches.get(auxID).getHoraSalida().compareTo
                    (coches.get(auxID).getHoraEntrada());
        if(horasDentro<=3){
            auxPrecio=horasDentro.floatValue()*HORAS_PRECIO_UNO;
        }
        else{
            horasDentro=horasDentro-HORAS_PRECIO_UNO;
            auxPrecio=(PRECIO_UNO*HORAS_PRECIO_UNO)+PRECIO_DOS*horasDentro;
            horasDentro=horasDentro+HORAS_PRECIO_UNO;
        }
        Float dineroIntroducido=LerDatos.lerFloat("El importe a pagar es de "+auxPrecio+"€"
                + "\n)Introduce Dinero: ");
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\nMATRICULA DO COCHE "+coches.get(auxID).matricula
                +"\nTEMPO "+horasDentro
                +"\nPRECIO "+auxPrecio
                +"\nCARTOS RECIBIDOS "+dineroIntroducido
                +"\nCARTOS DEVOLTOS "+(dineroIntroducido-auxPrecio)
                +"\nGRACIAS POR USAR O NOSO APARCADOIRO");
        numeroCoches--;
        coches.get(auxID).setEstaDentro(false);
    }
    
}
