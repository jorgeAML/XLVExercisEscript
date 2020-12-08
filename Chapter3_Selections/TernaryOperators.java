import java.util.Scanner;

/**Use the &&, || and ^ */
public class TernaryOperators {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            //USER PROMPT
            int yourNumber = input.nextInt();
            //CHECK
            int returnFive = yourNumber % 5;
            int returnSix = yourNumber % 6;
            //CONDITIONAL
            System.out.println((returnFive == 0 && returnSix == 0) ? "Is " + yourNumber + " divisible by 5 AND 6? True" : "Is " + yourNumber + " divisible by 5 AND 6? False");
            System.out.println((returnFive == 0 || returnSix == 0) ? "Is " + yourNumber + " divisible by 5 OR 6? True" : "Is " + yourNumber + " divisible by 5 OR 6? False");
            System.out.println((returnFive == 0 ^ returnSix == 0) ? "Is " + yourNumber + " divisible by 5 OR 6, but not BOTH? True" : "Is " + yourNumber + " divisible by 5 OR 6, but not BOTH? False");
            
    }
}