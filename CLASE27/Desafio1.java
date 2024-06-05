package CLASE27;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        // 1 - variables
        int num1, num2; 
        int res1, res2, res3, res4;

        // 2 - declaracion del objeto
        Scanner teclado;

        // 3 - Instanciacion
        teclado = new Scanner(System.in);

        // 4 - Instanciamos las variables por instruccion de salida/entrada
        System.out.println("Ingrese un numero entero: ");
        num1 = teclado.nextInt(); 
        teclado.nextLine();
        System.out.println("Ingrese otro numero entero: ");
        num2 = teclado.nextInt();
        teclado.nextLine();
        //5 - cerramos teclado
        teclado.close();

        //6 - procesos
        res1 = 2*num1;
        res2 = 3*num1;
        res3 = 2*num2;
        res4 = 3*num2;

        System.out.println("Los numeros elegidos son: "+num1+" y "+num2);
        System.out.println("El doble de: "+num1+" es "+res1+" y el triple es: "+res2);
        System.out.println("El doble de: "+num2+" es "+res3+" y el triple es: "+res4);
        System.out.println("Felicitaciones comuñe!!");

    }    
}
