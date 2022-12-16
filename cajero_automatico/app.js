const prompt= require("prompt-sync")();

let listaUsuarios =[];
let respuesta = "";
let depositosCajero = [];
let saldoPorDenominacion = [];
let saldoCajero = 0;

    
do{
respuesta = (prompt("Elige una opcion [INGRESO o REGISTRO o CERRAR]: ")).toUpperCase();
if(respuesta === "REGISTRO"){
    // CREAR USUARIO
               let nuevoUsuario =
                {
                    nombre: prompt("Digita tu nombre: "),
                    documento: prompt("Diligencia tu numero de documento: "),
                    contrasenia: prompt("Digita tu contraseña: "),
                    tipoUsuario: parseInt(prompt("Digita 1 para Administrador y 2 para Cliente: "))
                };
    
           listaUsuarios.push(nuevoUsuario);
           console.log(listaUsuarios);

    
}else if(respuesta === "INGRESO"){
    //LOGIN
    let documento = prompt("Ingrese su numero de documento: ");
    let contrasenia = prompt("Ingrese su contrasenia: ");

      let verificacion = verificacionUsuario(documento, contrasenia); 
      
       if(verificacion != 0){
        
        console.log("------------ACCESO PERMITIDO---------------");       
                                
        accionesTipoUsuario(verificacion);
            
       }else{
        console.log("------------ACCESO DENEGADO---------------");
       }

   
}
}while(respuesta != "CERRAR");
    


function verificacionUsuario(documento, contrasenia) {
    let encontrado = [];
    let tipoUsuario = 0;

    listaUsuarios.forEach(
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

        if(tipoUsuario === 1){
        console.log("***Perfil de administrador***");

        let nuevoDeposito = {
            billeteCinco:parseInt(prompt("Digite el numero de billete de 5.000  que ingresa: ")),
            billeteDiez:parseInt(prompt("Digite el numero de 10.000 que ingresa: ")),
            billeteVeinte:parseInt(prompt("Digite el numero de 20.000  que ingresa: ")),
            billeteCincuenta:parseInt(prompt("Digite el numero de 50.000  que ingresa: ")),
            billeteCien:parseInt(prompt("Digite el numero de 100.000 que ingresa: ")),
        }

        depositosCajero.push(nuevoDeposito);

        sumarPorDenominacion();


        }else if(tipoUsuario === 2){
            console.log("***Perfil de cliente***");

            const nuevoRetiro = parseInt(prompt("Digite el valor que desea retirar: "));
            
            rertirarDinero(nuevoRetiro);
           
   
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

    sumaBilletesCinco = sumaBilletesCien * 5000;
    sumaBilletesDiez = sumaBilletesDiez *10000;
    sumaBilletesVeinte = sumaBilletesVeinte *20000;
    sumaBilletesCincuenta = sumaBilletesCincuenta * 50000;
    sumaBilletesCien = sumaBilletesCien * 100000;
    
    saldoPorDenominacion.push(sumaBilletesCien);
    saldoPorDenominacion.push(sumaBilletesCincuenta);
    saldoPorDenominacion.push(sumaBilletesVeinte);
    saldoPorDenominacion.push(sumaBilletesDiez); 
    saldoPorDenominacion.push(sumaBilletesCinco);
    
    console.log("/----------------------------------------------------------------------");
    console.log("Total en Billetes de $5.000: $" + (sumaBilletesCinco));
    console.log("Total en Billetes de $10.000: $" +(sumaBilletesDiez));
    console.log("Total en Billetes de $20.000: $" +(sumaBilletesVeinte));
    console.log("Total en Billetes de $50.000: $" +(sumaBilletesCincuenta));
    console.log("Total en Billetes de $100.000: $" +(sumaBilletesCien));

    saldoCajero = sumaBilletesCinco+sumaBilletesDiez+sumaBilletesVeinte+sumaBilletesCincuenta+sumaBilletesCien;
    console.log("/----------------------------------------------------------------------");
    console.log("TOTAL DEPOSITADO: $"+ saldoCajero);
}

function rertirarDinero(nuevoRetiro){
    
    if(nuevoRetiro <= saldoCajero ){

       
      let denominacion = [100000, 50000, 20000, 10000, 5000];
          
         for (let index = 0; index < denominacion.length; index++) {
            
            let cantBilletesNecesito;  
            let billitesAdescontar;
            let valorADescontarEnPesos;
                             
            cantBilletesNecesito = Math.floor(nuevoRetiro/denominacion[index]);
            
            
            let billestesDisponibles = saldoPorDenominacion[index]/denominacion[index];

            if(billestesDisponibles>= cantBilletesNecesito){    
               billitesAdescontar=cantBilletesNecesito;
            }else{
              billitesAdescontar=billestesDisponibles;
            }

            valorADescontarEnPesos = billitesAdescontar * denominacion[index];
            saldoPorDenominacion[index] -= valorADescontarEnPesos;
            saldoCajero -=valorADescontarEnPesos;
            nuevoRetiro -= valorADescontarEnPesos;

            

            console.log("---------------------------------------------------------------------------------");
            console.log("Billetes de $"+ denominacion[index]+" que entrega "+ billitesAdescontar);
            console.log("Dinero restante cajero  por denominacion  $"+ denominacion[index]+" es igual a:  $"+saldoPorDenominacion[index]);
            console.log("---------------------------------------------------------------------------------");
    }
       
    } else{
        console.log("Saldo insuficiente, vuelva a intentar");
    }
   
    console.log("Array saldo por denominacion: "+saldoPorDenominacion);
}






