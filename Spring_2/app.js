
const listaVideos = [
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/watch?v=v3NH6kG-O3s",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "Diseño UX"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "musica"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/v3NH6kG-O3s/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLAXUSOvccjnCRefaXrN-Rzss4ClWg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"Si tuviera que volver a empezar... Cómo lo haría?",
        canal:"deivchoi",
        vistas:"840,115 vistas",
        link: "https://www.youtube.com/watch?v=v3NH6kG-O3s",
        categoria: "programacion"
    },
    {   
        img_miniatura: "https://i.ytimg.com/vi/tfUPbO_vGzM/hq720_live.jpg?sqp=CLDf4Z0G-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBdqeEmW4I9eYseVtI3JXfXRTMNYg",
        img_canal:"https://yt3.ggpht.com/_8PV4sNd9CNRjFBH0Jts2oIMAGwPhKXPTZr9Ngr8awu104-NZJbupzUhPm3cXTF1ALTOW5az=s48-c-k-c0x00ffffff-no-rj",
        titulo:"LOFI Hip Hop Radio: ritmos para relajarse/estudiar a ~ Spongebob Lofi [traer de vuelta lofi girl]",
        canal:"SpongeBob Lofi",
        vistas:"1.2 M vistas",
        link: "https://www.youtube.com/embed/tfUPbO_vGzM",
        categoria: "Diseño UX"
    }
]


//recorrer el arreglo e imprimir cada una de las tarjetas
const printVideos = (listaVideos, contenedor) =>{
   contenedor.innerHTML= "";

    listaVideos.forEach(video => {
        const article = document.createElement("article");
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





