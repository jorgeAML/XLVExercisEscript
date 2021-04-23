public class MilesToKilometers2 {
    public static void main(String[] args) {
        int MILES = 1;
        int MAX_MILES = 10;
       final double KILOMETERS = 1.609;
       int miles2 = 20;
       int max_miles2 = 70;

       System.out.println("| Miles | Kilometers | Kilometers | Miles ");
       System.out.println("----------------------");
       System.out.println("|" + MILES + "|" + KILOMETERS + "|" + miles2 + "|" + (int)(miles2/KILOMETERS));

       while(MILES < MAX_MILES && miles2 <= max_miles2) {
           
           MILES += 1;
           miles2 += 5;
           System.out.printf("| %d | %2.3f | %d | %2.3f | \n", MILES, (MILES * KILOMETERS), miles2, (miles2/KILOMETERS));
       }
    }
}