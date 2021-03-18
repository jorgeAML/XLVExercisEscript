import java.util.Random;
import java.util.Scanner;

public class SubstractionQuizLoop {
    public static void main(String ... args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0; //Count the number of correct answers.
        int count = 0; //Count the number of questions.
        long startTime = System.currentTimeMillis();
        String output = " "; //output strings is initially empty.
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS) {
            //Generate two numbers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            //swap number1 with number2
            if(number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            //Promp the students
            System.out.println("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            //Grade the answer and display the result.
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++; //increase the correct answer count.
            } else 
                System.out.println("Your answer is wrong \n" + number1 
                + " - " + number2 + " should be " + (number1 - number2));
                count++; //increase the question count

                output += "\n" + number1 + " - " + number2 + "=" + answer 
                + ((number1 - number2 == answer) ? " correct" : " wrong");
            
            
        }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;

            System.out.println("correct count is " + correctCount + " \n Test time is "
             + testTime/1000 + " seconds\n" + output);
    }
}