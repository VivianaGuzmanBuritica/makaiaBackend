export const printCardsHouses = (contenedor, arrayHouses)=>{
    contenedor.innerHTML= '';

    arrayHouses.forEach(house => {
        const article = document.createElement('article');
        article.classList.add('containerCards');
        article.innerHTML = ` <img src="${house.img}" class="apto" id='${house.id}'>
        <div class="type">${house.type}</div>
        <div class="status">${house.status}</div>
        <button class='favorite' id='${house.id}'>💜</button>
        <div class="price">${house.price}</div>
        <div class="infoCards">
        <div class="containerLocation">
            <div class="location">${house.location}</div>
        </div>
        <div class="containerDirection">
            <div class="direction">${house.direction}</div>
        </div>
        <div class="containerOwner">
            <div class="nameOwner">
                <p class="name"><img src="/img/owner.png">${house.owner}</p>
            </div>
            <div class="containerDate">
                <div class="date">${house.date}</div>
            </div>
        </div>
        <div class="containerInfoArea">
            <div class="containerArea">
                <div class="area"><img src="/img/Area Icon.png">${house.area}</div>
            </div>
            <div class="containerInfoHouse">
                <div class="parking"><img src="/img/Garage Icon.png">${house.parking}</div>
                <div class="bathroom"><img src="/img/Bathroom Icon.png">${house.bathroom}</div>
                <div class="bedroom"><img src="/img/Bedroom Icon.png">${house.bedroom}</div>
            </div>
        </div>
        </div>`;
        contenedor.appendChild(article);
    });
}