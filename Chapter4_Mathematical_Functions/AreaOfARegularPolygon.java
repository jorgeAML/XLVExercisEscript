import java.util.Scanner;

/**Geometry: area of a regular polygon */
public class AreaOfARegularPolygon {
    public static void main (String ... args) {
        Scanner input = new Scanner (System.in);
        //LET THE PROMPT THE USER
        System.out.println("Enter the side lenght of the polygon: ");
        double lenghtSide = input.nextDouble();
        System.out.println("Enter the number of sides: ");
        double numberOfSide = input.nextDouble();
        //MAKE THE FORMULA
        double areaRegularPolygon = (numberOfSide * Math.pow(lenghtSide, 2)) / (4 * Math.tan(Math.PI / numberOfSide));
        System.out.println(areaRegularPolygon != 0 ? "Enter the area of the polygon: " + areaRegularPolygon : "Error");
    }
}