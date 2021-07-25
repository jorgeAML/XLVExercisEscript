import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String ... args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        //Cath the minutes
        final int YEARS = 365;
        int minutes = input.nextInt();
        //Make the formula
        int hour = 60;
        int day = 24;
        //int months = 30;
        int convertToYears = minutes / (hour * day * YEARS);
        int convertToDays = minutes  % (hour * day);
        //Display the results
        System.out.println(minutes + " minutes is approximately " + convertToYears + " years and " + convertToDays + " days");
    }
}