import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        //Create the scanner
        Scanner input = new Scanner(System.in);
        //read a initial data
        System.out.println("Enter an integer (The input ends if it is 0)");
        //sentinel value
        int data = input.nextInt();
        //Keep reading data until input is 0
        int sum = 0;
        while (data != 0){
            sum += data; //sum of the data

            //Read the next data
            System.out.println("Enter an integer (The input ends if it is 0)");
            data = input.nextInt();
        }
        System.out.println("The sum is: " + sum);
    }
}