//(display four patterns using loops) Use nested loops 

//Pattern A
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
*/
public class FourPatternsUsingLoops2 {
	public static void main(String[] args) {
		int lineaFinal = 6;
		System.out.println("Patron A");
		for (int i = 1; i <= lineaFinal; i++) {
			
			for(int k = i; k>=1; k--){
				
			}
			for(int m = 1; m <= i; m++){
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}