import getDataFetch from "../helpers/getData.js";
import { printCardsHouses } from "./printHouses.js";

const urlFavorites = 'http://localhost:3000/favorites';
const container = document.querySelector('.cards');

document.addEventListener('DOMContentLoaded', async()=>{
    const favorites = await getDataFetch(urlFavorites)
    printCardsHouses(container, favorites);
})