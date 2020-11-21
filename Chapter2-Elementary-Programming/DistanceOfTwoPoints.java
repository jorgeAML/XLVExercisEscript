import java.util.Scanner;

/**Geometry: Distance of two points */
public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        //Prompts from the user
        Scanner input = new Scanner (System.in);
        System.out.println("Enter x1 and y1: ");
        double xOne = input.nextDouble();
        double yOne = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double xTwo = input.nextDouble();
        double yTwo = input.nextDouble();
        //variables

        //formula
        final double FINDTHEFIRSTPOINT = Math.pow(xTwo - xOne, 2);
        final double FINDTHESECONDPOINT = Math.pow(yTwo - yOne, 2);
        final double SUM = FINDTHEFIRSTPOINT + FINDTHESECONDPOINT;
        final double FINDTHERESULT = Math.pow(SUM, 0.5);
        //output the formula
        System.out.println("The distance betwwen the two point is: " + FINDTHERESULT);
    }
}
