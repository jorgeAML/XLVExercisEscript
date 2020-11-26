import java.util.Scanner;

/**Solve quadratic equations */
public class QuadracticEcuation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double raiz = Math.pow(discriminant, 0.5);
        double formulaNegativa = (-(b) + (raiz)) / (2 * a);
        double formulaPositive = (-(b) - (raiz)) / (2 * a);

        System.out.println("resultado: " + formulaNegativa + " " + formulaPositive);
        if (discriminant == 0 && discriminant == 0) {
            System.out.println("The equation has one root " + formulaPositive);
        } else if (discriminant > 0 && discriminant > 0) {
            System.out.println("The equation has two roots: " + formulaNegativa + " AND " + formulaPositive);
        } else if (discriminant < 0 && discriminant < 0) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.println("Some value is not acceptable otherwise will be: ERROR");
        }

    }
}
