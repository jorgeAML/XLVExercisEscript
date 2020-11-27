import java.util.Scanner;

/**Game: Addition quiz */
/**
 * Revise the program to radomly generate an addition question with 
 * two  integer less than 100.
 */
public class AdditionQuiz {
    public static void main(String[] args) {
        //generate two random single digit integer
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        int subtraction = number1 - number2;

        System.out.println("What is the result " + number1 + " - " + number2 + ":");

        Scanner input = new Scanner (System.in);
        int myResult = input.nextInt();

        if(myResult == subtraction) {
            System.out.println("You are correct the subtraction of " + number1 + " - " + number2 + " = " + myResult);
        } else {
            System.out.println("You are incorrect the correct result is " + subtraction);
        }

        System.out.println(number1 + " " + number2);
    }
}
