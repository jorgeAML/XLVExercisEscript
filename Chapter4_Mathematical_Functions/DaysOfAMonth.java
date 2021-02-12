import java.util.Scanner;

public class DaysOfAMonth {
    public static void main(String ... args) {
        //FIRST CHECK IS A LEAP YEAR
        Scanner input = new Scanner(System.in);
        //Catch the year
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        //Catch the Month
        System.out.println("Enter the month: ");
        String month = input.next();
        //check if is a leap year
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        String january = "Jan";
        String february = "Feb";
        String march = "Mar";
        String april = "Apr";
        String may = "May";
        String june = "Jun";
        String july = "Jul";
        String august = "Aug";
        String september = "Sep";
        String october = "Oct";
        String november = "Nov";
        String december = "Dec";
        //DAYS
        final int DAYS28 = 28;
        final int DAYS29 = 29;
        final int DAYS30 = 30;
        final int DAYS31 = 31;
        //Condicionales
        if (leapYear && month.equals(february)) {
                System.out.println( month + " has " + DAYS29 + " days.");
               
        } else if ( !leapYear && month.equals(january) || month.equals(march) || month.equals(may) 
                    || month.equals(july) || month.equals(august) || month.equals(october) || month.equals(december) ) {
            System.out.println(month + " has " + DAYS31 + " days.");
        } else if ( !leapYear && month.equals(april) || month.equals(june) || month.equals(september)
                    || month.equals(november) ) {
                        System.out.println(month + " has " + DAYS30 + " days.");
        } else {
            System.out.println(month + " has " + DAYS28 + " days.");
        }
    }
}