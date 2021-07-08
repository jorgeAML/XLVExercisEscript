import java.util.Scanner;

public class ConvertPoundsIntoKilograms {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        //Catch how many pounds
        double pounds = input.nextDouble();
        //Convert into kilograms
        final double KILOGRAMS = 0.454;
        double formula = pounds * KILOGRAMS;
        //display the result
        if (pounds != 0) {
            System.out.println(pounds + " pounds is " + formula + " kilograms.");
        } else {
            System.exit(1);
        }
    }
}