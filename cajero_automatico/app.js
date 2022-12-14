const prompt= require("prompt-sync")();

let lista =[];
let respuesta = "";
// let bienvenida = prompt("Bienvenido a tu cajero automatico elige[INGRESAR o REGISTRARSE]: ").toLocaleUpperCase();
    
// if(bienvenida == "REGISTARSE"){
//     // CREAR USUARIO
//     do {
//     respuesta = (prompt("Desea Registarse[SI/NO]: ")).toUpperCase();
//        if(respuesta == "SI"){
//             let nuevoUsuario =
//                 {
//                     nombre: prompt("Digita tu nombre: "),
//                     documento: parseInt(prompt("Diligencia tu numero de documento: ")),
//                     contrasenia: prompt("Digita tu contraseña: "),
//                     tipoUsuario: parseInt(prompt("Digita 1 para Administrador y 2 para Cliente: "))
//                 };
    
//            lista.push(nuevoUsuario);
//            console.log(lista);
//         }else{
//             console.log("Nos vemos a la proxima");
            
//         }

      
//     }while (respuesta == "SI"); 
   
    
// }else if(bienvenida == "INGRESAR"){
//     //LOGIN
//     let documento = parseInt(prompt("Ingrese su numero de documento: "));
//     let contrasenia = prompt("Ingrese su contrasenia: ");

    //    verificacionUsuario(documento, contrasenia); 

    //    if(verificacionUsuario == true)

   
// }
    
// lista = [
//     { nombre: 'vIVI', documento: 1234, contrasenia: 'SDFG', tipoUsuario: 1 },
//     { nombre: 'dANI', documento: 4567, contrasenia: 'HGGJ', tipoUsuario: 2 }
//   ];

function verificacionUsuario(documento, contrasenia) {
    let encontrado = [];
    lista.forEach(
        function(objeto){
            if(objeto.documento === documento && objeto.contrasenia ===contrasenia){
                encontrado.push(documento);
                encontrado.push(contrasenia)}
            });
    console.log(encontrado);
     if(encontrado.length > 0){
        return true;
     }
     return false;
}         
 

//    console.log("funcion resultado: "+ verificacionUsuario(123, 'SDFG' ));




    // if(documento == documentoRegistrado && contrasenia == contraseniaRegistrada){


    // }


