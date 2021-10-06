import java.util.Scanner;

public class FindTheTwoHighestScore {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of student that you have: ");
        int students = input.nextInt();

        String name = "";
        String student1 = "";
        String student2 = "";
        //double score = 0;
        double score;
        double highest = 0;
        double secondHighest = 0;

        int i = 0;
        while (i < students) {
            System.out.println("Enter the name and the score of your students (" + (i + 1 + ") :"));
            name = input.next();
            score = input.nextDouble();
            i++;
            if (score > highest) {
                student2 = student1; //student 1 now is the second highest
                secondHighest = highest;

                student1 = name; //new student becomes the highest
                highest = score;
            } else if (score > secondHighest) {
                student2 = name; //new student becomes the second highest
                secondHighest = score;
            }
            

        }
        System.out.println("The student with the higher scores is: " + student1 + " " + highest);
        System.out.println("The second student with the higher score is: " + student2 + " " + secondHighest);
    }
}