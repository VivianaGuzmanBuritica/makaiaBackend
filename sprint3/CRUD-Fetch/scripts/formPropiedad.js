//1. Capturar el formulario

import getDataFetch from "../helpers/getData.js";
import { submitForm } from "../modules/submitForm.js";

const urlPropiedad = "http://localhost:3000/propiedad";
const form = document.querySelector(".form");

//2. Capturamos todos los elementos hijos de este form

const valuesForm = Object.values(form);
console.log(valuesForm);

//--Queremos utilizar este form para crear un nuevo personaje y para editar información de cualquier personaje

const editFormStr = sessionStorage.getItem("editPropiedad")
  ? JSON.parse(sessionStorage.getItem("editPropiedad"))
  : "";

const editForm = editFormStr ? parseInt(editFormStr) : null;

//--- Para que nos actualice el título de acuerdo con la acción que vamos a realizar: Crear nuevo personaje o editar personaje

const title = document.querySelector(".title");
const submitButton = valuesForm[valuesForm.length - 1];
console.log(submitButton);

submitButton.innerHTML = editForm ? "Guardar cambios" : "Crear propieadad";

//--Este evento permite rellenar los campos del formulario cuando el usuario vá a realizar la edición de un personaje
document.addEventListener("DOMContentLoaded", async () => {
  let editPropiedad = {};
  const url = editForm ? `${urlPropiedad}/${editForm}` : urlPropiedad;

  try {
    if (editForm) {
      editPropiedad = await getDataFetch(url);
      console.log(editPropiedad);

      title.innerText = editForm
        ? `Actualiza los datos de ${editPropiedad.name}`
        : "Agregar nueva Propiedad";

      valuesForm.forEach((valueInput) => {
        if (valueInput.id) {
          valueInput.value = editPropiedad[valueInput.id];
        }
      });
    }

    await submitForm(form, url, editForm);
  } catch (error) {
    console.log(error);
    alert(error);
  }
});

