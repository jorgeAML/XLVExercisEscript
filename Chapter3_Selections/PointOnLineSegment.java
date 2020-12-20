import java.util.Scanner;

/**Geometry: Point on line segment */
public class PointOnLineSegment {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //ENTER POINT P0
        System.out.println("Enter the X and Y points for P0: ");
        double px0 = input.nextDouble();
        double py0 = input.nextDouble();
        //ENTER POINTS P1
        System.out.println("Enter the X and Y points for P1: ");
        double px1 = input.nextDouble();
        double py1 = input.nextDouble();
        //ENTER POINTS P2
        System.out.println("Enter the X and Y points for P2: ");
        double px2 = input.nextDouble();
        double py2 = input.nextDouble();
        //FORMULA
        double formulaPointPosition = ((px1 - px0) * (py2 - py0)) - ((px2 - px0) * (py1 - py0));
        System.out.println(formulaPointPosition);
        if (px0 < px2 && py0 < py2 && px1 > px2 && py1 > py2) {
            System.out.println("(" + px2 + "," + py2 + ") is on the line segment from (" + px0 + "," + py0 + ") to (" + px1 + "," + py1 + ").");
        } else {
            System.out.println("(" + px2 + "," + py2 + ") is not on the line segment from (" + px0 + "," + py0 + ") to (" + px1 + "," + py1 + ").");
            System.exit(1);
        }
    }
}