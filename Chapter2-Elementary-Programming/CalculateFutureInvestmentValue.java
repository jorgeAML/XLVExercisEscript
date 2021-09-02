import java.util.Scanner;

public class CalculateFutureInvestmentValue {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Investment amount");
        //Catch investment amount, rate and years
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the Monthly rate");
        double interestMonthyRate = input.nextDouble();
        System.out.println("Enter number of years");
        double numberOfYears = input.nextDouble();
        //make the formula
        double rate = (1 + interestMonthyRate/1200);
        double years = numberOfYears * 12;
        double futureInvestmentValue = investmentAmount * Math.pow(rate, years);
        //display the result
        System.out.println("The future investment value is: $" + (int)futureInvestmentValue);
    }
}