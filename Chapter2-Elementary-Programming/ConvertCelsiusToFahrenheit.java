import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        //Catch the input
        double celsius = input.nextDouble();
        //Formulaa
        double formula = (9.0/5) * celsius + 32;
        //Display Resullts
        if (formula > 0 || formula < 0) {
            System.out.println(celsius + " Celsius is " + formula + " Fahrenheit");
        } else {
            System.exit(1);
        }
        
    }
}