public class ConversionKilogramsToPoundsAndPoundsToKilogram {
    public static void main(String[] args) {
        final double POUNDS = 2.2;
        final int KILOGRAM_MAX = 199;
        int count = 1;
        //SECOND
        int pound2 = 20;
        int max_pound = 515;

        System.out.println("Kilogram | Pounds | Pounds | Kilograms \n");
        System.out.println(count + " | " + POUNDS + "|" + pound2 + "|" + (pound2/POUNDS));

        while (count < KILOGRAM_MAX && pound2 < max_pound) {
            count+= 2;
            pound2 += 5;
            System.out.printf("| %d | %2.1f | %d | %2.2f | \n", count, (count * POUNDS), pound2, (pound2/POUNDS));
        }
    }
}