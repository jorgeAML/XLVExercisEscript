//(display four patterns using loops) Use nested loops 

//Pattern C
/*
          1
        2 1
      3 2 1
    4 3 2 1
  5 4 3 2 1
6 5 4 3 2 1
*/


public class FourPatternsUsingLoops1 {
	public static void main(String[] args) {
		int lineaFinal = 6;
		System.out.println("Patron C");
		for(int i = 1; i <= lineaFinal; i++) {
			//Imprime espacios
			for(int j = lineaFinal - i ; j >= 1 ; j--) {
				System.out.print("  ");
			}
			//Descendiente 
			for(int k = i; k >= 1 ; k--) {
				System.out.print(k + " ");
			}
			for(int m = 1; m <= i; m++) {
				//No IMPRIMIR ESTA LINEA
				//System.out.print(m + " ");
			}
			System.out.println();
		}
		
	}
}