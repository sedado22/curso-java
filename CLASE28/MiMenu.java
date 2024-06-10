package CLASE28;

import java.util.Scanner;

public class MiMenu {

    public static void main(String[] args) {
        // 1 -Declaracion de las variables.
        String opcion;
        // 2 - Declaracion de scanner
        Scanner teclado;
        // 3 - Instanciacion del objeto
        teclado = new Scanner(System.in);
        // 4 - Diseño del menu de opciones.
        System.out.println("Bienvenido gato");
        System.out.println("Opcion 1 - Dar un saludo");
        System.out.println("Opcion 2 - Dar un regalo");
        System.out.println("Opcion 3 - Despedir");

        // 5 -Inicializamos variable opcion
        System.out.println("Ingrese una opcion: ");
        opcion = teclado.nextLine();

        // 6 - Cerramos objeto
        teclado.close();

        // Proceso mediante switch
        switch (opcion) {
            case "1":
                System.out.println("Hola Michifuz!!");
                break;
            case "2":
                System.out.println("Asi que queres un regalo?, aca tenes el paquete!! 8===D ");
                break;
            case "3":
                System.out.println("Estas Despedido pancho!");
                break;

            default:
                System.out.println("Flaco. no es tan dificil, del 1 al 3 amigo....");
                break;
        }
        System.out.println("***END***");
    }

}
