
/**
 * autor/a:
 * version:
 * fecha: 
 * El siguiente script sirve a index.html y genera funciones 
 * para calculos aritméticos
 */

// 1 - declaracion de funciones
// 1.1 - funcion declarada no parametrica

function saludar() {
    // alert("Hola Gato!");
}

// 1.2 Llamada a la funcion saludar

saludar();

// 1.3 Funcion declarada y parametrica

function saludar2(nombre) {
    // alert("Hola "+ nombre);
}

// 1.4 Llamada a saludar2

saludar2("Ricardo");
saludar2("Jose Luis");

// 2 - Funcion declarada sumar parametrica

function sumar(num1, num2) {
        // Declaracon de variable local
        let resultado = num1 + num2 ;
        // alert("La suma de "+ num1 + " + " + num2 +" = "+ resultado);
        // Valor de retorno
        return resultado;
}

// 2.1 llamada a sumar
// sumar(10,5);
//  console.log(sumar(10, 5)*2);

// 3 - funcion declarada restar
function restar(num1, num2){
    let resultado = num1 - num2;
    return resultado;
}
// console.log(restar(8, 2)+2);

// funcion declarada multiplicar y dividir

function dividir(num1, num2) {
    let resultado = num1 / num2 ;
    return resultado;
}
// console.log(dividir(10, 5));

function multiplicar(num1, num2){
    let resultado = num1 * num2 ;
    return resultado;
}
// console.log(multiplicar(4, 2));


// Expresiones Flecha
const sumarFlecha = (num1, num2) => num1+num2;

//Llamada de la flecha
console.log(sumarFlecha(7, 23));
