import { printCards } from "./printCards";

export const btnCategoryFilters = (arrayBtns, arrayPropiedad, contenedor) => {
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

  
export const btnCategoryFilters2 = (categoryList, arrayPropiedad, contenedor) => {
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
  
  
  