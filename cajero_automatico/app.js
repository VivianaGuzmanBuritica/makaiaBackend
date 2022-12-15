const prompt= require("prompt-sync")();

let lista =[];
let respuesta = "";
let depositosCajero = [];

    
do{
respuesta = (prompt("elige[INGRESAR o REGISTRARSE o CERRAR]: ")).toUpperCase();
if(respuesta == "REGISTRARSE"){
    // CREAR USUARIO
               let nuevoUsuario =
                {
                    nombre: prompt("Digita tu nombre: "),
                    documento: prompt("Diligencia tu numero de documento: "),
                    contrasenia: prompt("Digita tu contraseña: "),
                    tipoUsuario: parseInt(prompt("Digita 1 para Administrador y 2 para Cliente: "))
                };
    
           lista.push(nuevoUsuario);
           console.log(lista);

    
}else if(respuesta == "INGRESAR"){
    //LOGIN
    let documento = prompt("Ingrese su numero de documento: ");
    let contrasenia = prompt("Ingrese su contrasenia: ");

      let verificacion = verificacionUsuario(documento, contrasenia); 
      

       if(verificacion != 0){
        
        console.log("acceso permitido");       
                                
            accionesTipoUsuario(verificacion);
            
       }else{
        console.log("acceso denegado");
       }

   
}
}while(respuesta != "CERRAR");
    


function verificacionUsuario(documento, contrasenia) {
    let encontrado = [];
    let tipoUsuario = 0;
    lista.forEach(
        function(objeto){
            if(objeto.documento === documento && objeto.contrasenia ===contrasenia){
                encontrado.push(documento);
                encontrado.push(contrasenia);
                tipoUsuario = objeto.tipoUsuario;
            }
            });
   
     if(tipoUsuario > 0){
      
        return tipoUsuario;
     }
     return 0;
};     



function accionesTipoUsuario(tipoUsuario){

        if(tipoUsuario == 1){
        console.log("Perfil de administrador");

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
};
  

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

    let totalDepositado = sumaBilletesCinco+sumaBilletesDiez+sumaBilletesVeinte+sumaBilletesCincuenta+sumaBilletesCien;

    console.log("Total en Billetes de $5.000: $" + (sumaBilletesCinco = sumaBilletesCien * 5000));
    console.log("Total en Billetes de $10.000: $" +(sumaBilletesDiez = sumaBilletesDiez *10000));
    console.log("Total en Billetes de $20.000: $" +(sumaBilletesVeinte = sumaBilletesVeinte *20000));
    console.log("Total en Billetes de $50.000: $" +(sumaBilletesCincuenta = sumaBilletesCincuenta * 50000));
    console.log("Total en Billetes de $100.000: $" +(sumaBilletesCien = sumaBilletesCien * 100000));
    console.log("/----------------------------------------------------------------------");
    console.log("TOTAL DEPOSITADO: "+ totalDepositado);

    



}

 

console.table(depositosCajero); 






