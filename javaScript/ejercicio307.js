//Programa para el ejercicio 307
console.log("*************************************************");
console.log("El siguiente programa calcula el primer numero que es su 100% y debemos averiguar el segundo");
function guest (a, b) {
	const one = 100;
		if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
			let formula = (b * one) / a;
				console.log("Que % de " + a + " es " + b + ".");
					console.log(formula);
		}
}
console.log("Calculando...");
function respond () {
	guest(8400, 2940);
	console.log("*----------------*");
}

var t = setTimeout(respond, 1000);

/*CONSTANTES*/
const oneHundred = 100;
/*CONSTANTES*/

function ej1 (a, b) {
	if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
		let formula = (b * oneHundred) / a ;
			console.log("Que % de " + a + " es " + b + ".");
				console.log(formula);
		
	} else {
		return false;
	}
}
function respon1 () {
	ej1(860, 129);
	console.log("*----------------*");
}
var t1 = setTimeout(respon1, 1500);

function ej2 (a, b) {
		if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
			let formula = (b * oneHundred)/a;
				console.log("Que % de " + a + " es " + b + ".");
					console.log(formula);
		} else {
			return false;
		}
}
function respond2 () {
	ej2(95, 30.4);
	console.log("*----------------*");
}
var r2 = setTimeout(respond2, 2000);

function ej3 (a, b) {
	if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
		let formula = (b * oneHundred) / a;
			console.log("Que % de " + a + " es " + b + ".");
				console.log(formula);
	} else {
		return false;
	}
}
function respond3 () {
	ej3(1250, 75);
	console.log("*----------------*");
}
var r3 = setTimeout(respond3, 2500);

function ej4 (a, b) {
	if(a > 0 && a <= 9999 && b > 0 && b <= 9999) {
		let formula = (b * oneHundred) / a;
			console.log("Que % de " + a + " es " + b + ".");
				console.log(formula);
	} else {
		return false;
	}
}
function respond4 () {
	ej4(1950, 156);
	console.log("*----------------*");
}
var r4 = setTimeout(respond4, 3000);


function ej5 (a, b) {
	if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
		let formula = (b * oneHundred) / a;
			console.log("Que % de " + a + " es " + b + ".");
				console.log(formula);
	} else {
		return false;
	}
}
function respond5 () {
	ej5(815, 431.95);
	console.log("*----------------*");
}
var t5 = setTimeout(respond5, 3500);



