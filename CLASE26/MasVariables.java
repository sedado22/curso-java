package CLASE26;
public class MasVariables {
    public static void main(String[] args) {
        // Declaracion de las variables. 
        String nombre; 
        String nombrE;
        //inicializacion de variables. 
        nombre = "Fulana Fulanita";
        nombrE = "Mengano Menganito";   
        System.out.println(nombre);
        System.out.println(nombrE);
        //Declaramos variables
        byte num1; //esto carga numeros entre -127 y 128
        int num2; // int son numeros enteros
        double num3; // double es decimal
        char letra; // char almacena solo una letra
        boolean condicion; // boolean es logico carga true o false
        //inicializamos las variables
        num1 = -127;
        num2 = 33;
        num3 = 102.43;
        letra = 'X'; //comillas simples
        condicion = false ; 
        System.out.println("El valor de num1 es; "+ num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(letra);
        System.out.println(condicion);
        // Declaracion de variables matematicas
        int num4, num5, num6, num7;
        int suma, resta, multi;
        //inicializamos las variables
        num4 = 5;
        num5 = 15;
        num6 = 3;
        num7 = 21;
        // Operaciones
        suma = num4 + num5;
        resta = num7 - 10 ;
        multi = num6 * num4;
        //resultados por consola
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);    
        // Operadores de autoasignacion
        // num4 = num4 + 5;
        num4 +=5 ; 
        System.out.println(num4);
        num4 -= 8;
        System.out.println(num4);

        // Operadores incrementales
        // num6 = num6 + 1; 
        System.out.println(num6++);
        System.out.println(num6);
        System.out.println(++num6);

        // Booleanos
        boolean condicion2 = true; 
        System.out.println(condicion&&condicion2);
        System.out.println(condicion||condicion2); // && = Y - || = O
 
        //estructura de seleccoin inf else
        if (condicion&&condicion2) {
            System.out.println("la condicion es verdadera");
        }else{
            System.out.println("la condicion es falsa");
        }

    }
}
