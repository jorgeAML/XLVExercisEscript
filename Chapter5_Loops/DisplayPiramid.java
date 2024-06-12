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
		
		for(int i = 1; i <= number; ++i) {
			
			
			if(number == 1) {
				System.out.print(i);
			} else if (number == 2) {
				System.out.print(i + " " + i);
			}
			
		}
		
		
	}
}