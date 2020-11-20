/**Financial application: Compound Value 
 * Suppose you save $100 each month into a savings account with annual interest rate 5%. 
 * Thus the monthly interest rate is 0.05/12 = 0.00417. After the first month, the value 
 * in the account becomes:
 * 100 * (1 + 0.00417) = 100.417
 * after the second month, the value in the account becomes 
 * (100 + 100.417) * (1 + 0.00417) = 201.252
 * After the third month, the value in the account becomes
 * (100 + 202.252) * (1 + 0.00417) = 302.507
 * and so on.
 * Write a program that prompts the user to enter a monthly saving amount and
 * displays the account value after six month. (In exercise 5.30 you will use a loop to simply
 * the code and display the account value for any month).
*/
public class CompoundValue {
    public static void main(String[] args) {
        //we cannot use a loop in this exercise.
        //prompt the user his month to calculate
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        //make the variables
        double amount = input.nextDouble();
        final double RATE = 0.05;
        final double MONTHRATE = 12;
        //make the formula
        final double MONTHLYINTEREST = RATE/MONTHRATE;
        final double FORMULAONE = 1 + MONTHLYINTEREST;
        double accountBecomes = amount * FORMULAONE;
        //After the second MONTH
        double accountSecondMonth = (amount + accountBecomes) * (FORMULAONE);
        //output his bank account
        System.out.println("After the first month, the account value is: " + accountBecomes + "\n" + "Second Month: " + accountSecondMonth);
    }
}
