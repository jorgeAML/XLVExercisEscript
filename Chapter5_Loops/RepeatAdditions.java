import java.util.Scanner;

public class RepeatAdditions {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 15;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            //Generate the random numbers
            int number1 = (int)(Math.random() * 15);
            int number2 = (int)(Math.random() * 15);

            //swap the number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            //Prompt the students to answer
            System.out.println("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();
            //Grade the answer and display the result
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } 
            else 
                System.out.println("Your answer is wrong\n" + number1 + " - " + number2 + "should be " + (number1 - number2));
                //Increase the question count
                count++;
                output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 + number2 == answer)? " correct" : " wrong");
            
            
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is: " + testTime/1000 + " seconds\n" + output);
    }
}