
//***********************CRUD***************************** */ 
// GET DATA FETCH 

const getDataFetch = async (url) => {
    try {
      const response = await fetch(url);
      const data = await response.json();
      return data;
    } catch (error) {
      console.log(error);
    }
  };

 //**************************************************** */ 

 // DELETE DATA FETCH 

 const deleteDataFetch = async (url) => {
    try {
      const option = {
        method: "DELETE",
      };
      const response = await fetch(url, option);
      const resp = await response.json();
      console.log(resp);
      return resp;
    } catch (error) {
      console.log(error);
    }
  };

 //**************************************************** */ 
 // POST DATA FETCH 

 const postDataFetch = async (url, objeto) => {
    try {
      const options = {
        method: "POST",
        body: JSON.stringify(objeto),
        headers: { "Content-type": "application/json; charset=UTF-8" },
      };
      const response = await fetch(url, options);
      const resp = await response.json();
      console.log(resp);
      return resp;
    } catch (error) {
      console.log(error);
    }
  };
  
 //**************************************************** */ 
 // PUT DATA FETCH 

 const putDataFetch = async(url, objeto) => {
    try {
        const options = {
          method: "PUT",
          headers: { "Content-type": "application/json; charset=UTF-8" },
          body: JSON.stringify(objeto),
        };

        const response = await fetch(url, options);
        const resp = await response.json();
        console.log(resp);
        return resp;
        
    } catch (error) {
        console.log(error)
    }
};

 //**************************************************** */ 
//***********************MODULES***************************** */ 
const contenedorPropiedades = document.getElementById("contenedorCards");
  // PRINT CARDS

  const printCards =(jsonPropiedades, contenedor) => {
    contenedor.innerHTML = "";

    jsonPropiedades.forEach(propiedad => {
        const article = document.createElement("article");
        article.classList.add("main__card");
        article.innerHTML = `
        <figure class="card__image">
            <img src=${propiedad.image} alt=${propiedad.name} class="miniatura" id=${propiedad.id} >
        </figure>
        <div class="descripcion">
            <h4>${propiedad.name}</h4>
            <p> Área: ${propiedad.area}m2</p>
            <p> Número de habitaciones: ${propiedad.num_habitaciones}</p>
            <p id="lugar"> Ubicación: ${propiedad.lugar}</p>
            <p id="categoria"> Tipo vivienda: ${propiedad.categoria}</p>
        </div>
        <div class="botones">
                <button class="card__delete" name='${propiedad.id}'>❌</button>
                <button class="card__edit" name='${propiedad.id}'>✏</button>
                <button class="card__favorite" name='${propiedad.id}'>❤</button>
        </div>        
        `;

        contenedor.appendChild(article);
    });
};

   //**************************************************** */ 

  // BOTONES DE FILTRADO

const btnCategoryFilters = (arrayBtns, arrayPropiedad, contenedor) => {
    arrayBtns.forEach((boton) => {
      boton.addEventListener("click", () => {
        const filtro = arrayPropiedad.filter(
          (propiedad) => propiedad.categoria === boton.id
        );
          const filteredPropiedades = boton.id === "all" ? arrayPropiedad : filtro;
          console.log(filteredPropiedades);
          printCards(contenedor, filteredPropiedades);
      });
    });
  };
  
const btnCategoryFilters2 = (categoryList, arrayPropiedad, contenedor) => {
    categoryList.forEach((category) => {
      const categoryBtn = document.getElementById(categoria);
      categoryBtn.addEventListener("click", () => {
        const categoria = categoryBtn.id.slice(0, -1);
        console.log(categoria);
        const filtro = arrayPropiedad.filter((propiedad) => propiedad.categoria === categoria);
        const filteredPropiedades = categoria === "all" ? arrayPerson : filtro;
        console.log(filteredPropiedades);
        printCardsPersonajes(contenedor, filteredPropiedades);
      });
    });
  };

 //**************************************************** */ 

 // GET CATEGORY FILTER

 const getCategoryFilter = (list) =>{
    const categoriasEnLista = list.map((item) => `${item.categoria}`);
    const categoriaDeFiltrado = [...new Set((categoriasEnLista))];
    console.log(categoriaDeFiltrado);
    return categoriaDeFiltrado;
}   
 //**************************************************** */ 
 
 // SUBMIT FORM

 //**************************************************** */ 

const urlPropiedades = "http://localhost:3000/propiedades";
const urlFavoritos = "http://localhost:3000/favoritos";
let propiedades = [];



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
    propiedades = await getDataFetch(urlPropiedades);
    console.log(propiedades);
    printCards(propiedades, contenedorPropiedades);

});
