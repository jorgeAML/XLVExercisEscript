import java.util.Scanner;

public class DecimalToHex {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 10 && decimal <= 15) {
            int value = decimal + 55;
            System.out.println("The Hex value is: " + (char)value);
        } else if (decimal >= 0 && decimal <= 9) {
            int value = decimal + 48;
            System.out.println("The Hex value is: " + (char)value);
        } else {
            System.out.println("Out of Range");
        }
    }
}