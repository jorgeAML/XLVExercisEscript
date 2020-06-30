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
