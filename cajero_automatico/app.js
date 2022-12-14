const prompt= require("prompt-sync")();

let lista =[];
let respuesta = "";

    
do{
respuesta = (prompt("elige[INGRESAR o REGISTRARSE o CERRAR]: ")).toUpperCase();
if(respuesta == "REGISTARSE"){
    // CREAR USUARIO
   
            let nuevoUsuario =
                {
                    nombre: prompt("Digita tu nombre: "),
                    documento: parseInt(prompt("Diligencia tu numero de documento: ")),
                    contrasenia: prompt("Digita tu contraseña: "),
                    tipoUsuario: parseInt(prompt("Digita 1 para Administrador y 2 para Cliente: "))
                };
    
           lista.push(nuevoUsuario);
           console.log(lista);

    
}else if(respuesta == "INGRESAR"){
    //LOGIN
    let documento = parseInt(prompt("Ingrese su numero de documento: "));
    let contrasenia = prompt("Ingrese su contrasenia: ");

       verificacionUsuario(documento, contrasenia); 

       if(verificacionUsuario == true){
        console.log("acceso permitido");
       }

   
}
}while(respuesta != "CERRAR")
    


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


