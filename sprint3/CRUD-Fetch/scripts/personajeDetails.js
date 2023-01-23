import getDataFetch from "../helpers/getData.js";

//Obtener el id del personaje guardado en el sessionStorage
const idPersonajeStr = sessionStorage.getItem("personajeDetails")
  ? JSON.parse(sessionStorage.getItem("personajeDetails"))
  : null;

const idPersonaje = idPersonajeStr ? parseInt(idPersonajeStr) : null;

console.log(idPersonaje);

//Obtener la información de este personaje realizando una petición GET

const urlPerson = `http://localhost:3000/propiedad/${idPersonaje}`;
const title = document.querySelector(".title");
const container = document.querySelector(".main");

document.addEventListener("DOMContentLoaded", async () => {
  try {
    const personaje = await getDataFetch(urlPerson);

    title.innerText = `Página de detalles de ${personaje.name}`;
    //2. Insertar la información
    container.innerHTML = `
        <figure class="main__figure">
            <img src="${personaje.img_detalle}" alt="${personaje.name}">
        </figure>
        <ol>              
            <li>Nombre:  ${personaje.name}</li>
            <li>Area:  ${personaje.area} </li>
            <li>Area:  ${personaje.lugar} </li>
            <li>Area:  ${personaje.num_habitaciones} </li>
            <li>Area:  ${personaje.categoria} </li>
        </ol>
`;
  } catch (error) {
    console.log(error);
    alert(error);
  }
});
