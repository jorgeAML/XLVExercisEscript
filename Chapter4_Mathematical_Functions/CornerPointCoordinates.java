import java.util.Scanner;

/**Corner Point coordinates */
public class CornerPointCoordinates {
    public static void main (String ... args) {
        Scanner input = new Scanner (System.in);
        //LET THE USE PROMTPS THE RADIUS
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        //PRINT THE COORIDNATES OF THE PENTAGON
        //54 -54
        double pointx1 = radius * Math.cos(Math.PI / 10);
        double pointy1 = radius * Math.sin(Math.PI / 10);
        double pointx2 = radius * Math.cos(Math.PI / 2);
        double pointy2 = radius * Math.sin(Math.PI / 2);
        double pointx3 = radius * Math.cos(Math.toRadians(162));
        double pointy3 = radius * Math.sin(Math.toRadians(162)); 
        double pointx4 = radius * Math.sin(Math.toRadians(216)); 
        double pointy4 = radius * Math.sin(Math.toRadians(-54)); 
        double pointx5 = radius * Math.sin(Math.toRadians(-216)); 
        double pointy5 = radius * Math.sin(Math.toRadians(-54)); 
        if (radius != 0 && radius < 1000000) {
            System.out.println(Math.floor(pointx1) + ", " + Math.floor(pointy1));
        System.out.println(Math.rint(pointx2) + ", " + Math.rint(pointy2));
        System.out.println(pointx3 + ", " + pointy3);
        System.out.println(pointx4 + ", " + pointy4);
        System.out.println(pointx5 + ", " + pointy5);
        } else {
            System.out.println("Your input is to big?");
        }
        
    }
}