/**
 * Autor/a
 * version
 * fercha
 * El siguiente script genera control de flujos mediante switch
 */

//1 - Declaracion de las variables
let opc;

// Inicializacion de variable de control

let repite = false; // Esta es una variable FLAG 
let counter = 1; // Variable contadora

do {

    //2- Inicializacion de la variable por instruccion de entrada prompt
    opc = prompt("Bienvenido/a\nIngrese 1 si desea un saludo\nIngrese 2 si desea una despedida");

    //3 - Proceso mediante estructura de switch
    switch (opc) {
        case "1":
            document.write("<h2>Hola Pancho</h2>");
            repite = false;
            break; // estructura de salto, sentencia obligatoria dentro del switch
        case "2":
            document.write("<h2>Anda maquina, nadie te detiene</h2>");
            repite = false;
            break; //
        default:
            alert("Dale gato, no es tan dificil es 1 o 2");
            //Actualizacion de la variable de control
            repite = true;
            counter++;
            break;
    }

} while (repite && counter <= 3);
if (counter > 3){
    alert("Ya fue, tomatelas");
}




