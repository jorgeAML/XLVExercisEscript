import java.util.Scanner;

/**Compute the perimeter of a triangle */
public class ComputePerimeterOfATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //LET THE USER KNOW THAT HE NEEDS TO ENTER THE EDGES 
        System.out.println("Enter the three edges of a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        //MAKE A SIMPLE FORMULA
        double formula1 = edge1 + edge2 + edge3;
        //WE NEED A SIMPLE PERMUTATION HERE 3 * 6 = 18
        // 18 POSIBILITIES 
        if (edge1 + edge2 > edge3 
            || edge1 + edge3 > edge2
            || edge2 + edge1 > edge3
            || edge2 + edge3 > edge1
            || edge3 + edge1 > edge2
            || edge3 + edge2 > edge1) {
            System.out.println("The perimeter is: " + formula1);
        } else {
            System.out.println("The input is invalid");
        }
    }
}