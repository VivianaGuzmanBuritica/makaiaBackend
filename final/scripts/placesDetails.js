//Obtain the src of the house for save it in the storage.

import getDataFetch from "../helpers/getData.js";

const srcDetails = sessionStorage.getItem('placesDetails') ? JSON.parse(sessionStorage.getItem('placesDetails')) : null;

const idDetails = srcDetails ? parseInt(srcDetails) : null;

//obtener la informacion de esta imagen, realizando una peticion GET

const urlDetails = `http://localhost:3000/casaRoyal/${idDetails}`;

const containerDetails = document.querySelector('.containerDetails')
document.addEventListener('DOMContentLoaded', async()=>{
    try {
        const placesDetails = await getDataFetch(urlDetails)
        
        containerDetails.innerHTML =` <figure class="picSite">
        <img src="${placesDetails.img}">
    </figure>
        <div class="infoPlacement">
            <div class="city">${placesDetails.type}</div>
            <div class="direction">${placesDetails.status}</div>
            <div class="area">Size: ${placesDetails.area}</div>
            <div class="parking"> Parking: ${placesDetails.parking}</div>
            <div class="bathroom">Bathrooms:  ${placesDetails.bathroom}</div>   
            <div class="bedroom">Bedrooms:  ${placesDetails.bedroom}</div>
            <div class="ownerName">Owner:  ${placesDetails.owner}  ${placesDetails.phone}</div>
            <div class="price"> ${placesDetails.price}</div>
            <div class="description"><p> ${placesDetails.description}</p></div>
        </div>
`

    } catch (error) {
        alert('exists an error');
    }
})