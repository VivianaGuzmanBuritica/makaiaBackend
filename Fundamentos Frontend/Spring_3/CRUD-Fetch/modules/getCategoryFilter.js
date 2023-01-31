export const getCategoryFilter = (list) =>{
    const categoriasEnLista = list.map((item) => `${item.categoria}`);
    const categoriaDeFiltrado = [...new Set((categoriasEnLista))];
    console.log(categoriaDeFiltrado);
    return categoriaDeFiltrado;
}   