import java.util.Scanner;
/**Game Lottery */
/**
 * Revise Listing 3.8 Lottery.java, to generate a lottery of a three-digit number.
 * The program prompts the user to enter a three-digit number and determines whether
 * the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000
 * 2. if all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. if one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */
public class GameLottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your lottery number (three digits): ");
        int guess = input.nextInt();

        //GET DIGITS FROM LOTTERY
        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = lottery % 100;
        int lotteryRedirect2 = lotteryDigit2 / 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = guess % 100;
        int guessRedirect2 = guessDigit2 / 10;
        int guessDigit3 = guess % 10;

        System.out.println("The lottery number is: " + lottery);
        System.out.println(lotteryDigit1 + " " + lotteryRedirect2 + " " + lotteryDigit3);
        System.out.println(guessDigit1 + " " + guessRedirect2 + " " + guessDigit3);

        //1. If the user input matches the lottery number in the exact order, the award is $10,000
        if (guess == lottery) {
            System.out.println("Your number Match with the lottery number Winner. You won $10,000.00");
            System.out.println("Your number: " + guess + " Lottery number: " + lottery);
        } else if (lotteryDigit3 == guessDigit1 && lotteryRedirect2 == guessRedirect2 && lotteryDigit1 == guessDigit3) {
            System.out.println("Some digits in your guess number Match with the lottery number. You won $3,000.00");
            System.out.println("Your number: " + guess + " Lottery number: " + lottery);
        } else if (guessDigit1 == lotteryDigit1 
                    || guessDigit1 == lotteryRedirect2
                    || guessDigit1 == lotteryDigit3
                    || guessRedirect2 == lotteryDigit1
                    || guessRedirect2 == lotteryRedirect2
                    || guessRedirect2 == lotteryDigit3
                    || guessDigit3 == lotteryDigit1
                    || guessRedirect2 == lotteryRedirect2
                    || guessDigit3 == lotteryDigit3
        ) {
            System.out.println("Only one digit match with your lottery number. You won $1,000.00");
        } else {
            System.out.println("Sorry not match. Next Player or buy another lottery number");
        }
    }
}
