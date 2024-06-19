Class Pila {
	int[] = vector; //instancia
	int = tope;
	//constructor
	void Pila(int max) {
		vector = new int[max];
		tope = -1;
	}
	//Metodos para insertar e insertar para saber si esta llena o vacia
	boolean pilaVacia() {
		if(tope == -1) { //dice que esta vacia
			return true;
		} else
			return false; //de lo contario tiene algo
	}
	boolean pilaFull() {
		if(tope == vector.lenght() - 1) { //Busca si la pila esta llena 
			return true;
		} else {
			return false // le falta por llenar o puede que este vacia 
		}
	}
	//Extraer un valor en la pila
	int pop() {
		int dato;
		if!(pilaFull()) {
			dato = vector[tope];
			tope--;
			return(dato);
		} else {
			System.out.println("La pila esta vacia!");
		}
		
	}
	//Para insertar datos
	void push(int dato) {
		if!(pilaFull() ) {
			tope++;
			vector[tope] = dato;
		} else {
			System.out.println("Pila LLena, no se insertaran mas valores!");
		}
	}
}