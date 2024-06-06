import java.util.Scanner;
public class FindTheFactorsOfAnInteger {
	public static void main(String ... args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int myNumber = input.nextInt();
		
		//Crear el algoritmo que encuentre todos sus factores
		
		int factor = 2;
		while(factor * factor <= myNumber){
			if(myNumber % factor == 0){
				System.out.print(factor + ", ");
				myNumber /= factor;
			} else {
				factor++;
			}
		}
		System.out.println(myNumber + ".");
		/*
		System.out.println("Ingresa otro numero: ");
		int mySecondNumber = input.nextInt();
		
		int count = 0;
		for(int i = 2; i <= 3; i++) {
			count++;
			if(mySecondNumber % 2 == 0) {
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}*/
	}
}