import java.util.Scanner;

/**Science: Day of the week */
public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the year (e.g. 2012): ");
        int year = input.nextInt();
        System.out.println("Enter the month (e.g. 1 for January: ");
        int month = input.nextInt();
        System.out.println("Enter the day of the month in numbers: ");
        int dayOfTheMonth = input.nextInt();
        //CONVERT THE USER INPUT 1 TO 13 AND 2 TO 14
       /* if (month == 1) {
            month = 13;  
        }
        if (month == 2) {
            month = 14;
        }*/
        //CHANGE VARIABLES
        int q = dayOfTheMonth;
        int k = year % 100;
        int j = year / 100;
        //MAKE THE FORMULA
        if (month == 1) {
            month = 13;
            int findTheDayOfTheWeek = (q + ((26 * (month + 1)) / 10) + k + k/4 + j/4 + 5*j) % 7;
            
                switch (findTheDayOfTheWeek) {
                    case 0: System.out.println("The day of the week is Saturday"); break;
                    case 1: System.out.println("The day of the week is Sunday"); break;
                    case 2: System.out.println("The day of the week is Monday"); break;
                    case 3: System.out.println("The day of the week is Tuesday"); break;
                    case 4: System.out.println("The day of the week is Wednesday"); break;
                    case 5: System.out.println("The day of the week is Thursday"); break;
                    case 6: System.out.println("The day of the week is Friday"); break;
                    default: System.out.println("none");
                }
        } else if (month == 2) {
            month = 14;
            int findTheDayOfTheWeek = (q + ((26 * (month + 1)) / 10) + k + k/4 + j/4 + 5*j) % 7;
            switch (findTheDayOfTheWeek) {
                case 0: System.out.println("The day of the week is Saturday"); break;
                case 1: System.out.println("The day of the week is Sunday"); break;
                case 2: System.out.println("The day of the week is Monday"); break;
                case 3: System.out.println("The day of the week is Tuesday"); break;
                case 4: System.out.println("The day of the week is Wednesday"); break;
                case 5: System.out.println("The day of the week is Thursday"); break;
                case 6: System.out.println("The day of the week is Friday"); break;
                default: System.out.println("none");
            }
        } else {
            int findTheDayOfTheWeek = (q + ((26 * (month + 1)) / 10) + k + k/4 + j/4 + 5*j) % 7;
            switch (findTheDayOfTheWeek) {
                case 0: System.out.println("The day of the week is Saturday"); break;
                case 1: System.out.println("The day of the week is Sunday"); break;
                case 2: System.out.println("The day of the week is Monday"); break;
                case 3: System.out.println("The day of the week is Tuesday"); break;
                case 4: System.out.println("The day of the week is Wednesday"); break;
                case 5: System.out.println("The day of the week is Thursday"); break;
                case 6: System.out.println("The day of the week is Friday"); break;
                default: System.out.println("none");
            }
        }
        

    }
}