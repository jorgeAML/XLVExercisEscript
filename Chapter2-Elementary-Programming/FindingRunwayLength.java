import java.util.Scanner;

/**Physics: Finding runway length 
 * Given the airplane acceleration 'a' and take off speed 'v' you can compute the minimum runway
 * length needed for an airplane to take-off using  the following formula:
 * length = v^2 /2a
 * Write a program that prompts the user to enter 'v' in meters/second (m/s) and the acceleration 'a'
 * in meter/seconds squared (m/s^2), and displays the minimum runway length.
*/
public class FindingRunwayLength {
    public static void main(String[] args) {
        //Pseudo-code
        //prompt the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed and acceleration: ");
        //insert the variables
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        final double TWO = 2;
        //make the formula
        double airplaneAcceleration = (Math.pow(speed, 2))/ (TWO * acceleration);
        //output the airplane acceleration
        System.out.println("The minimum runway length for this airplane is: " + airplaneAcceleration + " m/s");
    }
}
