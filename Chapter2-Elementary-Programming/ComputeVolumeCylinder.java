import java.util.Scanner;

public class ComputeVolumeCylinder {
    public static void main(String... args){
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length of a cylinder: ");
        //Catch the input twice
        double radius = input.nextDouble();
        double length = input.nextDouble();
        //formulas
        double formula1 = Math.pow(radius,2) * Math.PI;
        double formula2 = (formula1 * length);
        //display the results
        if (radius != 0 || length != 0){
            System.out.println("The area is " + formula1);
            System.out.println("The volume is " + formula2);
        } else {
            System.exit(1);
        }
    }
}