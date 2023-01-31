import getDataFetch from "../helpers/getData.js"
import { printCardsHouses } from "../modules/printHouses.js";
import postDataFetch from "../helpers/postData.js";


const urlHousing = "http://localhost:3000/casaRoyal";

const containerHouses = document.querySelector('.cards');

const urlFavorites = 'http://localhost:3000/favorites';



document.addEventListener('DOMContentLoaded', async()=>{
    try {
        const places = await getDataFetch(urlHousing)
    
        printCardsHouses(containerHouses, places);
        
    } catch (error) {
        alert('exists an error.')
    }
})


// funcionality of click on house and apartments details.

document.addEventListener('click',({target})=>{
    if(target.classList.contains('apto')){
        sessionStorage.setItem('placesDetails', JSON.stringify(target.id));
        location.href='./pages/details.html';
    }

})

//funcionality of click on heart favorites.
document.addEventListener('click', async({target})=>{
    if(target.classList.contains('favorite')){
        const idFavorite = target.id
        const urlHousesFavorite = `${urlFavorites}?id=${idFavorite}`
        console.log(urlHousesFavorite);

        const favorites = await getDataFetch(urlHousesFavorite);

        const favoriteHouse = await getDataFetch(`${urlHousing}/${idFavorite}`);

        if(favorites.length === 0 && Object.entries(favoriteHouse).length){

            await postDataFetch(urlFavorites, favoriteHouse);
            const data = await getDataFetch(urlFavorites);
        }
    }
})


    //Listen the event of submit the search input.


const search = document.querySelector('#search');
console.log(search);


search.addEventListener('input',async()=>{

    const searchTerm = search.value
    console.log(searchTerm);
    try {
        if (searchTerm) {
            const datosProperties = await getDataFetch(urlHousing);
            const resultadoBusqueda = datosProperties.filter((property) => {
                return property.location.toLowerCase().includes(searchTerm.toLowerCase())
            }); 
    
            printCardsHouses(containerHouses, resultadoBusqueda)
        } 
        else {
            const datosProperties = await getDataFetch(urlHousing);
            printCardsHouses(containerHouses, datosProperties)
        }
    } catch (error) {
        console.log(error)
    }
})


// filters sections.

const optionAll = document.getElementById('all');
const optionHouse = document.getElementById('house');
const optionApt = document.getElementById('apartment');
const optionSale = document.getElementById('sale');
const optionRent = document.getElementById('for rent');

// this sections go to inside of array

const options = [optionAll,optionHouse,optionApt];

let resultadoFiltrado = [];
options.forEach(option=>{
    option.addEventListener('click', async()=>{
        const datosProperties = await getDataFetch(urlHousing);
        resultadoFiltrado;
        console.log(datosProperties);
        if (option.id === 'all'){
            console.log(option.id);
            resultadoFiltrado = datosProperties;
            console.log(resultadoFiltrado);
        }else{
            console.log(option.id);
            console.log(resultadoFiltrado);
            resultadoFiltrado = datosProperties.filter((property)=>{
                return property.type.toLowerCase() === option.id
    
            });
        }
        printCardsHouses(containerHouses, resultadoFiltrado);
    })
})

const optionStatus = [optionSale, optionRent];

optionStatus.forEach(status =>{
    status.addEventListener('click', async()=>{
        const datosStatus = await getDataFetch(urlHousing);
        resultadoFiltrado;
        if(status.id !== 'all' && 'house' && 'apartment'){
            resultadoFiltrado = datosStatus.filter((estado)=>{
                return estado.status.toLowerCase() === status.id
            })
        }
        printCardsHouses(containerHouses, resultadoFiltrado);
    })
})
