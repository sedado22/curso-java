package CLASE27;

//importar libreria
import java.util.Scanner;

/**
 * MiPrimerTeclado
 */
public class MiPrimerTeclado {

    public static void main(String[] args) {
        String nombre;
        double num1, num2;

        // Declaracion del objeto scanner
        Scanner miTeclado;

        // Instanciacion del objeto
        miTeclado = new Scanner(System.in);

        //Procesos
        System.out.println("Ingrese su nombre: ");
        nombre = miTeclado.nextLine(); // nextline es el metodo que nos permite guardar cadena de texto por teclado
        System.out.println("Ingrese un numero: ");
        num1 = miTeclado.nextDouble(); // nextdouble es el metod que nos permite guardar un numero decimal pro teclado
        
        // limpieza del buffer de almacenamiento
        miTeclado.nextLine();

        System.out.println("Ingrese otro numero: ");
        num2 = miTeclado.nextDouble();
        miTeclado.nextLine();

        // cerramos nuestro objeto scanner
        miTeclado.close();

        //resultados por consola
        System.out.println("Hola "+nombre);
        System.out.println("Los numeros elegidos son: "+num1+" y "+num2);
        System.out.println("La suma es: "+(num1+num2));
        System.out.println("La resta es: "+(num2-num2));
        System.out.println("La multiplicacion es: "+(num1*num2));
        System.out.println("La division es: "+(num1/num2));
        System.out.println("Felicitaciones Sorete!!");

    }
}