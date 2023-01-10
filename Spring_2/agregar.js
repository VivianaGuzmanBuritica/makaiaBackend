const listaVideos = [];

let videos = sessionStorage.getItem("videos")
  ? JSON.parse(sessionStorage.getItem("videos"))
  : [];
console.log("storage antes");
console.log(videos);

  //-------------------------------------
const form = document.querySelector(".form");

function agregar(form) {
    
form.addEventListener("submit", (event)=>{
    event.preventDefault();

    const valuesForm = Object.values(form);
    console.log(valuesForm);

    const valoresInputs = valuesForm.map(valoresInputs =>({
        [valoresInputs.id]: valoresInputs.value
    }));

    const formInfo = {};
    valuesForm.forEach(valoresInputs =>{
        formInfo[valoresInputs.id] = valoresInputs.value
    })

    console.log(formInfo);
    console.log(valoresInputs);

   listaVideos.push(formInfo);
   console.log("lista");
   console.log(listaVideos);

   if (videos.length >= 0) {
   sessionStorage.setItem("videos", JSON.stringify(listaVideos));
   videos = sessionStorage.getItem("videos");
   console.log("storage despues");
   console.log(videos);
   }

})
}

agregar(form);




//Escuchamos al evento DOMContentLoaded (Cuando la página recarga o se renderiza) y cuando este evento ocurre se ejecuta el callback (función que es pasada como parámetro a la función o método .addEventListener('nombreDelEvento', callback)).
// document.addEventListener("DOMContentLoaded", () => {
    
//  
//     //Guadar el array videos a sessionStorage con el método setItem(). este método recibe dos parámetros: 1. es la Key (el nombre de la propiedad donde vamos almacenar los datos) 2. Los datos queremos almacenar. Estos datos deben guardarse en el storage como formato JSON.
//     sessionStorage.setItem("videos", JSON.stringify(listaVideos));
//     videos = sessionStorage.getItem("videos");
//     console.log("storage despues");
//     console.log(videos);

//     // videos = JSON.parse(sessionStorage.getItem("videos"));
//     // console.log("session");
//     // console.log(videos);
//   }})

const enviar = document.querySelector(".enviar");

enviar.addEventListener("click", _ => {
    window.location.href = "index.html";
})

// export {agregar};