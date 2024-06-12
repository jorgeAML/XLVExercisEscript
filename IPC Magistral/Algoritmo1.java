int buscar(int dato) {
	int izq = 0;
	int der = vector.lenght() - 1;
	int centro = (izq + der) / 2;
	
	while(vector[centro] != dato && izq <= der) {
		if(dato > vector[centro]) {
			izq = centro + 1;
		} else {
			der = centro - 1;
		}
		centro = (izq + der) / 2;
	}
	
	if(vector[centro] == dato) {
		return(centro);
	} else {
		return(-1000);
	}
}

//OPTIMIZAR APLICAR RECURSIVIDAD 1

function buscar(dato, izq, der, centro) {
    if izq <= der {
        centro = (izq + der) / 2;
        if vector[centro] == dato {
            return centro;
        } else if dato > vector[centro] {
            return buscar(dato, centro + 1, der, centro);
        } else {
            return buscar(dato, izq, centro - 1, centro);
        }
    } else {
        return -1000;
    }
}

//OPTIMIZAR APLICAR RECURSIVIDAD 1

int buscar(int dato) {
	int izq = 0;
	int der = vector.lenght() - 1;
	int centro = (izq + der) / 2;
	
	while(vector[centro] != dato && izq <= der) {
		if(dato > vector[centro]) {
			izq = buscar(dato, centro + 1);
		} else {
			der = buscar(dato, centro -1);
			//der = centro - 1;
		}
		centro =(izq + der) / 2;
	}
	
	if(vector[centro] == dato) {
		return(centro);
	} else {
		return(-1000);
	}
}