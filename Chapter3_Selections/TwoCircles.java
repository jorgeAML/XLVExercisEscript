import java.util.Scanner;

/**Geometry: Two Circles */
public class TwoCircles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //CIRCLE1
        System.out.println("Enter circles1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radius1 = input.nextDouble();
        //CIRCLE2
        System.out.println("Enter circles2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radius2 = input.nextDouble();
        //DISTANCE
        double inside = (x1 + y1) - (x2 + y2);
        double distanceIsInside = Math.abs(radius1 - radius2);
        double distanceOverlaps = radius1 + radius2;

        /*CIRCLE2 IS INSIDE CIRCLE1 IF THE DISTANCE BETWEEN
        * THE TWO CENTERS <= |R1 - R2| 
        * AND THE CIRCLE2 OVERLAPS CIRCLE1 IF THE DISTANCE BETWEEN
        * THE TWO CENTERS <= R1 + R2
        */
        if (x2 <= distanceIsInside && y2 <= distanceIsInside) {
            System.out.println("circle2 is inside circle1");
        } else if (x2 >= radius1 && y2 <= radius1 || x2 <= radius1 || y2 <= radius1){
            System.out.println("circle 2 overlaps circle 1");
        } else {
            System.out.println("Circle 2 does not overlap circle 1");
        }

    }
}