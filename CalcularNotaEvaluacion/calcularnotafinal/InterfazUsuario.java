
package calcularnotafinal;

public class InterfazUsuario {
    
    public static void start(){
        Calculadora.setPrimerExamen(LerDatos.lerFloat("Introduce la nota del primer examen:"));
        Calculadora.setSegundoExamen(LerDatos.lerFloat("Introduce la nota del segundo examen:"));
        Calculadora.setExamenPractico(LerDatos.lerFloat("Introduce la nota del examen practico:"));
        int input=LerDatos.lerEnteiro("Introduce el porcentaje de boletines:"
                + "\n1)Mas del 90%"
                + "\n2)Entre el 70% y el 90%"
                + "\n3)Menos del 70%");
        Calculadora.calcularBoletines(input);
        Calculadora.calcularTeorico();
        Calculadora.calcularNotaFinal();
        Calculadora.verResultado();
        int choice=LerDatos.lerEnteiro("Queres calcular outra nota?"
                + "\n1)SI"
                + "\n2)NON");
        switch(choice){
            case 1:
                InterfazUsuario.start();
                break;
            case 2:
                break;
        }
    }

}
