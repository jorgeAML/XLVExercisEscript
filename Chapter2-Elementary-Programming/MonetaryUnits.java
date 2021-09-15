import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        //Receive the amount
        System.out.println("Enter an amount in integer, for example 1156: ");
        int amount = input.nextInt();
        //Find the dollars
        int numberOfDollars = amount/100;
        int cents = amount % 100;

        //Display the results
        System.out.println("Your amount " + amount + " consist of: ");
        System.out.println("--- " + numberOfDollars + " Dollars and " + cents + " cents ---");
        if (cents > 50) {
            System.out.println("Please consider make a little donation \nusing your cents to contribute as \na normal American.");
        } else {
            System.out.println("Go and buy things on Walmart.");
            System.exit(0);
        }
    }
}