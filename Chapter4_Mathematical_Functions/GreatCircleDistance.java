import java.util.Scanner;

/**Geometry: Great circle distance */
public class GreatCircleDistance {
    public static void main(String ... args) {
        Scanner input = new Scanner (System.in);
        //LET THE USER PROMPT POINT 1
        System.out.println("Enter point 1 (Latitude and longitude) in degress: ");
        double latitudePoint1 = Math.toRadians(input.nextDouble()) ;
        double longitudePoint1 = Math.toRadians(input.nextDouble());
        //LET THE USER PROMTP POINT 2
        System.out.println("Enter point 2 (Latitude and longitude) in degress: ");
        double latitudePoint2 = Math.toRadians(input.nextDouble());
        double longitudePoint2 = Math.toRadians(input.nextDouble());
        //MAKE THE FORMULA
        final double RADIUS =  6371.01;
        double formulaGreatDistance = RADIUS * Math.acos((Math.sin(latitudePoint1) * Math.sin(latitudePoint2)) + 
        (Math.cos(latitudePoint1) * Math.cos(latitudePoint2) * Math.cos(longitudePoint1 - longitudePoint2)));
        //CONDITIONAL
        System.out.println(formulaGreatDistance != 0 ? "The distance between the two points is: " + Math.rint(formulaGreatDistance) : "ERROR");
    }
}