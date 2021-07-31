import java.util.Scanner;

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
