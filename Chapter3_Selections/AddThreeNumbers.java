import java.util.Scanner;

/**Game: add three numbers */
public class AddThreeNumbers {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        int number3 = (int)(System.currentTimeMillis() / 12 % 10);
        //create scanner
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        //check the result
        int formula = number1 + number2 + number3;
        
        int result = input.nextInt();
        String output = number1 + " + " + number2 + " + " +  number3 + " = " + result + " is correct";
        String another = "Incorrect, the correct answer is: " + formula;
        /*
        if(result == formula) {
            System.out.println(output);
        } else {
            System.out.println(another);
        }*/
        //ternary operator
        System.out.println((result == formula) ? output : another);
    }
}
