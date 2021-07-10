import java.util.Scanner;
public class SumTheDigitsInteger {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        //catch the number
        int number = input.nextInt();
        //sum all the digits
        int digitOne = number % 10;
        int twoNumbers = number / 10;
        int digitTwo = twoNumbers % 10; 
        int digitThree = number / 100;
        int total = digitOne + digitTwo + digitThree;
        //display the result between 0 and 1000
        if (number > 0 && number <= 1000) {
            System.out.println("The sum of the digits is " + total);
        } else {
            System.out.println("The number is biger than 1000 or lower 0");
            System.exit(1);
        }
    }
}