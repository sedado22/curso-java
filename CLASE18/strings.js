/* DESAFIO 2 
Entendiendo los Strings
* Trabajamos con los distinos métodos asociados a String
*/

// 1- Declaramos una variable que carga un string

let txt = "Hola Comision 24250";

//2 - Consultamos la longitud del string .lenght

console.log(txt.lenght);

//3 - conusltamos la letra cargada en un indice
console.log(txt.charAt(9));

// 4 - === .toUpperCase() .toLowerCase()


// 5- Objetos literales
let Personal1 = {
    // Atributos 
    nombre: "Luis Alfredo",
    apellido: "Rodriguez",
    legajo: "0001a" ,
    // Metodo
    obtenerNombres(){
        console.log(this.nombre+" "+this.apellido);
    }
}

// Llamada al metodo
Personal1.obtenerNombres();

// Consulta de las propiedades
console.log(Personal1.legajo);


// 6 - Objetos JSON
let jsonPersonal1 = `{
"Personal1": {
    "Nombre":"Luis Alfredo",
    "Apellido": "Rodriguez",
    "Legajo": "0001a"
},
"Personal2": {
    "Nombre":"Luisa",
    "Apellido": "Lopez",
    "Legajo": "0002a"
}
}`;

// Reconstruimos el JSON a objetoJS
let personal1obj = JSON.parse(jsonPersonal1);

// Consultamos datos del json transformado a objetojs
console.log(personal1obj.Personal1.nombre);
console.log(personal1obj.Personal1.legajo);

