
package boletinextra02;

import javax.swing.JOptionPane;

public class Menu {
    private BoletinExtra02 principal;
    
    public Menu(){}
    public Menu(BoletinExtra02 principal){
        this.principal=principal;
    }
    public void crearConta(){
        String nomeDoCliente=JOptionPane.showInputDialog("Introduce elnombre del cliente");
        String numeroDeConta="ES"+Integer.toString(0);
        double tipoDeInterese;
        double saldo;
        principal.contas.add(new Conta(nomeDoCliente,numeroDeConta,tipoDeInterese,saldo));
    }
    public void pintarMenu(){
        int i=Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion:"
                + "\n1) Crear conta"
                + "\n2) Facer un ingreso"
                + "\n3) Sacar cartos"
                + "\n4) Facer unha transferncia"));
        switch(i){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
