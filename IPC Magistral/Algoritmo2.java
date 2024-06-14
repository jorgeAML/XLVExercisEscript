//Algoritmo 2

void ordenar(int vector[]) {
	int temp;
	int min;
	
	for(int i = 0; i < vector.lenght(); i++ ) {
		temp = vector[i];
		for(int j = i - 1; j >= 0 && temp < vector[j]; i--) {
			vector[j+1] = vector[j];
			}
		vector[j+1] = temp;
		
	}
	
}

//SUBIDO A UEDI
void ordenar(int vector[]) {
	int temp;
	int min;
	
	for(int i = 0; i < vector.lenght(); i++ ) {
		min = i;
		for(int j = i + 1; j < vector.lenght(); i--) {
			if(vector[j] < vector[min]) {
				min = j;
			}
		}
		temp = vector[min];
		vector[min] = vector[i];
		vector[i] = temp;
	}
	
}