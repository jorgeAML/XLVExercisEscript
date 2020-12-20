import java.util.Scanner;

/**Financial: Compare costs */
public class CompareCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //INPUT FOR PACKAGE 1
        System.out.println("Enter weight and price for package 1: ");
        double weightPackage1 = input.nextDouble();
        double pricePackage1 = input.nextDouble();
        //INPUT FOR PACKAGE 2
        System.out.println("Enter weight and price for package 2: ");
        double weightPackage2 = input.nextDouble();
        double pricePackage2 = input.nextDouble();
        //THERE IS NO FORMULA FOR THIS ONE
        if (weightPackage2 < weightPackage1 && pricePackage2 < pricePackage1 ^ weightPackage2 * 2 < weightPackage1 && pricePackage2 * 2 < pricePackage1) {
            System.out.println("Package 2 has a better price");
        } else if (weightPackage2 * 2 == weightPackage1 && pricePackage2 * 2 == pricePackage1 || weightPackage1 / 2 == weightPackage2 && pricePackage1 / 2 == pricePackage2) {
            System.out.println("Two package has the same price");
        } else {
            System.out.println("Package 1 has a better price");
        }
    }
}