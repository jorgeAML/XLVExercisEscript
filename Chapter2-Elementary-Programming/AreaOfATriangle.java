import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        //Sides
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //Find the distance like a vector
        double side1 = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
        double side2 = Math.sqrt(Math.pow(x2-x3,2) + Math.pow(y2-y3, 2));
        double side3 = Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1, 2));
        //calculate the sides
        double s = (side1 + side2 + side3)/2;
        //calculate the area
        double heron = Math.abs(s*(s-side1)*(s-side2)*(s-side3));
        double area = Math.sqrt(heron);
        //prompts the result
        System.out.println("Side 1: " + side1 + "\n" + "side 2: " + side2 + "\n" + "side 3: " + side3);
        System.out.println("Semiperimeter of the triangle: " + s + "\n" + "heron: " + heron);
        System.out.println("The area of the triangle is: " + area);
    }
}