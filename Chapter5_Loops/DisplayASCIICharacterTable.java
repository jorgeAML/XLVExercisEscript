public class DisplayASCIICharacterTable {
	public static void main(String[] args) {
		//from 33 to 126
		
		char begin = 33;
		char end = 126;
		System.out.println("      TABLA ASCII");
		//Filas
		System.out.println("    ");
		for (int i = 1; i <= 10; i++) {
			System.out.print("  " + i);
		}
		System.out.println("\n---------------------------------");
		
		int count = 0;
		for (int i = begin; i <= end; i++) {
			count++; //El incremento
			//Muestre 10 caracteres por linea
			if(count % 10 == 0) {
				System.out.println((char)i);
			} else {
				System.out.print((char)i + "  ");
			}
		}
		System.out.println();
	}
}