package CLASE28;

import java.util.*;


public class Promedios {

    public static void main(String[] args) {
        
        // 1 - Declaracion de variables
        int nota ;
        // 2- Declarar objetos
        Scanner teclado;
        // 3- instanciar objeto
        teclado = new Scanner(System.in);
        // 4- inicializacion de variables por instruccion de entrada
        System.out.println("Ingrese la nota: ");
        nota = teclado.nextInt();
        teclado.nextLine(); /*/limpio buffer */
        // 5 - proceso if-else-if
        if (nota == 10) {
            System.out.println("Es cuadro de honor");
        } else if( nota>=6 && nota<10){
            System.out.println("Estudiante promedio");
        }else if(nota>=1 && nota<6){
            System.out.println("Burro total");            
        }else if(nota==0){
            System.out.println("Nace de vuelta pibe");
        } else {
            System.out.println("Chusqueaste el numero, revisa de nuevo comuñe");
        }
        //Ultima instruccion de salida
        System.out.println("*** END ***");
        //cerramos scanner
        teclado.close();
    }

}
