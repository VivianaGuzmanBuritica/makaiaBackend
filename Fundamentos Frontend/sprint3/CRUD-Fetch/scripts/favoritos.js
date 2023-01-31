import getDataFetch from "../helpers/getData.js";
import { printCardsPropiedad } from "../modules/printPropiedad.js";

const urlFavoritos = "http://localhost:3000/favoritos";
const contenedor = document.getElementById("contenedor");


document.addEventListener('DOMContentLoaded', async() => {
    const favoritos = await getDataFetch(urlFavoritos);
    printCardsPropiedad(contenedor, favoritos);
   

})