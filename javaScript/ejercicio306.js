//programa que calcula los casos especiales de tanto por ciento.
//ejercicio 306
//tema 700.
function specialCase (a) {
	numero = a;
	
	let datos = [
	{e1: 5, e2: 16, e3: 8}
	];
	
	const diez = 10;
	const cien = 100;
	const veinticinco = 25;
	const seis = 6;
	const setentaYCinco = 4/3;
	
		//calculo del 10%
		if ((datos[0].e1 == 5)) {
			let formula = datos[0].e1 * cien;
				console.log("De que numero es 5 el 1%");
					console.log(formula);
		} else {
			console.log(false);
		}
		
		if (datos[0].e2 == 16) {
			let formula = datos[0].e2 * diez;
				console.log("De que numero es 16 el 10%");
					console.log(formula);
		} else {
			console.log(false);
		}
}
specialCase();
