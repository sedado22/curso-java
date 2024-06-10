package CLASE28;

public class BucleWhile {
    public static void main(String[] args) {
        // 1 - variables
        int contador = 0;
        // 2 - proceso mediante while
        while (contador <= 100) {
            // Bloque de sentencia a repetirse
            System.out.println("El valor de la variable es: " + contador);
            // Actualizamos el valor de la variable
            contador++;
        }
        System.out.println("Se acabo la joda...");
    }
}
