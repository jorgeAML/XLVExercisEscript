import java.util.Scanner;

/**Geometry: area of a hexagon */
public class AreaOfAHexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = input.nextDouble();
        
        //formula
        final double FORMULA  = ((3 * Math.sqrt(3)) / 2) * Math.pow(side, 2);
        //output the Result
        System.out.println("The area of the hexagon is: " + FORMULA);
    }
}
