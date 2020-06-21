//Programa para el ejercicio 307

console.log("El siguiente programa calcula el primer numero que es su 100% y debemos averiguar el segundo");
function guest (a, b) {
	const one = 100;
		if (a > 0 && a <= 9999 && b > 0 && b <= 9999) {
			let formula = (b * one) / a;
				console.log("Que % de " + a + " es " + b);
					console.log(formula);
		}
}
console.log("Calculating...");
function respond () {
	guest(8400, 2940);
}

var t = setTimeout(respond, 1000);
