const listaVideos = [
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/sOGEMFunCRFtb8DLyBVXJbV-jsoxpJNtsqi3VD-DCdeBjnhsC5_49ITmCXvQRniKZyJesgHYjA=s88-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "musica"
    }, 
    {   
        img_miniatura: "https://i.ytimg.com/vi/OGgqkJpjoFI/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA2JitqRYcdHTtUW1mtYFL8EefxJQ",
        img_canal:"https://yt3.ggpht.com/kxLF_ryJYy-07wiT2Y6PGj6RHWcQUlgMHMzQDinr_XHExkOJOqCMR8sqEY6mai7nz2RD8VGLCQ=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Qué hace un DATA ANALYTICS, CUÁNTO GANA y cómo serlo 💻💸 Analista de datos",
        canal:"Estudiar con Manu",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/OGgqkJpjoFI",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/an_webp/Esmo784E99w/mqdefault_6s.webp?du=3000&sqp=CODd8Z0G&rs=AOn4CLA5zuqz6P1NP38HbYp7Nc6L_ybiAg",
        img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Las leyes de UX que debes dejar de ignorar aunque no diseñes",
        canal:"Platzi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/Esmo784E99w", 
        categoria: "diseñoUX"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/embed/v3NH6kG-O3s",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/zuCRSwWssVk/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCWkQlTUhnZavnlUELxk0vAKrQmDg",
        img_canal:"https://yt3.ggpht.com/CtEauPCI0YyxX_3D6qaQfnijjW0704RTsfP_3XiM36hOsT-Z_6me6L4Cl6f2YO1M12sghYkWXaI=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Solo relájate 🍀 Deja de pensar demasiado, calma tu ansiedad - Mezcla de Hip Hop Lofi",
        canal:"Estética Lofi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/zuCRSwWssVk",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/OGgqkJpjoFI/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA2JitqRYcdHTtUW1mtYFL8EefxJQ",
        img_canal:"https://yt3.ggpht.com/kxLF_ryJYy-07wiT2Y6PGj6RHWcQUlgMHMzQDinr_XHExkOJOqCMR8sqEY6mai7nz2RD8VGLCQ=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Qué hace un DATA ANALYTICS, CUÁNTO GANA y cómo serlo 💻💸 Analista de datos",
        canal:"Estudiar con Manu",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/OGgqkJpjoFI",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/embed/v3NH6kG-O3s",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/zuCRSwWssVk/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCWkQlTUhnZavnlUELxk0vAKrQmDg",
        img_canal:"https://yt3.ggpht.com/CtEauPCI0YyxX_3D6qaQfnijjW0704RTsfP_3XiM36hOsT-Z_6me6L4Cl6f2YO1M12sghYkWXaI=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Solo relájate 🍀 Deja de pensar demasiado, calma tu ansiedad - Mezcla de Hip Hop Lofi",
        canal:"Estética Lofi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/zuCRSwWssVk",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/OGgqkJpjoFI/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA2JitqRYcdHTtUW1mtYFL8EefxJQ",
        img_canal:"https://yt3.ggpht.com/kxLF_ryJYy-07wiT2Y6PGj6RHWcQUlgMHMzQDinr_XHExkOJOqCMR8sqEY6mai7nz2RD8VGLCQ=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Qué hace un DATA ANALYTICS, CUÁNTO GANA y cómo serlo 💻💸 Analista de datos",
        canal:"Estudiar con Manu",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/OGgqkJpjoFI",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/embed/v3NH6kG-O3s",
        categoria: "programacion"
    }, 
    {   
        img_miniatura: "https://i.ytimg.com/an_webp/Esmo784E99w/mqdefault_6s.webp?du=3000&sqp=CODd8Z0G&rs=AOn4CLA5zuqz6P1NP38HbYp7Nc6L_ybiAg",
        img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Las leyes de UX que debes dejar de ignorar aunque no diseñes",
        canal:"Platzi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/Esmo784E99w", 
        categoria: "diseñoUX"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/zuCRSwWssVk/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCWkQlTUhnZavnlUELxk0vAKrQmDg",
        img_canal:"https://yt3.ggpht.com/CtEauPCI0YyxX_3D6qaQfnijjW0704RTsfP_3XiM36hOsT-Z_6me6L4Cl6f2YO1M12sghYkWXaI=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Solo relájate 🍀 Deja de pensar demasiado, calma tu ansiedad - Mezcla de Hip Hop Lofi",
        canal:"Estética Lofi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/zuCRSwWssVk",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/embed/v3NH6kG-O3s",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/zuCRSwWssVk/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLCWkQlTUhnZavnlUELxk0vAKrQmDg",
        img_canal:"https://yt3.ggpht.com/CtEauPCI0YyxX_3D6qaQfnijjW0704RTsfP_3XiM36hOsT-Z_6me6L4Cl6f2YO1M12sghYkWXaI=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Solo relájate 🍀 Deja de pensar demasiado, calma tu ansiedad - Mezcla de Hip Hop Lofi",
        canal:"Estética Lofi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/zuCRSwWssVk",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/an_webp/Esmo784E99w/mqdefault_6s.webp?du=3000&sqp=CODd8Z0G&rs=AOn4CLA5zuqz6P1NP38HbYp7Nc6L_ybiAg",
        img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Las leyes de UX que debes dejar de ignorar aunque no diseñes",
        canal:"Platzi",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/Esmo784E99w", 
        categoria: "diseñoUX"
    },

];

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
   console.log(listaVideos);

})
}

agregar(form);

let videos = sessionStorage.getItem("videos")
  ? JSON.parse(sessionStorage.getItem("videos"))
  : [];

console.log(videos);

//Escuchamos al evento DOMContentLoaded (Cuando la página recarga o se renderiza) y cuando este evento ocurre se ejecuta el callback (función que es pasada como parámetro a la función o método .addEventListener('nombreDelEvento', callback)).
document.addEventListener("DOMContentLoaded", () => {
  if (videos.length === 0) {
    //Guadar el array videos a sessionStorage con el método setItem(). este método recibe dos parámetros: 1. es la Key (el nombre de la propiedad donde vamos almacenar los datos) 2. Los datos queremos almacenar. Estos datos deben guardarse en el storage como formato JSON.
    sessionStorage.setItem("videos", JSON.stringify(listaVideos));
    videos = JSON.parse(sessionStorage.getItem("videos"));
    console.log(videos);
  }})

// const enviar = document.querySelector(".enviar");

// enviar.addEventListener("click", _ => {
//     window.location.href = "index.html";
// })

// export {agregar};