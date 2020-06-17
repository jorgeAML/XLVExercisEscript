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
//Nivel3
//115 de 82%
function ejercicio3 (a, b){
	var formula = (a * porcentaje) / b;
	console.log(formula);
}
ejercicio3(115, 82);
//nivel4
//420 de 36%
function ejercicio4 (a, b) {
	if (a >= 0 && a <= 9999 && b >= 0 && b <= 9999) {
		var formula = (a * porcentaje) / b;
			console.log(formula);
	}		
	return 0;
}
ejercicio4(420, 36);
