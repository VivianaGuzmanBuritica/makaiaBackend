const prompt = require('prompt-sync')();
// EJERCICIOS DE LOGICA DE PROGRAMACION
// 1. Calcular la edad de acuerdo al anio de nacimiento

let anioNacimiento= prompt("Ingrese año nacimiento: ");
let calcularEdad = 2022 - anioNacimiento;
console.log("Tu edad es: "+calcularEdad + " años");

// 2. Calcular el area de un triangulo

let base= parseInt(prompt("Ingrese valor la base triangulo:"));
let altura= parseInt(prompt("Ingrese valor l altura triangulo:"));
let area= (base*altura)/2;

console.log("El area del triangulo es: "+area);



// 3. Programa que realiza la suma de 4 numeros enteros

let num1= parseInt(prompt("Ingrese del numero 1: "));
let num2= parseInt(prompt("Ingrese del numero 2: "));
let num3= parseInt(prompt("Ingrese del numero 3: "));
let num4= parseInt(prompt("Ingrese del numero 4: "));

let suma = num1 + num2 + num3+ num4;
console.log(suma);

// 4. Programa para calcular la raiz cuadrada de un numero

let raiz = Math.sqrt(num1);
console.log("la raiz cuadrada de "+num1+ " es "+ raiz);

// 5. Calcular el perimetro y el area de un rectangualo

let perimetroRectangulo = (num1*2)+(num2*2);
console.log("el perimetro del rectangulo es: " + perimetroRectangulo);
let areaRectangulo = num1 * num2;
console.log("el area del rectangulo es: " + areaRectangulo);

// 6. Programa para ingresar e imprimir en pantalla el modelo y marca de un carro

let marca = prompt("Ingrese la marca: ")
let modelo = prompt("Ingrese la modelo: ")

console.log( "su auto es "+marca +" modelo "+ modelo);

// 7. Programa calculo de un porcentaje

let total= parseInt(prompt("Ingrese el total: "));
let porcentaje= parseInt(prompt("Ingrese el porcentaje a calcular: "));

let calculoProcentaje = total*(porcentaje/100);
console.log("El  "+porcentaje+"% de "+total + " es "+calculoProcentaje);

// 8. Programa que lea 5 precios y 5 productos y calcule subtotal de productos, IVA  y total Neto


let subtotal = suma;
console.log("el subtotal de los productos es "+subtotal);

let calculoIva = subtotal * 0.14;
console.log("el iva es "+calculoIva);

let totalNeto = subtotal+calculoIva; 
console.log("el total neto es de "+totalNeto);