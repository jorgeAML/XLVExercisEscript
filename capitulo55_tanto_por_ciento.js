//TANTO POR CIENTO 
//CAPITULO XLV
//ARITMETICA AURELIO BALDOR

//EJERCICIO 302
function ejercicio1 (){
	var datos = {
		porcentaje: 18,
		numero: 72
	};
	
	var formula = (datos.porcentaje * datos.numero) / (100);
	if (formula != undefined) {
		let des = "1. Hallar el 18% de 72.";
		console.log(des);
		console.log(formula);
	} else {
		console.log('normal');
	}
};
ejercicio1();

function ejercicio2 () {
	var datos = {
		porcentaje: 35,
		numero: 180
	};
	var formula = (datos.porcentaje * datos.numero) / 100;
	if(formula != undefined) {
		let des = "2. 35% de 180.";
		console.log(des);
		console.log(formula);
	}else{
		console.log("Ошибка");
	}
};
ejercicio2();

function ejercicio3 () {
	var datos = [
		{porcentaje: 42, numero: 1250},
		{porcentaje: 56, numero: 3000},
			{porcentaje: 90, numero: 1315},
				{porcentaje: 1/2, numero: 18},
					{porcentaje: 2/3, numero: 54},
						{porcentaje: 3/5, numero: 108},
							{porcentaje: 2/9, numero: 360}
];
	var formula = (datos[0].porcentaje * datos[0].numero) / 100;
	var formula4 = (datos[1].porcentaje * datos[1].numero) / 100;
	var formula5 = (datos[2].porcentaje * datos[2].numero) / 100;
	var formula6 = (datos[3].porcentaje * datos[3].numero) / 100;
	var formula7 = (datos[4].porcentaje * datos[4].numero) / 100;
	var formula8 = (datos[5].porcentaje * datos[5].numero) / 100;
	var formula9 = (datos[6].porcentaje * datos[6].numero) / 100;
	
		if(formula != undefined && formula4 != undefined && formula5 != undefined && formula6 != undefined && formula7 != undefined && formula8 != undefined && formula9 != undefined) {
			let des3 = "3. 42% de 1250.\t";
			let des4 = "4. 56% de 3000.\t"; 
			let des5 = "5. 90% de 1315.\t";
			let des6 = "6. 1/2% de 18.\t";
			let des7 = "7. 2/3% de 54.\t";
			let des8 = "8. 3/5% de 108.\t";
			let des9 = "9. 2/9% de 360.\t";
			
			console.log(des3);
			console.log(formula);
			console.log(des4);
			console.log(formula4);
			console.log(des5);
			console.log(formula5);
			console.log(des6);
			console.log(formula6);
			console.log(des7);
			console.log(formula7);
			console.log(des8);
			console.log(formula8);
			console.log(des9);
			console.log(formula9);
		}else {
			console.log("Ошибка");
		}
};
ejercicio3();