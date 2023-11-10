
package boletinrepaso_01;

public class Menu {

    public static void pintarMenu(){
        int input=LerDatos.lerEnteiro("Elige una opcion:"
                + "\n1)Sacar por consola 5 veces a frase “ isto e un bucle “"
                + "\n2)visualizar   5 números  que pides por teclado"
                + "\n3)visualiza varios números que pides por teclado , remata cando premes o cero ."
                + "\n4)visualiza 4 numeros   que entren por teclado . Os números non poden ser negativos  "
                + "\n5)completa o exercicio anterior visualizando ademáis a suma dos 4 números"
                + "\n6)Calcula o área dun cadrado . O valor do lado o pides por teclado"
                + "\n7)Codifica o programa anterior tendo en conta que o lado non pode ser negativo"
                + "\n8)Completa o programa anterior para que calcule o área de varios cadrados .Remata o programa cando o valor do lado sexa 0 ( condición de fin )"
                + "\n9)Sumar unha serie de números que pedimos por teclado . Cando a suma sexa 100 ou superior visualizamos o resultado "
                + "\n10)Calcula a nota media  de un alumno que ten 6 módulos"
                + "\n11)Supon que nunha clase están 3 alumnos . Calcula a nota media para cada un dos alumnos "
                + "\n12)Queremos codificar un programa que calcule a nota media de unha serie de alumnos."
                + "\n   Como en cada unha das clases ,o nº de alumnos é distinto ."
                + "\n   Cando rematemos de visualizar unha media  preguntamos se queremos repetir o proceso ."
                + "\n   se  a resposta e “si” volvemos a empezar co 2º …. E así con todos ata que a resposta sexa distinta de “si”");
        switch(input){
            case 1:
                Metodos.apartadoUn();
                pintarMenu();
                break;
            case 2:
                Metodos.apartadoDous();
                pintarMenu();
                break;
            case 3:
                Metodos.apartadoTres();
                pintarMenu();
                break;
            case 4:
                Metodos.apartadoCuatro();
                pintarMenu();
                break;
            case 5:
                Metodos.apartadoCinco();
                pintarMenu();
                break;
            case 6:
                Metodos.apartadoSeis();
                pintarMenu();
                break;
            case 7:
                Metodos.apartadoSiete();
                pintarMenu();
                break;
            case 8:
                Metodos.apartadoOcho();
                pintarMenu();
                break;
            case 9:
                Metodos.apartadoNueve();
                pintarMenu();
                break;
            case 10:
                Metodos.apartadoDiez();
                pintarMenu();
                break;
            case 11:
                Metodos.apartadoOnce();
                pintarMenu();
                break;
            case 12:
                Metodos.apartadoDoce();
                pintarMenu();
                break;
        }
    }
}
