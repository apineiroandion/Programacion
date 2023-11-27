
package boletin17;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
    public static void crearCliente(ArrayList<Cliente> clientes){
        
        String nome=LerDatos.lerString("Intoduce o nome do cliente");
        String apelido=LerDatos.lerString("Introduce apelidos");
        String nif=LerDatos.lerString("Introduce o DNI");
        clientes.add(new Cliente(nome,apelido,nif));
    }
    public static void crearContaCorriente(ArrayList<Cliente> clientes, ArrayList contas){
        for(int i=0;i<clientes.size();i++){
            System.out.println((i+1)+" "+clientes.get(i).toString());
        }
        int clienteSeleccionado=LerDatos.lerEnteiro("Elixe un cliente")-1;
        Long numeroConta=LerDatos.lerLong("Introduce o numero de conta");
        contas.add(new Corriente(numeroConta, clientes.get(clienteSeleccionado)));
    }
    public static void crearContaAhorro(ArrayList<Cliente> clientes, ArrayList contas){
        for(int i=0;i<clientes.size();i++){
            System.out.println((i+1)+" "+clientes.get(i).toString());
        }
        int clienteSeleccionado=LerDatos.lerEnteiro("Elixe un cliente")-1;
        Long numeroConta=LerDatos.lerLong("Introduce o numero de conta");
        double saldo;
        do{
            saldo=LerDatos.lerDouble("Haz un ingreso superior a 1000 €");
        }while(saldo<1000);
        double interese=LerDatos.lerDouble("Introduce otipo de interes:");
        contas.add(new Ahorro(interese, numeroConta,saldo , clientes.get(clienteSeleccionado)));   
    }
    public static ArrayList listarAhorro(ArrayList<Conta> contas){
        ArrayList<Conta> ahorros = new ArrayList();
        for(int i=0;i<contas.size();i++){
            if(contas.get(i) instanceof Ahorro){
                ahorros.add(contas.get(i));
            }
        }
        return ahorros;
    }
    public static ArrayList listarCorriente(ArrayList<Conta> contas){
        ArrayList<Conta> corrientes = new ArrayList();
        for(int i=0;i<contas.size();i++){
            if(contas.get(i) instanceof Ahorro){
                corrientes.add(contas.get(i));
            }
        }
        return corrientes;
    }
    
    public static void mostrarContas(ArrayList<Conta> contas){
        System.out.println("CONTAS CORRIENTES:");
        ArrayList<Conta> corrientes;
        corrientes= Metodos.listarCorriente(contas);
        for(int i=0;i<corrientes.size();i++){
            System.out.println(corrientes.get(i).toString());
        }
        System.out.println("CONTAS AHORRO:");
        ArrayList<Conta> ahorros;
        ahorros= Metodos.listarAhorro(contas);
        for(int i=0;i<ahorros.size();i++){
            System.out.println(ahorros.get(i).toString());
        }
    }
    public static void hacerIngerso(ArrayList<Conta> contas){
        for(int i=0;i<contas.size();i++){
            System.out.println((i+1)+" "+contas.get(i).toString());
        }
        int opcion=LerDatos.lerEnteiro("Introduce el numero:")-1;
        double cantidade=LerDatos.lerDouble("Cantidade a ingresar:");
        contas.get(opcion).ingresar(cantidade);
    }
    public static void retirarDinero(ArrayList<Conta> contas){
        for(int i=0;i<contas.size();i++){
            System.out.println((i+1)+" "+contas.get(i).toString());
        }
        int opcion=LerDatos.lerEnteiro("Introduce el numero:")-1;
        double cantidade=LerDatos.lerDouble("Cantidade a retirar:");
        contas.get(opcion).retirar(cantidade);
    }
}
