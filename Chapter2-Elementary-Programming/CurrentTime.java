import java.util.Scanner;

/**Current Time
 * Show the currentTime.java gives a program that displays the current time in GMT. Revise
 * the so that it prompts the user to enter the time zone offset to GMT and displgays the time in
 * the specified zone time.
 */
public class CurrentTime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        long myTime = System.currentTimeMillis();

        //Obtain the total seconds
        long totalSeconds = myTime / 1000;
        //Current Seconds in a minute
        long currentSeconds = totalSeconds % 60;
        //obtain the total minutes
        long totalMinutes = totalSeconds / 60;
        //obtain the current minutes
        long currentMinutes = totalMinutes % 60;
        //obtain the total hours
        long totalHours = totalMinutes / 60;
        //obtain the current 
        long currentHours = totalHours % 24;

        System.out.println("Current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");

        //Input your time
        System.out.println("Enter the time offset to GMT: ");
        long yourTyme = input.nextLong();
        long formula = currentHours - yourTyme;
        System.out.println("Your Current time is: " + formula + ":" + currentMinutes + ":" + currentSeconds);
    }
}
