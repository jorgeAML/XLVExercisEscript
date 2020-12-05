import java.util.Scanner;

/**Geometry: Point in a rectangle */
public class PointInARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates (x,y): ");
        int x = input.nextInt();
        int y = input.nextInt();
        /**
         * HORIZONTAL DISTANCE IS LESS THAN OR EQUAL TO 10/2
         * VERTICAL DISTANCE IS LESS THAN OR EQUAL TO 5/2
         */
        final int HORIZONTAL = 10 / 2;
        final int VERTICAL = 5 / 2;

        if (x <= HORIZONTAL && y <= VERTICAL) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }
    }
}