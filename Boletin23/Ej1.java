
package boletin23;

public class Ej1 {
    private static String texto = "Esto e Java"; 
    private static String texto2 = "Java"; 
    private static String texto3 = "Java desde 0";
    private static String texto4 = "James Gosling Created Xava";
    private static String texto5 = "java java java";
    private static String texto6 = "www. javadesde0. com";
    private static String texto7="javeros";
    private static String texto9="jeve jeve jeve";
    private static String texto10="ABCD";
    private static char letra;
    public static void ej1(){
        System.out.println(texto.length());
    }
    public static void ej2(){
        for(int i=0;i<texto2.length();i++){
            letra=texto2.charAt(i);
        }
        System.out.println(letra);
    }
    public static void ej3(){
        StringBuilder invertido = new StringBuilder(texto3);
        invertido.reverse();
        System.out.println(invertido.toString());
    }
    public static void ej4(){
        String texto4sin = texto4.replace(" ", "");
        System.out.println(texto4sin);
    }
    public static void ej5(){
        int contaVocais=0;
        int contaConsonantes=0;
        int espacios=0;
        for(int i=0; i<texto5.length();i++){
            char letra=texto5.charAt(i);
            if(letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u') contaVocais++;
            else if (letra==' ')espacios++;
            else contaConsonantes++;
        }
        System.out.println("Consonantes: "+contaConsonantes);
        System.out.println("Vocais: "+contaVocais);
        
    }
    public static void ej6(){
        String parte1 = texto6.substring(0, 9);
        String parte2 = texto6.substring(9, texto6.length());
        System.out.println(parte1);
        System.out.println(parte2);
    }
    
    public static void ej7(){
        String mayus=texto7.toUpperCase();
        System.out.println(mayus);
        System.out.println(mayus.toLowerCase());
    }
        
    public static void ej8(){
        boolean esIgual=LerDatos.compararString("Java", "JavaScript");
        System.out.println(esIgual);
    }
    public static void ej9(){
        System.out.println(texto9.replace('e','a'));
    }
    public static void ej10(){
        for(int i=0; i< texto10.length();i++){
            int j= (int) texto10.charAt(i);
            System.out.print(j+" ");
        }
        System.out.println("");
    }
    public static void ej11(){
        String texto11=LerDatos.lerString("Mete un texto pa contar");
        System.out.println(texto11.length());
    }
}
