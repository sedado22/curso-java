// Ejemplo de codigo sincronico
// console.log("Esto se imprime primero");
// setTimeout(function(){console.log("Esto se imprime ultimo")},5000);
// console.log("Esto se imprime segundo");


// Fetch
// Al no cargar el segundo parametro por defecto hacemos un GET
fetch("https://rickandmortyapi.com/api/character/")
    // El primer .then recibe la cadena string (json) y la predispone a transformar el objeto
    // .then recibe como parametro una funcion con su propio parametro
    .then(function (respuesta) {
        // Transformamos el JSON en objeto
        return respuesta.json();
    })
    .then(function (datos) {
        console.log(datos);
    })
    .catch(function (error) {
        console.error(error);
    })

// Declaramos una funcion que renderiza elementos en el DOM
function pedirDatos() {
    fetch("https://rickandmortyapi.com/api/character/")
        .then(function (respuesta) {
            return respuesta.json();
        })
        .then(function (personajes) {
            // Traemos el espacio de renderizado
            const contenedor = document.getElementById("contenedor-tarjetas");
            // Utilizamos un for-each
            personajes.results.forEach(function (dato) {
                //Creamos el elemento html
                const article = document.createElement('article');
                //Agregamos estilo a article
                article.classList.add("tarjeta");
                //Inyectamos contenido a <article>
                article.innerHTML = `
            <img src="${dato.image}" alt="Imagen del personaje ${dato.name}" class="card_img-size">
            <label>Nombre:</label>
            <p>${dato.name}</p>
            <div>
              <label>Estado:</label>
              <p><i class="fa-solid fa-circle ${dato.status.toLowerCase()}"></i>${dato.status}</p>
              <label>Planeta:</label>
              <p>${dato.location.name}</p>
            </div>
            `
            // Adjuntamos el contenido 
            contenedor.appendChild(article);

            })
        })
        .catch(function (error) {
        console.error(error);
        })

}

//Llamamos a la funcion
pedirDatos();