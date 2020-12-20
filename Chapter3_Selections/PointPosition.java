import java.util.Scanner;

/**Geometry: Point position */
public class PointPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input p0
        System.out.println("Enter X and Y points for P0: ");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        //input p1
        System.out.println("Enter X and Y points for P1: ");
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        //input p2
        System.out.println("Enter X and Y points for P2: ");
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();
        //MAKE THE FORMULA
        double formulaPointPosition = ((px1 - px0) * (py2 - py0)) - ((px2 - px0) * (py1 - py0));
        //CONDITIONAL
        if (formulaPointPosition > 0) {
            System.out.println("(" + px2 + "," + py2 + ") is on the left side of the line from (" + px0 + "," + py0 + ") to (" + px1 + "," + py1 + ")");
        } else if (formulaPointPosition == 0) {
            System.out.println("(" + px2 + "," + py2 + ") is on the same line from (" + px0 + "," + py0 + ") to (" + px1 + "," + py1 + ")");
        } else if (formulaPointPosition < 0) {
            System.out.println("(" + px2 + "," + py2 + ") is on the right side of the line from (" + px0 + "," + py0 + ") to (" + px1 + "," + py1 + ")");
        } else {
            System.out.println("Invalid input or infinite value");
        }
    }
}