import java.util.Scanner;

/**Financial Currency exchange */
public class FinancialCurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double YUAN = 0.15;
        //USER PROMPT THE EXCHANGE RATE
        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double chineseRate = input.nextDouble();
        //CONVERT FROM US DOLLAR TO CHINESE RMB
        System.out.println("Enter 0 to convert Dollars to Chinese Yuan and 1 vice versa: ");
        double convertDollarsToChinese = input.nextDouble();
        if (convertDollarsToChinese == 0) {
            //USER PROMPT THE AMOUNT OF DOLLARS
            System.out.println("Enter the Dollar amount: ");
            double dollarsAmount = input.nextDouble();
            double formulaDollarsToChinese = chineseRate * dollarsAmount;
            System.out.println("$" + dollarsAmount + " dollars to Chinese Yuan is: " + formulaDollarsToChinese);
        } else if (convertDollarsToChinese == 1) {
            System.out.println("Enter the Yuan amount: ");
            double chineseAmount = input.nextDouble();
            double formulaChineseToDollars = chineseAmount * YUAN;
            System.out.println("Y" + chineseAmount + " Chinese Yuan to Dollars is: " + formulaChineseToDollars);
        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }

    }
}