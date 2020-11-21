import java.util.Scanner;

/**Population Projection 
 * Rewrite the programming exercise 1.11 to prompt the user to enter the number of years and displays
 * the population after the number of years. Use the hint in programming exercises 1.11 for this program
 * The population should be cast into an integer.
*/
public class PopulationProjection {
    public static void main(String[] args) {
        //in seconds
        final int BIRHTS = 7;
        final int DEATHS = 13;
        final int INMIGRANT = 45;
        final int POPULATION = 312032486;
        final int DAYS = 365;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the years for your projection: ");
        //prompt the user variable
        int projection = input.nextInt();
        //find the time in a year in seconds
        int secondsInYear = projection * DAYS * 24 * 60 * 60;
        int findInmigrant =  secondsInYear / INMIGRANT;
        int findBirths = secondsInYear / BIRHTS;
        int findDeaths = secondsInYear / DEATHS;

        System.out.println(findInmigrant + " Inmigrant in a year");
        System.out.println(findBirths + " Births in a year");
        System.out.println(findDeaths + " Deaths in a year");

        //find the population in a X years
        int formulaProjection = (findInmigrant + findBirths + POPULATION) - findDeaths;
        System.out.println("The population projection in " + projection + " years will be: " + formulaProjection);

    }
}
