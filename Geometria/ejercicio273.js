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
/*cordeles a metros*/
const corAM = 20.352;

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

function ejercicio4 (a, b, c, d) {
	if (a != null && b != null && c != null && d != null) {
		//CONVERTIR A METROS CUADRADOS
		let c1 = a / diezCentimetros;
		let c2 = c / diezCentimetros;
		let formula = (c1 * (b + c2)) / formulaTriangulo;
		//CONVERTIR A VARAS CUADRADAS
		let c3 = formula / Math.pow(varaCubanaMetros, 2); 
		let formulaF = (c3 * d) * 100;
		//MULTIPLICADO POR CIEN SERA UN MARGEN DE ERROR
		let des = "¿Cuantó importará un solar triangular de " + a + "dms" + " de base por " + b + "ms " +  c + "dms" + " de altura a $" + d + " la vara cuadrada cubana?"; 
			console.log(des);
			console.log(formulaF);
	} else {
		console.log(false);
	}
};
function respond4 () {
	ejercicio4(9, 30, 6, 1.25);
	console.log("-------------------------");
};
var ej4 = setTimeout(respond4, 2000);

function ejercicio5 (a ,b) {
	if (a != null && b != null) {
		/*CONVERTIR DE YARDAS A METROS*/
		let cordel = 20.352;
		let yarda = 1.0936;
		let formula = ((a * cordel) * (b / yarda)) / formulaTriangulo;
		/*HALLAR EN AREA LA SUPERFICIE*/
		let formulaF = formula / 100;
		let des = "Hallar en áreas la superficie de un triangulo cuya base es " + a + " cordeles y su altura " + b + " yardas."; 
			console.log(des);
			console.log(formulaF);
	} else {
		console.log(false);
	}
};
function respond5 () {
	ejercicio5(3, 50);
	console.log("--------------------------");
};
var ej5 = setTimeout(respond5, 2500);

function ejercicio6 (a, b) {
	if (a != null && b != null) {
		let formula = (a * b) / formulaTriangulo;
		let formulaA = Math.pow(varaCubanaMetros, 2);
		let formulaB = Math.fround(formula / formulaA);
		let resA = Math.round(formulaB);
		let des = "Los catetos de un triángulo rectángulo miden " + a + " y " + b + " ms respectivamente, hallar su área en varas cubanas cuadradas";
			console.log(des);
			console.log(formulaB);
			console.log(resA);
	} else {
		console.log(false);
	}
};
function respond6 () {
	ejercicio6 (5, 6);
	console.log("----------------------------");
};
var ej6 = setTimeout(respond6, 3000);
function ejercicio7 (a, b, c, d) {
	if (a != null & b != null && c != null && d != null) {
		let formulaA = (a / b) * 100;
		let formulaB = (c / d) * 1000;
		let formulaC = (Math.imul(formulaA, formulaB)) / formulaTriangulo;
		let des = "La base de un triángulo es " + a + "/" + b + " Hm. Y su altura " + c + "/" + d + " Km. Expresar la superficie en complejo métrico decimal";
		console.log(des);
		console.log(formulaC);
	}
}

function respond7 () {
	ejercicio7(1,2,3,8);
	console.log('----------------------------');
};
var ej7 = setTimeout(respond7, 3500);
function ejercicio8 (a, b) {
	if (a != null && b != null) {
		let cordeles = Math.imul(a, corAM);
		let varasCubanas = Math.fround(b * varaCubanaMetros);
		let formula = ((Math.fround(cordeles * varasCubanas)) / formulaTriangulo);
		let des = "Uno de los catetos de un triángulo rectángulo mide " + a + " cordeles y el otro " + b + " varas cubanas. Expresar su superficie en complejo Métrico decimal";
			console.log(des);
			console.log(formula);
	}
}
function respond8 () {
	ejercicio8 (3,6);
	console.log('----------------------------');
};
var ej8 = setTimeout(respond8, 4000);
function ejercicio9 (a,b,c) {
	if (a != null & b != null & c != null ) {
		let convert = c / 100;
		let formula = (a * (b + convert));
		let des = "La base de un rectángulo es " + a + "ms y la altura " + b + "ms. " + c + "cms. Expresar su área en complejo";
			console.log(des);
			console.log(formula);
	}
};
function respond9 () {
	ejercicio9 (5, 2, 5);
	console.log('-----------------------------');
};
var ej9 = setTimeout(respond9, 4500);
function ejercicio10 (a,b,c) {
	if (a != null & b != null & c != null) {
		let AB = c / 100;
		let AC = a * varaCubanaMetros;
		let formula = (AC * (b + AB));
		let des = "Expresar en Complejo el área de un romboide cuya altura es " + a + " vara cubana y la base " + b + "ms. " + c + "cms.";
			console.log(des);
			console.log(formula);
	}
};
function respond10 () {
	ejercicio10 (1, 6, 3);
	console.log("------------------------------");
};
var ej10 = setTimeout(respond10, 5000);
function ejercicio11 (a,b) {
	if (a != null & b != null) {
		let convert = b / 100;
		let convertA = a + convert;
		let formula = Math.pow(convertA, 2);
		let des = "Hallar la superficie de una lamina cuadrada de " + a + "m " + b + " cms de lado";
			console.log(des);
			console.log(formula);
	}
}

function respond11 () {
	ejercicio11 (1, 20);
	console.log("--------------------------------");
};
var ej11 = setTimeout(respond11, 5500);
function ejercicio12 (a) {
	if (a != null) {
		let convert = a * varaCubanaMetros;
		let formula = Math.pow(convert, 2) / 2;
		let des = "¿Cuál es en metros cuadrados, la superficie de una cuadrado cuya diagonal mide " + a + " varas cubanas";
			console.log(des);
			console.log(formula);
	}
};
function respond12 () {
	ejercicio12(8);
	console.log("-----------------------------------");
};
var ej12 = setTimeout(respond12, 6000);
