import java.util.Scanner;

/**Geometry: Area of a hexagon */
public class AreaOfAHexagon {
    public static void main (String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the side for compute the area of hexagon: ");
        double lenghtOfASide = input.nextDouble();
        //FORMULA 
        double formulaAreaHexagon = (6 * Math.pow(lenghtOfASide, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println(formulaAreaHexagon != 0 ? "The area of a hexagon is: " + formulaAreaHexagon : "Invalid input");
    }
}