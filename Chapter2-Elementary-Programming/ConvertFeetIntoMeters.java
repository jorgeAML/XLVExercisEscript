import java.util.Scanner;

public class ConvertFeetIntoMeters {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        //Enter values
        double feet = input.nextDouble();
        //Formula conversion
        double conversion = feet * 0.305;
        //Display Results
        if (feet != 0) {
            System.out.println(feet +  " feet is " + conversion + " meters");
        } else {
            System.exit(1);
        }
    }
}