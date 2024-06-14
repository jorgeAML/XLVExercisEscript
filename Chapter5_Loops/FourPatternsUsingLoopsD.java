//(display four patterns using loops) Use nested loops 

//Pattern D
/*
1 2 3 4 5 6
  1 2 3 4 5	
    1 2 3 4
      1 2 3
        1 2
          1
*/

public class FourPatternsUsingLoopsD {
	public static void main(String[] args) {
		int lineaFinal = 6;
		
		for(int i = lineaFinal; i >= 1; i--) {
			for(int j = lineaFinal - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for(int k = i; k >= 1; k--){
				
			}
			for(int m = 1; m <= i; m++){
				System.out.print(" " + m);
			}
			System.out.println();
		}
	}
}

/*  
6 5 4 3 2 1
  5 4 3 2 1
    4 3 2 1
	  3 2 1
	    2 1
		  1
		  
for(int i = lineaFinal; i >= 1; i--) {
			for(int j = lineaFinal - i; j >= 1; j--) {
				System.out.print("  ");
			}
			for(int k = i; k >= 1; k--){
				System.out.print(" " + k);
			}
			for(int m = 1; m <= i; m++){
				
			}
			System.out.println();
		}
*/



/*
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
for(int i = lineaFinal; i >= 1; i--) {
			
			for(int k = i; k >= 1; k--){
				System.out.print(k + "  ");
			}
			for(int m = 1; m <= i; m++){
				
			}
			System.out.println();
		}
		
		*/