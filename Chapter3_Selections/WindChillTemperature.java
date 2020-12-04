import java.util.Scanner;

/**Science: Wind-chill temperature */
public class WindChillTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F");

        double temperature = input.nextDouble();
        System.out.println("Enter the wind (>= 2) in miles per hour");

        double wind = input.nextDouble();
        //CONSTANTS
        final double FIRSTVARIABLE = 35.74;
        final double SECONDVARIABLE = 0.6215;
        final double THIRDVARIABLE = 35.75;
        final double FOURTHVARIABLE = 0.4275;
        //FORMULA 
        if (temperature >= -58 && temperature <= 41 && wind >= 2) {
            double formula = FIRSTVARIABLE + (SECONDVARIABLE + temperature) - (THIRDVARIABLE * (Math.pow(wind, 0.16))) + (FOURTHVARIABLE * temperature * (Math.pow(wind, 0.16)));
            System.out.println("The wind-chill index is :" + formula);
        } else {
            System.out.println("The temperature and/or wind speed is invalid");
        }
    }
}