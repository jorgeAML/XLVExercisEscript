import java.time.Year;
import java.util.Scanner;

/**Find the number of days in a month */
/**
 * Write a program that prompts the user to enter the month and year and displays
 * the number of days in the month. For example, if the user entered month 2 and year 2012,
 * the program should display that February 2012 had 29 days. If the user entered month 3 and year 2015
 * the program should display that March 2015 had 31 days.
 */
public class FindTheNumberDaysInMonth {
    public static void main(String[] args) {
        //prompt the user
        Scanner input = new Scanner(System.in);
        //check the user input
        System.out.println("Enter the month in numbers, like (1) for January: ");
        int month = input.nextInt();
        System.out.println("Enter the year in numbers, like (1945): ");
        int year = input.nextInt();
        //return the time
        
        //leap year
       boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
       if (isLeapYear) {
           switch(month) {
               case 0: System.out.println("December " + year + " has 31 days"); break;
               case 1: System.out.println("January " + year + " has 31 days"); break;
               case 2: System.out.println("February " + year + " has 29 days"); break;
               case 3: System.out.println("March " + year + " has 31 days"); break;
               case 4: System.out.println("April " + year + " has 30 days"); break;
               case 5: System.out.println("May " + year + " has 31 days"); break;
               case 6: System.out.println("June " + year + " has 30 days"); break;
               case 7: System.out.println("July " + year + " has 31 days"); break;
               case 8: System.out.println("August " + year + " has 31 days"); break;
               case 9: System.out.println("September " + year + " has 30 days"); break;
               case 10: System.out.println("October " + year + " has 31 days"); break;
               case 11: System.out.println("November " + year + " has 30 days"); break;
               default: System.out.println(Year.now() + " Is the current year. More than twelves months is incorrect on the solar system in Milky Way"); 
           }
       } else {
           switch(month) {
            case 0: System.out.println("December " + year + " has 31 days"); break;
            case 1: System.out.println("January " + year + " has 31 days"); break;
            case 2: System.out.println("February " + year + " has 28 days"); break;
            case 3: System.out.println("March " + year + " has 31 days"); break;
            case 4: System.out.println("April " + year + " has 30 days"); break;
            case 5: System.out.println("May " + year + " has 31 days"); break;
            case 6: System.out.println("June " + year + " has 30 days"); break;
            case 7: System.out.println("July " + year + " has 31 days"); break;
            case 8: System.out.println("August " + year + " has 31 days"); break;
            case 9: System.out.println("September " + year + " has 30 days"); break;
            case 10: System.out.println("October " + year + " has 31 days"); break;
            case 11: System.out.println("November " + year + " has 30 days"); break;
            default: System.out.println(Year.now() + " Is the current year. More than twelves months is incorrect on the solar system in Milky Way"); 
           }
       }
       
    }
}
