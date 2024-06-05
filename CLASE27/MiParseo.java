package CLASE27;

public class MiParseo {
    public static void main(String[] args) {
        // Declaramos una variable

        String numString = "123";

        // Parseo

        // 1 - Declarar la variable que contendra al nro transformado
        int numInt ;
        numInt = Integer.parseInt(numString);
        System.out.println("El doble del numero es: "+(numInt*2));


    }
}
