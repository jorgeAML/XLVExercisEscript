import java.util.Scanner;

/**2.7 Find the number of years
 * Write a program that prompts the user to enter the minutes (1 billion) and displays the number 
 * of years and days for the minutes
 */
public class FindNumberYears {
    public static void main(String[] args) {
        final int YEARS = 365;
        Scanner input = new Scanner (System.in);

        System.out.println("Enter the years that you want to convert to minutes, hours and seconds: ");
        int years = input.nextInt();

        //calculate how many minutes has a year
        //1 year = 365 days 
        int oneMinute = 60; //seconds
        int oneHour = 60;   //minutes
        int oneDay = 24;    //hours
        int formulaSeconds = oneMinute * oneHour * oneDay *YEARS * years;
        int formulaMinutes = oneHour * oneDay * YEARS * years;
        int formulaHours = oneDay * YEARS * years;


        System.out.println(formulaSeconds + " Seconds");
        System.out.println(formulaMinutes + " Minutes");
        System.out.println(formulaHours + " Hours");

        System.out.println("Enter the minutes that you want to convert to years and days: ");
        //31536000
        int minutes = input.nextInt();
        int convertToYears = minutes / oneHour / oneDay / YEARS;
        

        System.out.println(convertToYears + " Years. ");

    }
}
