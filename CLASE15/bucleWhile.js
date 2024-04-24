/**
 * Autor
 * version
 * fercha
 * El siguiente script sirve a index2.html y utiliza una accion repetitiva con bucle while
 **/

//1 - Declaracion de variables

let dato;

// Variable de control
let registrar;

// 2 - Inicializacion de las variables
registrar = prompt("Desea registrar datos=(s-n)");

// 3- Proceso mediante bucle while

while (registrar.toLowerCase() === "s") {
    //inicializamos dato
    dato = prompt("Ingrese un dato")
    // Instruccion de salida
    document.write("<p>Usted Ingreso: " + dato + "</p>");
    // Actualizacion de variable de control
    registrar = prompt("Desea ingresar otro dato?(s-n)");
}



