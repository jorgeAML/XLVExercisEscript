import java.util.Scanner;

public class CalculateTips {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and the gratuity rate: ");
        //reads the subtotal and the gratuity rate
        //subtotal
        double subtotal = input.nextDouble();
        //gratuity rate
        double gratuity = input.nextDouble();
        //formulas
        double gratuityRate = gratuity / subtotal;
        double total = gratuityRate + subtotal;
        //display the results
        if (subtotal != 0 && gratuity != 0) {
            System.out.println("The gratuity is $" + gratuityRate + " and total is $" + total);
        } else {
            System.exit(1);
        }
    }
}