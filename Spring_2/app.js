
const listaVideos = [
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/sOGEMFunCRFtb8DLyBVXJbV-jsoxpJNtsqi3VD-DCdeBjnhsC5_49ITmCXvQRniKZyJesgHYjA=s88-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "musica"
    }, {   
        img_miniatura: "https://i.ytimg.com/vi/OGgqkJpjoFI/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLA2JitqRYcdHTtUW1mtYFL8EefxJQ",
        img_canal:"https://yt3.ggpht.com/kxLF_ryJYy-07wiT2Y6PGj6RHWcQUlgMHMzQDinr_XHExkOJOqCMR8sqEY6mai7nz2RD8VGLCQ=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Qué hace un DATA ANALYTICS, CUÁNTO GANA y cómo serlo 💻💸 Analista de datos",
        canal:"Estudiar con Manu",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/RtevrQZCdAU",
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
        img_miniatura: "https://i.ytimg.com/vi/X4YK-DEkvcw/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLAL6iVyLdpRrPV_70IY2K-Nj0XNYQ",
        img_canal:"https://yt3.ggpht.com/m3FyEdiujaLfCSnUc4b0ec7euCBYU7HhW6MIaJbpWtqCSU4qHrr_ghMXzS-CzuONwEOJVzzX-g=s48-c-k-c0x00ffffff-no-nd-rj",
        titulo:"The Killers - Shot At The Night",
        canal:"TheKillersMusic",
        vistas:"120 M de vistas",
        link: "https://www.youtube.com/embed/X4YK-DEkvcw",
        categoria: "musica"
    }
    // ,
    // {   
    //     img_miniatura: "https://i.ytimg.com/an_webp/yJOdW_P1oPQ/mqdefault_6s.webp?du=3000&sqp=CKCX4p0G&rs=AOn4CLCioQClKo81f3btZwxA4hiESevbRA",
    //     img_canal:"https://yt3.ggpht.com/M3a2Ve-VDeip73bQsvZd6GEVN37_Y8V72syPlkpBSxfYsgWKOItLgNAPMXFM5juLuBVi3SW_pA=s48-c-k-c0x00ffffff-no-rj",
    //     titulo:"¿Qué es UX Design? (Diseño de Experiencia de Usuario)",
    //     canal:"UXTips",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/embed/tfUPbO_vGzM",
    //     categoria: "diseñoUX"
    // },
   
    // {   
    //     img_miniatura: "https://i.ytimg.com/an_webp/Esmo784E99w/mqdefault_6s.webp?du=3000&sqp=CNiC4p0G&rs=AOn4CLDA21Vuc7dwW2rlzW7HNSwJYLJ2XQ",
    //     img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
    //     titulo:"Las leyes de UX que debes dejar de ignorar aunque no diseñes",
    //     canal:"Platzi",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/watch?v=Esmo784E99w",
    //     categoria: "diseñoUX"
    // },
    // {   
    //     img_miniatura: "https://i.ytimg.com/an_webp/yJOdW_P1oPQ/mqdefault_6s.webp?du=3000&sqp=CKCX4p0G&rs=AOn4CLCioQClKo81f3btZwxA4hiESevbRA",
    //     img_canal:"https://yt3.ggpht.com/M3a2Ve-VDeip73bQsvZd6GEVN37_Y8V72syPlkpBSxfYsgWKOItLgNAPMXFM5juLuBVi3SW_pA=s48-c-k-c0x00ffffff-no-rj",
    //     titulo:"¿Qué es UX Design? (Diseño de Experiencia de Usuario)",
    //     canal:"UXTips",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/embed/tfUPbO_vGzM",
    //     categoria: "diseñoUX"
    // },
   
    // {   
    //     img_miniatura: "https://i.ytimg.com/an_webp/Esmo784E99w/mqdefault_6s.webp?du=3000&sqp=CNiC4p0G&rs=AOn4CLDA21Vuc7dwW2rlzW7HNSwJYLJ2XQ",
    //     img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
    //     titulo:"Las leyes de UX que debes dejar de ignorar aunque no diseñes",
    //     canal:"Platzi",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/watch?v=Esmo784E99w",
    //     categoria: "diseñoUX"
    // },
    // {   
    //     img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
    //     img_canal:"https://yt3.ggpht.com/sOGEMFunCRFtb8DLyBVXJbV-jsoxpJNtsqi3VD-DCdeBjnhsC5_49ITmCXvQRniKZyJesgHYjA=s88-c-k-c0x00ffffff-no-rj",
    //     titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
    //     canal:"SpongeBob Lofi",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/embed/tfUPbO_vGzM",
    //     categoria: "musica"
    // }, {   
    //     img_miniatura: "https://i.ytimg.com/an_webp/RtevrQZCdAU/mqdefault_6s.webp?du=3000&sqp=CLGl4p0G&rs=AOn4CLBAP8lZEamsQ-yPNxEdm2FjJ0wj3g",
    //     img_canal:"https://yt3.ggpht.com/ytc/AMLnZu_quXm761MnU-u945BHG7PgaNIQfri5j8id4rWakw=s48-c-k-c0x00ffffff-no-rj",
    //     titulo:"Cómo saber si la programación es para mi",
    //     canal:"Platzi",
    //     vistas:"1.2 M vistas",
    //     link: "https://www.youtube.com/watch?v=RtevrQZCdAU",
    //     categoria: "programacion"
    // }
]


//recorrer el arreglo y renderizar cada una de las tarjetas
const printVideos = (listaVideos, contenedor) =>{
   contenedor.innerHTML= "";

    listaVideos.forEach(video => {
        const article = document.createElement("article");
        article.setAttribute("video_link", video.link);
        article.innerHTML = `

            <figure>
                <img src=${video.img_miniatura} class="miniatura">
           </figure>
            <div class="descripcion">
                <figure>
                    <img src=${video.img_canal} class="canal">
                </figure>
                <div class="texto">
                    <h4>${video.titulo}</h4>
                    <p>${video.canal}</p>
                    <p>${video.vistas}</p>
                </div>
            </div>
        `;
        contenedor.appendChild(article);
    });
}

const contenedorCards = document.querySelector(".videos");
console.log(contenedorCards);

printVideos(listaVideos, contenedorCards);

    //  filtrado por botones
    
   const botonTodos = document.getElementById("todos");
   const botonMusica = document.getElementById("musica");
   const botonProgramacion = document.getElementById("programacion");
   const botonUx = document.getElementById("diseñoUX");

   const filtrarBotones = [botonTodos, botonMusica, botonProgramacion, botonUx];

   filtrarBotones.forEach(boton => {

    boton.addEventListener("click", (event)=>{
        let videosFiltrados = [];

        if(boton.id === "todos"){
            videosFiltrados = listaVideos;
        }else{
            videosFiltrados = listaVideos.filter((video)=>
            video.categoria === boton.id);
        }
    printVideos(videosFiltrados, contenedorCards);
    })
   });


// Play video
const playVideo = document.querySelector(".playVideo");
const clickArticle = document.querySelectorAll("article");
const img_miniatura = document.querySelectorAll(".miniatura");
console.log(img_miniatura);
console.log(clickArticle);


// "https://www.youtube.com/embed/tfUPbO_vGzM"


clickArticle.forEach(articulo =>{

    const link = articulo.getAttribute("video_link");
    console.log(link);

articulo.addEventListener("click", (event)=>{
   
    console.log("click sobre el articulo");

console.log(articulo.video_link);
console.log(articulo.img_miniatura);
    playVideo.innerHTML = `
    <iframe width="560" height="315" src= ${link} title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" allowfullscreen></iframe>
    `;
    
})})




