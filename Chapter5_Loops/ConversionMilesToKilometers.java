public class ConversionMilesToKilometers {
    public static void main(String[] args) {
         int MILES = 1;
         int MAX_MILES = 10;
        final double KILOMETERS = 1.609;

        System.out.println("| Miles | Kilometers |");
        System.out.println("----------------------");
        System.out.println("|   1   |   1.609    |");

        while(MILES < MAX_MILES) {
            MILES += 1;
            System.out.printf("|   %d   |    %2.3f   | \n", MILES, (MILES * KILOMETERS));
        }


    }
}