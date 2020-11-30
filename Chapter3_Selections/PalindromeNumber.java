import java.util.Scanner;

/**Palindrome Number */
/**
 * Write a program that promtps the user to enter a three digits integer and 
 * determines wheter it is a palindrome number. A number is palindrome if it
 * reads the same from right to left and from left to right. Here is a sample:
 * Enter a three-digits integer = 121
 * 121 is a palindrome
 * 123 is not a palindrome.
 */
public class PalindromeNumber {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digits integer: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        System.out.println("The number that you entered before was: " + number1 + number2 + number3);
        if(number1 == number3 && number2 == number2 && number3 == number1) {
            System.out.println(number1 + "" + number2 + "" + number3 + " is a palindrome");
        } else {
            System.out.println(number1 + "" + number2 + "" + number3 + " is not a palindrome");
        }
    }
}
