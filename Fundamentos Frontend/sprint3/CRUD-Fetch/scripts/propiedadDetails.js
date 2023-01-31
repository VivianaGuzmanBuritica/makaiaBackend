import getDataFetch from "../helpers/getData.js";

//Obtener el id del personaje guardado en el sessionStorage
const idPropiedadStr = sessionStorage.getItem("personajeDetails")
  ? JSON.parse(sessionStorage.getItem("personajeDetails"))
  : null;

const idPropiedad = idPropiedadStr ? parseInt(idPropiedadStr) : null;

console.log(idPropiedad);

//Obtener la información de este personaje realizando una petición GET

const urlPerson = `http://localhost:3000/propiedad/${idPropiedad}`;
const title = document.querySelector(".title");
const container = document.querySelector(".main");

document.addEventListener("DOMContentLoaded", async () => {
  try {
    const propiedad = await getDataFetch(urlPerson);

    title.innerText = `Página de detalles de ${propiedad.name}`;
    //2. Insertar la información
    container.innerHTML = `
        <figure class="main__figure">
            <img src="${propiedad.img_detalle}" alt="${propiedad.name}">
        </figure>
        <ol>              
            <li>Nombre:  ${propiedad.name}</li>
            <li>Area:  ${propiedad.area} </li>
            <li>Area:  ${propiedad.lugar} </li>
            <li>Area:  ${propiedad.num_habitaciones} </li>
            <li>Area:  ${propiedad.categoria} </li>
        </ol>
`;
  } catch (error) {
    console.log(error);
    alert(error);
  }
});
