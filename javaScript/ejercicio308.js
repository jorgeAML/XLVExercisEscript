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
var ej2 = setTimeout(respond2, 2000);
//¿Qué porcentaje de 12 es 3?
function ejercicio3 (a, b) {
	if (a != null || b != null) {
		let formula = (b * porcentaje) / a;
		let des = "¿Qué porcentaje de " + a + " es " + b + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond3 () {
	ejercicio3(12,3);
	console.log("------------------------");	
}
var ej3 = setTimeout(respond3, 3000);
/¿Qué porcentaje de 15 es 3?
function ejercicio4 (a,b) {
	if (a != null || b != null) {
		let formula = (b * porcentaje) / a;
		let des = "¿Qué porcentaje de " + a + " es " + b + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond4 () {
	ejercicio4(15,3);
	console.log("------------------------");	
};
var ej4 = setTimeout(respond4, 4000);
//¿Qué porcentaje de 18 es 6?
function ejercicio5 (a, b) {
	if (a != null && b != null) {
		let formula = (b * porcentaje) / a;
		let des = "¿Qué porcentaje de " + a + " es " + b + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond5() {
	ejercicio5(18,6);
	console.log("------------------------");	
};
var ej5 = setTimeout(respond5, 5000);
//¿Qué porcentaje de 24 es 3?
function ejercicio6 (a,b) {
	if (a != null || b != null) {
		let formula = (b * porcentaje) / a;
		let des = "¿Qué porcentaje de " + a + " es " + b + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond6 () {
	ejercicio6(24,3);
	console.log("------------------------");
};
var ej6 = setTimeout(respond6, 6000);
//¿Qué porcentaje de 30 es 6?
function ejercicio7 (a,b){
	if (a != null || b != null) {
		let formula = (b * porcentaje) / a;
		let des = "¿Qué porcentaje de " + a + " es " + b + "?";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond7 () {
	ejercicio7(30,6);
	console.log("------------------------");
};
var ej7 = setTimeout(respond7, 7000);
