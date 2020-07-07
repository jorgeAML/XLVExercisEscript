//Ejercicio 273
/*
	EL PARAMETRO 'a' SERA SIEMPRE LA BASE DEL TRIANGULO
	EL PARAMETRO 'b' SERA SIEMPRE LA ALTURA DEL TRIANGULO
*/
const formulaTriangulo = 2;
const cienCentimetros = 100;
const milCentimetros = 1000;
const diezCentimetros = 10;
const varaCubanaMetros = 0.848;

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
};
var ej1 = setTimeout(respon1, 500);

function ejercicio2 (a, b, c) {
	if (a > 0 && a < 9999 || b > 0 && b < 9999) {
	/* 
		CONVERTIR TODO A METROS
	*/
		let aa = a / cienCentimetros;
		let bb = b / milCentimetros;
		let cc = c / diezCentimetros;
		let formula = ((aa + bb) * cc) / formulaTriangulo;
		let des = "La base de un triangulo es " + aa + "cms" + " " + bb + "mms" + " y la altura " + cc + "dms" + " Hallar el area en metros cuadrados";
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond2 () {
	ejercicio2 (8, 6, 0.84);
	console.log("------------------------");
};
var ej2 = setTimeout(respond2, 1000);

function ejercicio3 (a, b, c) {
	if (a != null && b != null && c != null) {
	//CONVERTIR LAS VARAS CUBANAS A METROS
		let vC1 = a * varaCubanaMetros;
		let vC2 = b * varaCubanaMetros;
		let formula = ((vC1 * vC2) / formulaTriangulo) * c;	
		let des = "¿Cuanto importara un pedazo triangular de tierra de " + a + " varas cubanas por " + b + " varas cubanas a " + c + " la ca.?" 	
			console.log(des);
			console.log(formula);
	} else {
		console.log(false);
	}
};
function respond3 () {
	ejercicio3 (9, 6, 0.8);
	console.log("------------------------");
};
var ej3 = setTimeout(respond3, 1500);
