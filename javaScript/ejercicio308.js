//Ejercicio308 with setInterval & setTimeout
/*
var counter = 1;

var printMessage = function () {
	console.log("You have been starring at your console for " + counter + " seconds");
	counter++;
};
var intervalId = setInterval(printMessage, 1000);
*/
const porcentaje = 100;

//¿Qué porcentaje de 200 es 2?
function ejercicio1 (a, b) {
	numero = a;
	numeroB = b;
	if (numero > 0 && numero < 9999 && numeroB > 0 && numeroB < 9999) {
		let formula = (numeroB * porcentaje) / numero;
		let des = "¿Qué porcentaje de " + numero + " es " + numeroB + "?";
			console.log(des); 
			console.log(formula);
	} else {
		console.log(false);
	}
};
console.log("Calculando...");
function respond1 () {
	ejercicio1(200, 2);
	console.log("------------------------");	
}
var ej1 = setTimeout(respond1, 1000);
//var int = setInterval(respond1, 500);
//¿Qué porcentaje de 9 es 33 1/3?
function ejercicio2 (a, b, c, d){
	numero = a;
	entero = b;
	numerador = c;
	denominador = d;
	if (a != null || b!= null || c != null || d != null) {
		let formula = ((((entero * denominador) + numerador) / denominador) * porcentaje) / numero;
		let des = "¿Qué porcentaje de " + numero + " es " + entero + " " + numerador + "/" + denominador + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond2 () {
	ejercicio2(9, 33, 1, 3);
		console.log("------------------------");	
};
var ej2 = setTimeout(respond2, 1500);
