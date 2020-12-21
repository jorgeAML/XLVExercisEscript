import java.util.Scanner;

/**Geometry: Area of a Pentagon */
public class AreaOfAPentagon {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        //LET THE USER PROMPT THE LENGHT
        System.out.println("Enter the length from the center to a vertex: ");
        double lenght = input.nextDouble();
        //MAKE THE FORMULA FOR CENTER
        double formulaCenterToVertex = 2 * lenght * Math.sin(Math.PI / 5);
        //MAKE THE FORMULA FOR LENGHT OF THE SIDE
        double formulaLengthSide = (5 * Math.pow(formulaCenterToVertex, 2)) / (4 * Math.tan(Math.PI / 5));
        //ROUND METHOD

        //CONDITIONAL
        if (formulaLengthSide != 0) {
            System.out.println("The area of the pentagon is: " + Math.rint(formulaLengthSide));
        } else {
            System.exit(1);
        }

    }
}