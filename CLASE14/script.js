/**
 * Autor: Mp
 * version: 1.0
 * fecha: 22/04/2024
 * El siguiente script genera control de flujos para un login
 */


// 1 -Declaracion de las variables
let usr;
let clave;

// 2 - Inicializacion de las variables por instruccion de entrada
usr = prompt("Por Favor Ingrese Usuario o Email Validos");
clave = prompt("Por Favor Ingrese una clave valida");


//3 - Proceso de validacion mediante la estructura IF - ELSE

//Operadores 
//Y = &&
//O = ||
//NO

if ((usr ==="juan" || usr === "juan@sarasa.com") && (clave === "123")) {

    document.write("<h2>bien culiado</h2>");
    
} else {
    alert("raja de aca gato");
    
}
