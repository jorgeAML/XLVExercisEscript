import java.util.Scanner;

public class DisplayPiramid {
	public static void main(String ... args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int number = input.nextInt();
		
		if(number < 1 || number > 7) {
			System.out.println("Invalid number, must be 1 to 7");
			return;
		}
		
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
		
		
		
	}
}