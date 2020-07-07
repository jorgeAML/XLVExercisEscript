//Ejercicio 273
const formulaTriangulo = 2;
function ejercicio1 (a, b) {
	if (a > 0 && a < 9999 || b > 0 && b < 9999) {
		let formula = (a * b) / formulaTriangulo;
		let des = "Hallar el area de un triangulo siendo la base " + a + "cms y la altura " + b + "cms";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
}
function respon1 () {
	ejercicio1(10, 42);
	console.log("-----------------------");
}
var ej1 = setTimeout(respon1, 500);
