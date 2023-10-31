
package boletinextra06_2;

public class Comprobador {
    public static boolean esFechaValida(int dia,int mes, int ano){
        boolean esBisiesto;
            if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
                esBisiesto=true;
            else
                esBisiesto=false;
            
        boolean esValido=false;
        if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)&&(dia>=1&&dia<=31)) esValido=true;
        else if((mes==4||mes==6||mes==9||mes==11)&&(dia>=1&&dia<=30)) esValido=true;
        else if(mes==2 && dia>=1 && dia<=28) esValido=true;
        else if(mes==2 && dia==29 && esBisiesto==true) esValido=true;
        else esValido=false;
        return esValido;
    }
}
