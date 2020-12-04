import java.util.Scanner;

/**Game: Scissor, rock, paper */
public class ScissorRockPaper {
    public static void main(String[] args) {
        /**
         * Write a program that plays the popular scissor-rock-paper game.
         * (A scissor can cut a paper, a rock can knock a scissor, and a paper
         * can wrap a rock). The program randomly generates a number 0, 1, or 2 
         * representing scissor, rock and paper. The program prompts the user
         * to enter a number 0, 1, or 2 and displays  a message indicating whether the user
         * or the computer wins, loses or draw. Here are sample runs:
         * Scissor (0), rock (1), paper (2): 1
         * The computer is scissor, You are rock, you WON!
         */
        int randomNumber = (int)(Math.random() * 3);
        //LET THE USER CHOOSER THE WEAPON
        Scanner input = new Scanner(System.in);
        System.out.println("Chose your weapon: Scissors (0), Rock (1), paper (2): ");
        int chooseYourWeapon = input.nextInt();
        //MAKE A CONSTANT FOR SCISSOR, PAPER AND ROCK
        final int SCISSORS = 0;
        final int ROCK = 1;
        final int PAPER = 2;
        //MAKE THE CONDITIONALS FOR SCISSORS
        if (randomNumber == SCISSORS) {
            //System.out.println("The computer is Scissors");
        } if (randomNumber == chooseYourWeapon && chooseYourWeapon == SCISSORS) {
            System.out.println("The computer is Scissors, but you are Scissors too. It's a Draw");
        } else if (randomNumber == SCISSORS && chooseYourWeapon == PAPER) {
            System.out.println("The computer is Scissors, You are paper. You Lost!");
        } else if (randomNumber == SCISSORS && chooseYourWeapon == ROCK) {
            System.out.println("The computer is Scissors, You are Rock. You Won");
        } else {
            System.out.println("--------------------");
        }
        if (randomNumber == ROCK) {
            //System.out.println("The computer is Rock");
        }   if (randomNumber == chooseYourWeapon && chooseYourWeapon == ROCK) {
            System.out.println("The computer is Rock, but you are Rock too. It's a Draw");
        }   else if (randomNumber == ROCK && chooseYourWeapon == SCISSORS) {
            System.out.println("The computer is Rock, you are Scissors. You lost");
        }   else if (randomNumber == ROCK && chooseYourWeapon == PAPER) {
            System.out.println("The computer is Rock, you are Paper. You Won");
        } else {
            System.out.println("--------------------");
        }
        if (randomNumber == PAPER) {
            //System.out.println("The computer is Paper");
        }   if (randomNumber == chooseYourWeapon && chooseYourWeapon == PAPER) {
            System.out.println("The computer is Paper, but you are paper too. It's a Draw");
        }   else if (randomNumber == PAPER && chooseYourWeapon == SCISSORS) {
            System.out.println("The computer is paper, you are Scissors. You Won");
        }   else if (randomNumber == PAPER && chooseYourWeapon == ROCK) {
            System.out.println("The computer is paper, you are Rock. you lost");
        } else {
            System.out.println("--------------------");
        }
        //output the Random Number
        System.out.println("The random number generated by the computer was: " + randomNumber);
    }   
}