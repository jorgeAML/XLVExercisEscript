import java.util.Scanner;

/**Financial application: monetary units */
/**
 * Modify listin 2.10, ComputeChange.java  to display the nonzero denominations only,
 * using singular words for single units such as 1 dollar and 1 penny, and plural words for more
 * than one unit such as 2 dollars and 3 pennies.
 */
public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an amount with denominations, like 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int oneDollar = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOneQuarter = oneDollar / 25;
        oneDollar = oneDollar % 25;

        int numberOfDimes = numberOneQuarter / 10;
        numberOneQuarter = numberOneQuarter % 10;

        int numberOfNikels = numberOfDimes / 5;
        numberOfDimes = numberOfDimes % 5;

        int numberOfPennies = remainingAmount;

        if (oneDollar <= 1 && numberOneQuarter <= 1 && numberOfDimes <= 1 && numberOfNikels <= 1 && numberOfPennies <= 1)  {
            System.out.println(oneDollar + " Dollar" + " " + numberOneQuarter + " Quarter" + " " +  numberOfNikels + " Nikel" + " " + numberOfPennies + " Penny");
        } else if (oneDollar <= 1 || numberOneQuarter >= 1 && numberOfDimes >= 1 && numberOfNikels >= 1 && numberOfPennies >= 1){
            System.out.println(oneDollar + " Dollar" + " " + numberOneQuarter + " Quarters" + " " +  numberOfNikels + " Nikels" + " " + numberOfPennies + " Pennies");
        } else if (oneDollar > 1 ^ numberOneQuarter <= 1 || numberOfDimes <= 1 && numberOfNikels <= 1 && numberOfPennies <= 1) {
            System.out.println(oneDollar + " Dollars" + " " + numberOneQuarter + " Quarter" + " " +  numberOfNikels + " Nikel" + " " + numberOfPennies + " Penny");
        } 
        else {
            System.out.println(oneDollar + " Dollars" + " " + numberOneQuarter + " Quarters" + " " +  numberOfNikels + " Nikels" + " " + numberOfPennies + " Pennies");
        }
 
    }
}
