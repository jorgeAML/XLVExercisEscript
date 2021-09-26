import java.util.Scanner;

public class FindHighestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you have?: ");
        int numberOfStudents = input.nextInt();
                                                                                     
        int max = 0;
        String maxName = "";

        int i = 0;
        while (i < numberOfStudents ) {
            System.out.println("Enter their name and score (name score): (" + (i + 1) + "): ");
            String name = input.next();
            int score = input.nextInt();
            i++;
            if (score > max) {
                max = score;
                maxName = name;
            }

        }
        System.out.println("Student with the higher score: " + maxName);
        System.out.println("The highest score: " + max); 
    }
}