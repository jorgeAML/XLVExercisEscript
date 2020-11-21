import java.util.Scanner;

/**Science: Calculating Energy 
 * Write a program that calculates the energy needed ti heat water from an initial temperature to a final
 * temperature. Your program  should prompt the user to enter the amount of water in kilograms and the 
 * initial and final temperature of the water. the Formula to compute the energy is:
 * Q = M * (finalTemperature - initialTemperature) * 4184
 * M is the weight of water in kilograms, temperature in degrees Celsisu and energy Q
 * is measured in joules.
*/

public class CalculatingEnergy {
    public static void main(String[] args) {
        //prompt of the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in kilograms: ");
        //Amount in Kilograms
        double kilograms = input.nextDouble();
        //initial Temperature
        System.out.println("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();
        //ending Temperature
        System.out.println("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        //formula
        final int ENERGY = 4184;
        double CalculateEnergy = kilograms * (finalTemperature - initialTemperature) * ENERGY;
        //output the energy
        System.out.println("The energy needed is: " + CalculateEnergy);
    }
}
