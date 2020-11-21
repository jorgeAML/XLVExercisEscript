import java.util.Scanner;

/**Health application: Computing BMI 
 * Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
a sample run:
*/
public class ComputingBMI {
    public static void main(String[] args) {
        //Enter the prompt users
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Enter the height in inches: ");
        double inches = input.nextDouble();
        //variables
        final double POUNDSKILOGRAM = 0.45359237;
        final double INCHINMETERS = 0.0254;
        //make the formula
        double convertPoundsIntoKilo = pounds * POUNDSKILOGRAM;
        double convertInchesIntoMeter = inches * INCHINMETERS;
        double formula = convertPoundsIntoKilo / Math.pow(convertInchesIntoMeter, 2);
        //output the result
        System.out.println("BMI is: " + formula);
    }
}
