import java.util.Scanner;

/**Algebra linear equations */
public class LinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //prompts
        System.out.println("Enter a, b, c, d, e, f: ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double c2 = input.nextDouble();

        //Cramers rule
        /**
         * a1x + b1y = c1
         * a2x + b2y = c2
         */
        double firstX = c1 * b2 - c2 * b1;
        double secondX = a1 * b2 - a2 * b1;

        double firstY = a1 * c2 - a2 * c1;
        double secondY = a1 * b2 - a2 * b1;

        double formulax = firstX / secondX;
        double formulay = firstY / secondY;

        System.out.println((formulax != 0 && formulay != 0) ? "Determinant in X is: " + formulax + " " + "Determinant in Y is: " + formulay + " X Numerador: " + firstX + " X denominador: " + secondX : "The equation has no solution");
    
    }
}
