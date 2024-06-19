//Exercise 5.19 Display numbers in a pyramid pattern

public class NumbersInAPyramidPattern {
	public static void main(String[] args) {
		// 2 ^ n
		int number = 7;
		// 2K PARES
		/*
		for (double i = 0; i <= lineaFinal; i++) {
			for(double k = i; k >= 1; k--){
				
				System.out.print(Math.pow(2,k) + "  ");
			}
			for (double j = i; j <= i; j++) {
				System.out.print((1) + "    ");
			}
			//Create ascending numbers in each row
			for(double m = i; m <= 1; m++) {
				System.out.print(m + "   ");
			}
			System.out.println();
		}*/
		for(int i = 0; i <= number; i++) {
			//Create spaces in each row
			for(int j = 1; j <= i - number; ++j ) {
					System.out.print("   ");
			}
			//Create decending numbers in each row
			for(int k = i; k >= 0; k--) {
				System.out.print((int)Math.pow(2,k) + "   ");
			}
			//Create ascending numbers in each row
			for(int m = 0; m <= i; ++m) {
				//System.out.print((int)Math.pow(2,m) + " ");
			}
			
			System.out.println();
			System.out.println();
		}
	}
}



/*
//add espacios
			for(int j = lineaFinal - i; j >= 1;j--) {
				System.out.print("  ");
			}
			for(int k = i; k >= 2; k--) {
				System.out.print(k + " ");
			}
			for(int m = 1; m <= i; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
			
			
			
			
			for(int k = i; k>=1; k--){	
				System.out.print(k  + " ");			
			}
			for(int m = 1; m <= i; m++){
				
			}
			System.out.println();
			}
			
			*/
			// DISPLAY PIRAMID
			/*
			for(int i = 1; i <= number; i++) {
			//Create spaces in each row
			for(int j = number - i; j >= 1; j-- ) {
					System.out.print("  ");
			}
			//Create decending numbers in each row
			for(int k = i; k >= 2; k--) {
				System.out.print(k + " ");
			}
			//Create ascending numbers in each row
			for(int m = 1; m <= i; m++) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		*/