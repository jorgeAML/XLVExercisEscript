import java.util.Scanner;

/**Physics Acceleration
 * Wrtie a program that prompts the user to enter the starting velocity V0 in meters/seconds
 * the ending velocity V1 in meters/seconds and the time span T in seconds,
 * diplays the average acceleration.
 * a = (V1 - V0) / T
 */
public class PhysicsAcceleration {
    public static void main(String[] args) {
        //Scanner input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your velocity in point One, then in point Zero and the Time to get the average of acceleration: ");
        //Enter the velocity 1
        double velocityOne = input.nextDouble();
        //enter the velocity 0
        double velocityZero = input.nextDouble();
        //enter the time
        double time = input.nextDouble();
        //make the formula
        double averageAcceleration = Math.abs(velocityOne - velocityZero) / time;
        //output the average acceleration
        System.out.println("The average of acceleration is: " + averageAcceleration);

    }
}
