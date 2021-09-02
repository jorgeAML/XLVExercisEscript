import java.util.Scanner;

public class CostOfDriving {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        //Catch the distance and the gallons
        double distance = input.nextDouble();
        System.out.println("Enter the miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        //make the formulas
        //How many gallons we used it in this distance?
        double findGallons = distance / milesPerGallon;
        //Find the cost of driving
        double cost = findGallons * pricePerGallon;
        //display the cost
        System.out.println("The cost of driving is: " + cost);
    }
}