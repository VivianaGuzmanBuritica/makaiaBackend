const prompt= require("prompt-sync")();

// let lista =[];
// let respuesta = "";
let depositosCajero = [];

    
// do{
// respuesta = (prompt("elige[INGRESAR o REGISTRARSE o CERRAR]: ")).toUpperCase();
// if(respuesta == "REGISTARSE"){
//     // CREAR USUARIO
   
//             let nuevoUsuario =
//                 {
//                     nombre: prompt("Digita tu nombre: "),
//                     documento: prompt("Diligencia tu numero de documento: "),
//                     contrasenia: prompt("Digita tu contraseña: "),
//                     tipoUsuario: parseInt(prompt("Digita 1 para Administrador y 2 para Cliente: "))
//                 };
    
//            lista.push(nuevoUsuario);
//            console.log(lista);

    
// }else if(respuesta == "INGRESAR"){
//     //LOGIN
//     let documento = prompt("Ingrese su numero de documento: ");
//     let contrasenia = prompt("Ingrese su contrasenia: ");

//       let verificacion = verificacionUsuario(documento, contrasenia); 
      

//        if(verificacion == true){
//         console.log("acceso permitido");
//        }else{
//         console.log("acceso denegado");
//        }

   
// }
// }while(respuesta != "CERRAR");
    


// function verificacionUsuario(documento, contrasenia) {
//     let encontrado = [];
//     lista.forEach(
//         function(objeto){
//             if(objeto.documento === documento && objeto.contrasenia ===contrasenia){
//                 encontrado.push(documento);
//                 encontrado.push(contrasenia)}
//             });
   
//      if(encontrado.length > 0){
//         return true;
//      }
//      return false;
// };     

function accionesTipoUsuario(tipoUsuario){

        if(tipoUsuario == 1){
        console.log(" eres administrador");

        let nuevoDeposito = {
            billeteCinco:parseInt(prompt("Digite el numero de billete de 5.000  que ingresa: ")),
            billeteDiez:parseInt(prompt("Digite el numero de 10.000 que ingresa: ")),
            billeteVeinte:parseInt(prompt("Digite el numero de 20.000  que ingresa: ")),
            billeteCincuenta:parseInt(prompt("Digite el numero de 50.000  que ingresa: ")),
            billeteCien:parseInt(prompt("Digite el numero de 100.000 que ingresa: ")),
        }

        depositosCajero.push(nuevoDeposito);

        console.log(sumarPorDenominacion());


        }else if(tipoUsuario == 2){
            console.log("eres cliente");
        }else{
            console.log("cliente o administrador errado,");
        }
}



console.log(accionesTipoUsuario(1));
console.log(accionesTipoUsuario(1));
    
   

function sumarPorDenominacion() {
    
let sumaBilletesCinco = 0;
let sumaBilletesDiez= 0;
let sumaBilletesVeinte= 0;
let sumaBilletesCincuenta= 0;
let sumaBilletesCien= 0;

    depositosCajero.forEach(function(objeto){
        sumaBilletesCinco +=objeto.billeteCinco;
        sumaBilletesDiez +=objeto.billeteDiez;
        sumaBilletesVeinte +=objeto.billeteVeinte;
        sumaBilletesCincuenta += objeto.billeteCincuenta;
        sumaBilletesCien += objeto.billeteCien;

    });

    console.log("Total en Billetes de $5.000: $" + (sumaBilletesCinco = sumaBilletesCien * 5000));
    console.log("Total en Billetes de $10.000: $" +(sumaBilletesDiez = sumaBilletesDiez *10000));
    console.log("Total en Billetes de $20.000: $" +(sumaBilletesVeinte = sumaBilletesVeinte *20000));
    console.log("Total en Billetes de $50.000: $" +(sumaBilletesCincuenta = sumaBilletesCincuenta * 50000));
    console.log("Total en Billetes de $100.000: $" +(sumaBilletesCien = sumaBilletesCien * 100000));



}

 

console.table(depositosCajero); 

console.log("suma5 "+sumarPorDenominacion());




