import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
        String yourValue = input.nextLine();

        if (yourValue.length() != 1) {
            int value = yourValue.indexOf(".");
            String beforeDecimal = yourValue.substring(0, value);
            String afterDecimal = yourValue.substring(value + 1);

            System.out.println("Before: " + beforeDecimal + "\t" + "After: " + afterDecimal);
            System.out.println("Dollars: $" + beforeDecimal + "\t" + "Cents: " + afterDecimal);
        } else {
            System.out.println("You must to insert a valid input like 9.99");
            System.exit(1);
        }
        

       

    }
}