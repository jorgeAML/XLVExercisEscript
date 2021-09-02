import java.util.Scanner;

public class CalculateInteres {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the balance and the annual rate: ");
        //Catch the balance & interes
        double balance = input.nextDouble();
        double rate = input.nextDouble();
        //make the formula
        double interest = balance * (rate/1200);
        //Display the result
        System.out.println("The interest for the next month is: " + interest);
    }
}