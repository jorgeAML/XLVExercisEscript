import java.util.Scanner;

public class FindHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max = number;
        //controller
        int count = input.nextInt();
        do {
            System.out.println("Enter the score of students: ");
            number = input.nextInt();
            if(number > max)
                max = number;
        } while(number != 0); 
        System.out.println("Max score is: " + max);
        System.out.println("number is: " + number);
        
    }
}