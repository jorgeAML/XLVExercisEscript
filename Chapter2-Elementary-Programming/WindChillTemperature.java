import java.util.Scanner;

/**Science: Wind-Chill Temperature */
public class WindChillTemperature {
    public static void main(String[] args) {
        //prompts
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Faherenheit  between -58F and 41F: ");
        double temperature = input.nextDouble();
        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double windSpeed = input.nextDouble();
        //variables
        final double FIRSTVARIABLE = 35.74;
        final double SECONDVARIABLE = 0.6215;
        final double THIRDVARIABLE = 35.75;
        final double FOURTHVARIABLE = 0.4275;
        //formula
        final double FORMULACHILLWIND = FIRSTVARIABLE + (SECONDVARIABLE * temperature) - (THIRDVARIABLE * (Math.pow(windSpeed, 0.16))) + (FOURTHVARIABLE * temperature * (Math.pow(windSpeed, 0.16)));
        //output
        System.out.println("The wind chill index is: " + FORMULACHILLWIND);
    }
}
