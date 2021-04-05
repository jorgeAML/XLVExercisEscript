public class ConversionFromKilogramsToPounds {
    public static void main(String[] args) {
        final double POUNDS = 2.2;
        final int KILOGRAM_MAX = 199;
        int count = 1;

        System.out.println("Kilogram | Pounds\n");
        System.out.println(count + " | " + POUNDS);

        while (count < KILOGRAM_MAX) {
            count+= 2;
            System.out.printf("%d | %2.1f \n", count, (count * POUNDS));
        }
    }
}