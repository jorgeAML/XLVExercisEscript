import java.util.Scanner;

public class AsciiCode {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code between 0 and 127: ");
        int yourAsciiCode = input.nextInt();
        if (yourAsciiCode >= 0 && yourAsciiCode < 128) {
            char convert = (char)yourAsciiCode;
            System.out.println("The character of the ASCII code: " + yourAsciiCode + " is " + convert);
        } else {
            System.out.println("Out of range");
        }
    }
}