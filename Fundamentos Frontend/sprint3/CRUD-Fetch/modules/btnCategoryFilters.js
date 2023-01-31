import { printCardsPropiedad } from "./printPropiedad.js";

export const btnCategoryFilters = (arrayBtns, arrayPerson, contenedor) => {
  arrayBtns.forEach((boton) => {
    boton.addEventListener("click", () => {
      const filtro = arrayPerson.filter(
        (propiedad) => propiedad.categoria === boton.id
      );
        const filteredPersonajes = boton.id === "all" ? arrayPerson : filtro;
        console.log(filteredPersonajes);
        printCardsPropiedad(contenedor, filteredPersonajes);
    });
  });
};

export const btnCategoryFilters2 = (categoryList, arrayPerson, contenedor) => {
  categoryList.forEach((category) => {
    const categoryBtn = document.getElementById(category);
    categoryBtn.addEventListener("click", () => {
      const categoria = categoryBtn.id.slice(0, -1);
      console.log(categoria);
      const filtro = arrayPerson.filter((propiedad) => propiedad.categoria === categoria);
      const filteredPersonajes = categoria === "all" ? arrayPerson : filtro;
      console.log(filteredPersonajes);
      printCardsPropiedad(contenedor, filteredPersonajes);
    });
  });
};





