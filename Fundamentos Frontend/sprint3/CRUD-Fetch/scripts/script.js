import getDataFetch from "../helpers/getData.js";
import deleteDataFetch from "../helpers/deleteData.js";
import {
  btnCategoryFilters,
  btnCategoryFilters2,
} from "../modules/btnCategoryFilters.js";
import { getCategoryFilter } from "../modules/getCategoryFilter.js";
import { printCardsPropiedad } from "../modules/printPropiedad.js";
import postDataFetch from "../helpers/postData.js";

// const dataJson = JSON.stringify(incorrectDataJSON);
// console.log(dataJson);
// console.log(typeof dataJson);

const urlPropiedad = "http://localhost:3000/propiedad";
const urlFavoritos = "http://localhost:3000/favoritos";
let propiedad = [];

const contenedorPropiedad = document.getElementById("contenedorCards");

//-----Capturando el input de búsqueda
const search = document.getElementById("search");

//-----Botones de filtrado--------

//------Capturar el primer conjunto de botones-----
const botonAll = document.getElementById("all");
const casa = document.getElementById("casa");
const apartamento = document.getElementById("apartamento");
const local = document.getElementById("local");
const lote = document.getElementById("lote");
const finca = document.getElementById("finca");

//Colocamos todos estos botones en un array
const arrayBotones = [botonAll, casa, apartamento, local, lote, finca];

document.addEventListener("DOMContentLoaded", async () => {
  sessionStorage.removeItem("editPersonaje");
  sessionStorage.removeItem("personajeDetails");
  try {
    propiedad = await getDataFetch(urlPropiedad);
    console.log(propiedad);

    printCardsPropiedad(contenedorPropiedad, propiedad);
    //Ejecutamos la función que nos permite filtrar x categoría
    btnCategoryFilters(arrayBotones, propiedad, contenedorPropiedad);
    //   printCardsPropiedad(contenedorPropiedad, filtros);

    //----Funcionalidad al segundo conjunto de botones
    const parcialCategories = getCategoryFilter(propiedad);
    const categories = ["all2", ...parcialCategories];
    console.log("categorias  script "+categories);
    btnCategoryFilters2(categories, propiedad, contenedorPropiedad);
    //   printCardsPropiedad(contenedorPropiedad, filtros2);
  } catch (error) {
    console.log(error);

  }
});

document.addEventListener("click", async ({ target }) => {
  //Funcionalidad de ir a detalles del personaje
  if (target.classList.contains("card__img")) {
    sessionStorage.setItem("personajeDetails", JSON.stringify(target.id));
    location.href = "./pages/propiedadDetails.html";
  }
  //Funcionalidad de eliminar un personaje
  if (target.classList.contains("card__delete")) {
    Swal.fire({
      title: "¿Está usted seguro de eliminar?",
      text: "You won't be able to revert this!",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#3085d6",
      cancelButtonColor: "#d33",
      confirmButtonText: "Yes, delete it!",
    }).then(async (result) => {
      if (result.isConfirmed) {
        Swal.fire("Deleted!", "Your file has been deleted.", "success");
        const idPropiedadDelete = parseInt(target.name);
        const urlDelete = `${urlPropiedad}/${idPropiedadDelete}`;

        try {
          await deleteDataFetch(urlDelete);
          propiedad = await getDataFetch(urlPropiedad);
          printCardsPropiedad(contenedorPropiedad, propiedad);
        } catch (error) {
          console.log("No se pudo eliminar hay un error" + error);
        }
      }
    });
  }

  //Inicio de la funcionalidad de edición

  if (target.classList.contains("card__edit")) {
    console.log(target.name);
    sessionStorage.setItem("editPersonaje", JSON.stringify(target.name));
    location.href = "./pages/formPropiedad.html";
  }

  //Para agregar a favoritos
  if (target.classList.contains("card__favorite")) {
    const idFavorito = target.name;
    const urlPropiedadFavorito = `${urlFavoritos}?id=${idFavorito}`;

    const favorito = await getDataFetch(urlPropiedadFavorito);
    //Obtenemos el objeto
    const favoritePropiedad = await getDataFetch(
      `${urlPropiedad}/${idFavorito}`
    );
    if (favorito.length === 0 && Object.entries(favoritePropiedad).length) {
      await postDataFetch(urlFavoritos, favoritePropiedad);
      const data = await getDataFetch(urlFavoritos);
      console.log(data);
    }
  }
});

//Escuchar el evento search del input de búsqueda por nombre
search.addEventListener("search", async () => {
  const searchTerm = search.value;
  try {
    if (searchTerm) {
      const datosPropiedad = await getDataFetch(urlPropiedad);
      const resultadoBusqueda = datosPropiedad.filter((propiedad) =>
        propiedad.name.toLowerCase().includes(searchTerm.toLowerCase())
      );
      printCardsPropiedad(contenedorPropiedad, resultadoBusqueda);
    } else {
      const datosPropiedad = await getDataFetch(urlPropiedad);
      printCardsPropiedad(contenedorPropiedad, datosPropiedad);
    }
  } catch (error) {
    console.log(error);
  }
});

//.then consumir pormesas, metodos del objeto promesas
// try funciones asingcronas para controlar errores, manejador de errores

