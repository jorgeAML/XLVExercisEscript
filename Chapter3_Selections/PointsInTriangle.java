import java.util.Scanner;

/**Geometry: Points in triangle? */
public class PointsInTriangle {
    public static void main(String[] args){
        //READ THE USER PROMPTS
        Scanner input = new Scanner (System.in);
        //PROMPTS THE USER INPUTS
        System.out.println("Enter the x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        //SET LIMITS OF THE TRIANGLE
        double limitY = 100.0;
        double limitX = 200.0;
        //FIND THE AREA
        double area = (x * y) / 2;
        double hypotenuse = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2))) ;
        double perimeter = x + y +hypotenuse;
        //CONDITIONALS
        if (x < limitX && y < limitY) {
            System.out.print("The point is in the triangle with coordinates (" + x + ", " + y + ")\n");
            System.out.println("The area of the triangle is " + area);
            System.out.println("The perimeter of the triangle is " + perimeter);
            System.out.println("The hypotenuse of the triangle is " + hypotenuse);
        } else {
            System.out.print("The point is not in the triangle, because is out of the range with coordinates (" + x + "," + y + ")\n");
            System.out.println("With limits: (" + limitX + ", " + limitY + ")");
            System.exit(1);
        }
        System.exit(0);

    }
}