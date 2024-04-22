/* Operadores en JS */
 /* Utilizaremos los operadores en JS 
 * desarrollando los siguientes ejemplos:
 * Ejemplo de operaciones aritmeticas
 * Ejemplo de operadores de autoasignación
 * Ejemplo de operadores incrementales
 * Ejemplo de operadores relacionales
 * Ejemplo de operadores lógicos
*/

// declaracion e inicializacion de variables
let a = 15;
let b = 3;

document.write("<h2>Valores</h2>");
document.write("<p>El valor de a es : "+(a)+"</p>" );
document.write("<p>El valor de b es : "+(b)+"</p>" );


//Ejemplos de op aritmeticas
document.write("<h2>Operadores Aritmeticos</h2>");
document.write("<p>El valor de a+b es : "+(a+b)+"</p>" );
document.write("<p>El valor de a/b es : "+(a/b)+"</p>" );
document.write("<p>El valor de a*b es : "+(a*b)+"</p>" );
document.write("<p>El valor de a-b es : "+(a-b)+"</p>" );
document.write("<p>El valor de a**b es : "+(a**b)+"</p>" );

//Operadores de auto-asignacion
// a = a+5;

document.write("<h2>Operadores de autoasignacion</h2>");
document.write("<p>El nuevo valor de a+5 es : "+(a+=5)+"</p>" );
document.write("<p>El nuevo valor de a*2 es : "+(a*=2)+"</p>" );
document.write("<p>El nuevo valor de a/2 es : "+(a/=2)+"</p>" );
document.write("<p>El nuevo valor de a-2 es : "+(a-=2)+"</p>" );

// Operador incremental
// a = a+1; a++ //pos-incremento
// ++a // pre-incremento

document.write("<h2>Operadores  Incrementales</h2>");
document.write("<p>El valor de a+1 es igual a 'a++' pero se ve reflejado en el proximo renglon por pos-incremento : "+(a++)+"</p>" );
document.write("<p>aca 'a++' : "+(a)+"</p>" );
document.write("<p>El valor de a+1 es igual a '++a' pero se ve reflejado en este renglon : "+(++a)+"</p>" );
document.write("<p>Lo mismo pero en resta 'a--' : "+(a--)+"</p>" );
document.write("<p>aca 'a--' : "+(a)+"</p>" );
document.write("<p>El valor de a-1 es igual a '--a' pero se ve reflejado en este renglon : "+(--a)+"</p>" );


//Variables y operadores booleanos
// Declaracion de variables booleanas
document.write("<h2>Variables y Operadores booleanos</h2>");
let v = true; // true es una palabra reservada
let f = false; // false es una palabra reservada

//Operadores
document.write("<p>Ir a consola para resultados</p>" );

console.log(3<10);
console.log(123 ==="123"); // === Compara valor y tipo
console.log(123 == "123"); // Compara solamente valor, omite tipo







document.write("<br><br><br><br>");






