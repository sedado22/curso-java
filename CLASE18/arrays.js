/**
 * DESAFIO 1
 * Declaramos un array
 * Exploramos los distintos métodos
 * create(crear), read(leer), upload(actualizar), delete(borrar)
 */

// 1 - Declaracion del array
let autos = [" Fiat Uno ", " Renault Fuego "];


// 2 - Impresion del array
console.log(" El array autos es: " + autos);

// Metodos de los arrays
// 3 - Insertamos valores en el array .push()
autos.push(" Peugeot 504 ");
console.log(" Sumamos autos al array: " + autos);
autos.push(" Jeep Renegade " , " Citroneta " , " Cacomovil", " Sorcho ");
console.log(" Sumamos nuevamente autos: " + autos);

//4 - Obtenemos la longitud del array .lenght
let longitud= autos.length;
console.log("La Longitud de autos es: "+longitud);
console.log("La Longitud es: "+autos.length);


//5 - Para Inspeccionar o leer un indice particular utilizamos .at()

console.log("El elemento de indice 3 es: "+autos.at(3));
console.log("El elemento del ultimo indice: "+autos.at(-1));

// 6- Para saber el indice de un elemento utilizamos .indexOf()
console.log("El elemento del citroneta: "+autos.indexOf(" Citroneta "));
console.log("El elemento del citroneta: "+autos.indexOf(" citroneta "));

// 7 - Borramos elementos del array con .splice()
console.log("Eliminamos el indice 2: "+ autos.splice(2,1));
console.log("El array autos es: "+autos );

// 8- Ordenamos con .sort()
console.log("Ordenamos con .sort()" + autos.sort());

//9-  Agregamos datos al principio .unshift()
autos.unshift("Tesla");
console.log("El array autos es: "+autos);

//For
for(let i=0 ; i<5 ; i++){

}

// 10 - for-in

for (let i in autos) {
    console.log(i+"valor: "+autos[i]);
    
}

// 11- for-of

 for (let dato of autos) {
    console.log(dato);
    
}

// 12- Actualizacion
autos[5];

