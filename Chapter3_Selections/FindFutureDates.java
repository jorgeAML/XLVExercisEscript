import java.util.Scanner;

/**Find future dates */
public class FindFutureDates {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter todays day: ");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        //formula
        int formula = today + daysElapsed;

        if (today <= 6) {
            switch (today) {
                case 0: System.out.println("today is: Sunday"); break;
                case 1: System.out.println("today is: Monday"); break;
                case 2: System.out.println("today is: Tuesday"); break;
                case 3: System.out.println("today is: Wednesday"); break;
                case 4: System.out.println("today is: Thursday"); break;
                case 5: System.out.println("today is: Friday"); break;
                case 6: System.out.println("today is: Saturday"); break;
                default: System.out.println("Tempenny's days"); break;
            } if (formula != 0) {
                switch (formula) {
                    case 0: System.out.println("and the future day is Sunday"); break;
                    case 1: System.out.println("and the future day is Monday"); break;
                    case 2: System.out.println("and the future day is Tuesday"); break;
                    case 3: System.out.println("and the future day is Wednesday"); break;
                    case 4: System.out.println("and the future day is Thursday"); break;
                    case 5: System.out.println("and the future day is Friday"); break;
                    case 6: System.out.println("and the future day is Saturday"); break;
                    default: System.out.println("Big Smoke baby");
                }
            }  
        } else {
            System.out.println("Carl Johnson's day, Come Back to los Angeles and help your brother");
        }
    }
}
