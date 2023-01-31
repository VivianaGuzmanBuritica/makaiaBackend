export const printCardsPropiedad = (contenedor, arrayPersonajes) => {
    contenedor.innerHTML = "";

    arrayPersonajes.forEach(propiedad => {
        const article = document.createElement("article");
        article.classList.add("main__card");
        article.innerHTML = `
        <figure class="card__image">
            <img id=${propiedad.id} src=${propiedad.image} alt="${propiedad.name}" class="card__img">
        </figure>
        <div class="descripcion">
            <h4>${propiedad.name}</h4>
            <p> Área: ${propiedad.area}m2</p>
            <p> Número de habitaciones: ${propiedad.num_habitaciones}</p>
            <p id="lugar"> Ubicación: ${propiedad.lugar}</p>
            <p id="categoria"> Tipo de vivienda: ${propiedad.categoria}</p>
        </div>
                <button class="card__delete" name='${propiedad.id}'>❌</button>
                <button class="card__edit" name='${propiedad.id}'>✏</button>
                <button class="card__favorite" name='${propiedad.id}'>❤</button>
                
        `;

        contenedor.appendChild(article);
    });
};