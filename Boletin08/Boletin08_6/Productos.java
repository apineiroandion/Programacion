
package boletin08_6;

import javax.swing.JOptionPane;

public class Productos {
    private String nome;
    private int ventasAnuais;
    
    public Productos(){}
    public Productos(String nome, int ventasAnuais){
        this.nome=nome;
        this.ventasAnuais=ventasAnuais;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setVentasAnuais(int ventasAnuais){
        this.ventasAnuais=ventasAnuais;
    }
    
    public void verDatos(){
        if(ventasAnuais<=100) JOptionPane.showMessageDialog(null, "consumo baixo");
        else if(ventasAnuais>100 && ventasAnuais<=500) JOptionPane.showMessageDialog(null, "consumo medio"); 
        else if(ventasAnuais>500 && ventasAnuais<=1000) JOptionPane.showMessageDialog(null, "consumo alto");
        else JOptionPane.showMessageDialog(null, "primera necesidade");
        }
    }


