import java.util.Scanner;

/**Compute and interpret BMI */
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        //compute BMI
        double weightInKilograms = weight * KILOGRAMS;
        double heightInMeters = height *METERS_PER_INCHES;
        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

        //display result
        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
