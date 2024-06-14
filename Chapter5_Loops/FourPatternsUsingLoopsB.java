//(display four patterns using loops) Use nested loops 

//Pattern B
/*
1 2 3 4 5 6
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1 
*/

public class FourPatternsUsingLoopsB {
	public static void main(String[] args) {
		int lineaFinal = 6;
		System.out.println("Patron B");
		for(int i = lineaFinal; i >= 1; i--) {
			//No hay necesidad de espacios
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			for(int m = i; m >= 1; m--) {
				
			}
			System.out.println();
		}
	}
}