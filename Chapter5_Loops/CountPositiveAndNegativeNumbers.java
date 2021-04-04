import java.util.Scanner;

public class CountPositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer, the input ends if it is 0: ");
        
        double data = input.nextDouble(); //This will be check your first input!
        double sum = 0, count = 0, positive = 0, negative = 0; //The inicializador!

        if (data == 0) {
            System.out.println("No numbers are entered except 0!");
            System.exit(0);
        }
            while (data != 0) {
                if (data < 0) {
                    negative++;
                } else if (data > 0) {
                    positive++;
                } //If you insert the count++ in the else statement wont work
                sum += data; //Get the total
                count++;
                data = input.nextDouble();  //This will check your next input like 0 + 1 + 2
            }
            System.out.println("Positive Numbers: " + positive);
            System.out.println("Negative Numbers: " + negative);
            System.out.println("The total is: " + (int)sum);
            System.out.println("the count is: " + (int)count);
            double average = sum / count;
            System.out.printf("The average is: %4.2f", average); 
        
    }
}