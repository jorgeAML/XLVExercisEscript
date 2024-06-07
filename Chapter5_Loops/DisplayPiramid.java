import java.util.Scanner;

public class DisplayPiramid {
	public static void main(String ... args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of lines: ");
		int number = input.nextInt();
		
		int count = 0;
		while (count < number) {
			count++;
			if(number == 2){
				System.out.println(count++ + " " + count + "  " + count++);
			} else {
				System.out.println(" / " + count++ + " / ");
			}
			
			
		}
	}
}