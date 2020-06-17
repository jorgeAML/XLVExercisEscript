//Programa que calcule el tanto por ciento de el
//De que numero es 35 el 5%.
function ejercicio1 () {
	var formula = (35 * 100) / 5;
	console.log(formula);
}
ejercicio1();

//60 el 90%
const porcentaje = 100;
function ejercicio2 () {
	
	var formula = (60*porcentaje)/90;
	console.log(formula);
}
ejercicio2();
//Nivel 3
//115 de 82%
function ejercicio3 (a, b){
	var formula = (a * porcentaje) / b;
	console.log(formula);
}
ejercicio3(115, 82);
//nivel 4
//420 de 36%
function ejercicio4 (a, b) {
	if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
		var formula = (a * porcentaje) / b;
			console.log(formula);
	}		
	return 0;
}
ejercicio4(420, 36);
//nivel 5
//850 de 72%
function ejercicio5 (a, b) {
	numero = a;
	tantoP = b;
	var condicion = a >= 0 & a <= 9999 & b >= 0 & b <= 9999;
		if (condicion) {
			var formula = (numero * porcentaje) / tantoP;
				console.log(formula);
		} else {
			console.log(false);
		}
}
ejercicio5(123000, -12312);
//nivel 6
//16 el 1/4%;
function ejercicio7 (a, b, c) {
	numero = a;
	numerador = b;
	denominador = c;
	const condicion = a >= 0 & a <= 9999 & b >= 0 & b <= 9999;
	if (condicion) {
		var formula = (numero * porcentaje) / (numerador / denominador);
			console.log(formula);
	} else {
		console.log(false);
	}
	
}
ejercicio7(16, 1, 4);

//Nivel 7
//70 el 3 1/2%.
function ejercicio11 (a, b, c, d) {
	numero = a;
	entero = b;
	numerador = c;
	denominador = d;
	const condicion = a >= 0 & a <= 9999 & b >= 0 & b <= 9999;
		if (condicion) {
			var formula = (numero * porcentaje) / (((entero * denominador) + numerador)/denominador);
				console.log(formula);
		} else {
			console.log(false);
		}
}
ejercicio11(70, 3, 1, 2);
