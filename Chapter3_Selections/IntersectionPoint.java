import java.util.Scanner;
/**Geometry intersection point */
public class IntersectionPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the points x1, y1, x2, y2, x3, y3, x4, y4: ");
        //USER PROMPTS
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        //FIRST PART
        double findY = (y1 - y2);
        double findX = (x1 - x2);
        double findY3 = (y3 - y4);
        double findY4 = (x3 - x4);
        //SECOND PART
        double resultC1 = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        double resultC2 = ((y3 - y4) * x3) - ((x3 - x4) * y3);
        //CRAMER'S RULE
        double cramerRuleX0 = ((resultC1*findY4) - (resultC2 * findX)) / ((findY * findY4) - (findY3 * findX));
        Double cramerRuleY0 = ((findY * resultC2) - (findY3 * resultC1)) / ((findY * findY4) - (findY3 * findX));
        //CONDITIONALS 
        
        if (cramerRuleX0 >= Double.MAX_VALUE && cramerRuleY0 <= Double.MIN_VALUE){
            System.out.println("The two lines are parallel");
        } else if (cramerRuleX0 != 0 && cramerRuleY0 != 0) {
            System.out.println("The intersecting point is at (" + cramerRuleX0 + "," + cramerRuleY0 + ").");   
        } else {
            System.out.println("Error");
        }
    }
}