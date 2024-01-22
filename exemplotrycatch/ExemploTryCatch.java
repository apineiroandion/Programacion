
package exemplotrycatch;

import java.util.Scanner;

public class ExemploTryCatch {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        do {
            try {
                System.out.print("Ingrese un número en formato de texto: ");
                String input = scanner.nextLine();
                int numero = Integer.parseInt(input);
                System.out.println("Número convertido: " + numero);
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: La entrada no es un número válido. Inténtelo de nuevo.");
            } finally {
                System.out.println("Fin del proceso de conversión.");
            }
        } while (!entradaValida);
    }    
}
