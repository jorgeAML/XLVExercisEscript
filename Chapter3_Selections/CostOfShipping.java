import java.util.Scanner;

/**Cost of Shipping */
public class CostOfShipping {
    public static void main(String[] args) {
        //LET THE USER TO PROMPT THE WEIGHT
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight of your packet to see the shipping cost: ");
        double weight = input.nextDouble();
        //MAKE THE FORMULA TO FIND THE COST OF WEIGHT
        double cost1 = weight * 3.5;
        double cost2 = weight * 5.5;
        double cost3 = weight * 8.5;
        double cost4 = weight * 10.5;

        if (weight > 0 && weight <= 1) {
            System.out.println("The shipping cost for a packet (pounds) with a weigth of: " + weight + "lb is $" + cost1);
        } else if (weight > 1 && weight <= 3) {
            System.out.println("The shipping cost for a packet (pounds) with a weigth of: " + weight + "lb is $" + cost2);
        } else if (weight > 3 && weight <=10) {
            System.out.println("The shipping cost for a packet (pounds) with a weigth of: " + weight + "lb is $" + cost3);
        } else if (weight > 10 && weight <= 20) {
            System.out.println("The shipping cost for a packet (pounds) with a weigth of: " + weight + "lb is $" + cost4);
        } else {
            System.out.println("The package cannot be shipped call for support");
        }
    }
}