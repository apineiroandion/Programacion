package boletin3_5;
import java.util.Scanner;
public class Boletin3_5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        float soldoBruto;
        float soldoFixo;
        float soldoNeto;
        float importeTotalVentas;
        float kmRealizados;
        int ndias;
        final float comision=0.5f;
        final float quilometraxe=2;
        final float dietas=30;
        final float irpf=0.18f;
        final float ss=36;
        System.out.println("Introduce el sueldo fijo: ");
        soldoFixo=scan.nextFloat();
        System.out.println("Introduce el importe total de las ventas: ");
        importeTotalVentas=scan.nextFloat();
        System.out.println("Introduce los kilometros realizados: ");
        kmRealizados=scan.nextFloat();
        System.out.println("Cuantos dias te has desplazado?: ");
        ndias=(int) scan.nextFloat();
        soldoBruto=soldoFixo+(importeTotalVentas*comision)+(kmRealizados*quilometraxe)+(ndias*dietas);
        soldoNeto=soldoBruto-(soldoBruto*irpf)-ss;
        System.out.println("O soldo bruto e: "+soldoBruto);
        System.out.println("O soldo neto e: "+soldoNeto);
    }
    
}
