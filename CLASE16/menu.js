/**
 * autor/a:
 * version:
 * fecha: 
 * El siguiente script sirve a index.html y genera una
 * función que se llama menú
 * El menú consta de un switch que por recursividad 
 * vuelve a llamarse a si misma
 */

// 1 - Declaracion de la funcion menu()

function menu() {
    // Declaracion de variable local por I-E
    let opc = prompt("Seleccione una opción:\n1. Sumar\n2. Restar\n3. Multiplicar\n4. dividir\n5. Salir");
    switch (opc) {
        case "1":
            //Init variables
            let dato1 = parseFloat(prompt("Ingrese un numero"));
            let dato2 = parseFloat(prompt("Ingrese otro numero"));
            alert(sumar(dato1, dato2));
            menu();
            break;
        case "2":
            let dato3 = parseFloat(prompt("Ingrese un numero"));
            let dato4 = parseFloat(prompt("Ingrese otro numero"));
            restar(dato3, dato4);
            alert(restar(dato3, dato4));
            menu();
            break;
        case "3":
            let dato5 = parseFloat(prompt("Ingrese un numero"));
            let dato6 = parseFloat(prompt("Ingrese otro numero"));
            multiplicar(dato5, dato6);
            alert(multiplicar(dato5, dato6));
            menu();
            break;
        case "4":
            let dato7 = parseFloat(prompt("Ingrese un numero"));
            let dato8 = parseFloat(prompt("Ingrese otro numero"));
            dividir(dato7, dato8);
            alert(dividir(dato7, dato8));
            menu();
            break;
        case "5":
            document.write("<h2> Hasta Luego! <h2>");
            exit(0);
            menu();
            break;
        default:
            alert(" Opcion no valida!, A ver de vuelta")
            menu();
            break;
    }
}