import java.util.Scanner;

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
        double accountThirdMonth =  (amount + accountSecondMonth) * (FORMULAONE);
        double accountFourthMonth = (amount + accountThirdMonth) * (FORMULAONE);
        double accountFifthMonth = (amount + accountFourthMonth) * (FORMULAONE);
        double accountSixMonth = (amount + accountFifthMonth) * (FORMULAONE);
        //output his bank account
        System.out.println("After the first month, the account value is: " + accountBecomes + "\n" + "Second Month: " + accountSecondMonth + "\n" + "Third Month: " + accountThirdMonth);
        System.out.println("Fourth Month: " + accountFourthMonth + "\n" + "Fifth Month: " + accountFifthMonth);
        System.out.println("Six Month: " + accountSixMonth);
    }
}
