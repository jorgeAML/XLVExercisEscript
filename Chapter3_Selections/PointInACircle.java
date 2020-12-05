import java.util.Scanner;

/**Geometry: Point in a cricle? */
public class PointInACircle {
    public static void main(String[] args) {
        //CHECK THE USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates (x,y): ");
        int x = input.nextInt();
        int y = input.nextInt();
        //FORMULA DISTANCE
        //int formulaDistance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2-y1), 2));
        final int RADIUS = 10;
        final int DIAMETER = RADIUS / 2;
        //CONDITIONALS
        if (x <= DIAMETER && y <= DIAMETER) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}