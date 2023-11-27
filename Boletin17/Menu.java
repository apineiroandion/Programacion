
package boletin17;

import java.util.ArrayList;

public class Menu {
    public static void pintarMenu(ArrayList<Cliente>clientes, ArrayList<Conta> contas){
        int opcion =LerDatos.lerEnteiro("Introduce a opcion:"
                + "\n1)CREAR CLIENTE"
                + "\n2)CREAR CONTA AHORRO"
                + "\n3)CREAR CONTA CORRIENTE"
                + "\n4)VISUALIZAR CONTAS"
                + "\n5)FACER INGRESO"
                + "\n6)RETIRAR CARTOS");
        switch(opcion){
            case 1:
                Metodos.crearCliente(clientes);
                Menu.pintarMenu(clientes, contas);
                break;
            case 2:
                Metodos.crearContaAhorro(clientes, contas);
                Menu.pintarMenu(clientes, contas);
                break;
            case 3:
                Metodos.crearContaCorriente(clientes, contas);
                Menu.pintarMenu(clientes, contas);
                break;
            case 4:
                Metodos.mostrarContas(contas);
                Menu.pintarMenu(clientes, contas);
                break;
            case 5:
                Metodos.hacerIngerso(contas);
                Menu.pintarMenu(clientes, contas);
                break;
            case 6:
                Metodos.retirarDinero(contas);
                Menu.pintarMenu(clientes, contas);
                break;
            default:
                break;
        }
    }
}
