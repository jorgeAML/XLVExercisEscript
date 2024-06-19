/*
Escriba el código de un procedimiento recursivo que escriba en pantalla por cada uno 
de los elementos contenidos en la siguiente lista de valores no ordenados si son pares o no 

10 5 9 15 23 0 8 2 22 43 27 99 4 1 100
*/
void par(int vector[]) {

	for(int i = 0; i <= vector.lenght(); i++) {
		if (vector[i] % 2 == 0) {
			return ("Numeros Pares: " vector[i]);
		} else {
			return par;
		}
	}

}

/*
Escribir una función recursiva que reciba por parámetro dos números y devuelva 
el resultado de la división de los dos números utilizando únicamente restas sucesivas.
*/

void Division(int N1, int N2) {
	if(N2 == 0) {
		return(-1000);
	} else {
		return N1-N2 * Division(N1,N2-1);
	}
}

/*
Diseñe un método recursivo que, dados dos vectores de enteros con la misma cantidad de elementos, 
retorne un booleano indicando 
si son iguales, es decir, si tienen los mismos valores en las mismas posiciones.
*/

void Iguales(vector[] A, vector[] B){
	
	if(A.length != B.length) {
		return false;
	};
	for(int i = 0; i < B.lenght; i++){
		if(A[i] != B[i]) {
			return false;
		};
	};
	return true
};