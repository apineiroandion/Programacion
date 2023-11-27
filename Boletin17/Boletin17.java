
package boletin17;

import java.util.ArrayList;

public class Boletin17 {
static ArrayList<Conta> contas=new ArrayList();
static ArrayList<Cliente> clientes=new ArrayList();
    public static void main(String[] args) {
        Menu.pintarMenu(clientes, contas);
    }
    
}
