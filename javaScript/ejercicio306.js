//programa que calcula los casos especiales de tanto por ciento.
//ejercicio 306
//tema 700.
function specialCase (a) {
	numero = a;
	
	let datos = [
	{e1: 5, e2: 16, e3: 8},
		{e4: 9, e5: 12, e6: 7.8},
			{e7: 3, e8: 7, e9: 11},
				{e10: 15, e11: 10, e12: 15}
	];
	
	const diez = 10;
	const cien = 100;
	const veinticinco = 25;
	const seis = 6;
	const setentaYCinco = 4/3;
	const sincuenta = 50;
	const veinte = 20;
	
		//calculo del 10%
		if (datos[0].e1 == 5) {
			let formula = datos[0].e1 * cien;
				console.log("De que numero es 5 el 1%.");
					console.log(formula);
		} else {
			console.log(false);
		};
		
		if (datos[0].e2 == 16) {
			let formula = datos[0].e2 * diez;
				console.log("De que numero es 16 el 10%.");
					console.log(formula);
		} else {
			console.log(false);
		};
		
		if (datos[0].e3 == 8) {
			let formula = datos[0].e3 * sincuenta;
				console.log("De que numero es 8 el 2%.");
					console.log(formula);
		} else {
			console.log(false);
		};
		
		if (datos[1].e4 == 9) {
			let formula = datos[1].e4 * veinticinco;
				console.log("De que numero es 9 el 4%");
					console.log(formula);
		} else {
			console.log(false);
		};
		
		if (datos[1].e5 == 12) {
			let formula = datos[1].e5 * veinte;
				console.log("De que numero es 12 el 5%");
					console.log(formula);
			
		} else {
			console.log(false);
		}
		
		if (datos[1].e6 == 7.8) {
			let formula = datos[1].e6 * diez;
				console.log("De que numero es 7.8 el 10%");
					console.log(formula);
		} else {
			return false;
		}
		
		
		
}
specialCase();
