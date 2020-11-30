import java.util.Scanner;

/**Game: heads or tails */
/**
 * Write a program that lets the user guess wheter the flip of a coin
 * results in heads or tails. The program randomly generates an integer
 * 0 or 1, which represents head or tail. The program prompts the user
 * to enter a guess and reports whether the guess is correct or incorrect.
 */
public class HeadsOrTails {
    public static void main(String[] args) {
        //LET THE USER GUESS
        Scanner input = new Scanner(System.in);
        System.out.println("Guess if the coin result in heads (1) or tails (0): ");

        int guess = input.nextInt();
        //GENERATES RANDOM NUMBER
        double randomNumber = (int)(Math.random() * 2);
        //CHECK THE USER NUMBER AND THE RANDOM NUMBER
        if (guess == randomNumber && randomNumber == 1) {
            System.out.println("The random number is: " + randomNumber + " your coin is head");
        } else if (guess == randomNumber && randomNumber == 0) {
            System.out.println("The random number is: " + randomNumber + " Otherwise is tail");
        }  else {
            System.out.println("You did not catch the result");
        }

        
    }
}
