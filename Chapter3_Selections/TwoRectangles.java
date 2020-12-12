import java.util.Scanner;

/**Geometry: Two Rectangles */
public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //USER VARIABLES
        System.out.println("Enter r1's center x-, y-coordinates, width, and height: ");
        //COORDINATES R1    
        double r1x = input.nextDouble();
        double r1y = input.nextDouble();
        //WIDTH AND HEIGHT
        double r1Width = input.nextDouble();
        double r1Height = input.nextDouble();
        //COORDINATES R2
        System.out.println("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2x = input.nextDouble();
        double r2y = input.nextDouble();
        //WIDHT AND HEIGHT
        double r2Width = input.nextDouble();
        double r2Height = input.nextDouble();

        //CONDITIONAL OVERLAPS OR NOT?
        if (r1Width > r2Width && r1Height > r2Height && r1x > r2x && r2y > r1y) {
            System.out.println("r2 is inside r1");
        } else if (r1x < r2x && r1y < r2y && r1Width < r2Width && r1Height > r2Height) {
            System.out.println("r2 overlap r1");
        } else {
            System.out.println("r2 does not overlap r1");
        }
    }
}