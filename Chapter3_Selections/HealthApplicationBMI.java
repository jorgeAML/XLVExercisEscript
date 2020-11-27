import java.util.Scanner;

/**Health application BMI */
public class HealthApplicationBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //pounds
        System.out.println("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        //feet
        System.out.println("Enter feet: ");
        double feet = input.nextDouble();
        //inches
        System.out.println("Enter inches: ");
        double inches = input.nextDouble();
        //make the formula
        final double POUNDSKILOGRAMS = 0.45359237;
        final double INCHESTOMETERS = 0.0254;
        final double FEETTOMETERS = 0.3048;
        final double TOTALINCHES = feet * 12 + inches;

        double convertWeight = pounds * POUNDSKILOGRAMS;
        double convertFeet = feet * FEETTOMETERS;
        double convertInches = inches * INCHESTOMETERS;

        double formulaImperial = 703 * pounds / Math.pow(TOTALINCHES,2);
        double formulaAmerican = convertWeight / Math.pow((convertFeet + convertInches), 2);

        final String imperial = "Imperial BMI: ";
        final String american = "American BMI: ";
        //BMI Categories
        if (formulaAmerican < 18.5 || formulaImperial < 18.5) {
            System.out.println("Underweight");
            System.out.println(imperial + formulaImperial);
            System.out.println(american + formulaAmerican);
        } else if (formulaAmerican > 18.5 && formulaAmerican < 24.9) {
            System.out.println("Normal Weight");
            System.out.println(imperial + formulaImperial);
            System.out.println(american + formulaAmerican);
        } else if(formulaAmerican > 25 && formulaAmerican < 29.9) {
            System.out.println("Overweight");
            System.out.println(imperial+ formulaImperial);
            System.out.println(american + formulaAmerican);
        } else {
            System.out.println("Obesity");
            System.out.println(imperial+ formulaImperial);
            System.out.println(american + formulaAmerican);
        }
        
    }
}
