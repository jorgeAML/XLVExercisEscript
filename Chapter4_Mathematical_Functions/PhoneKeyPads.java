import java.util.Scanner;

public class PhoneKeyPads {
    public static void main(String ...args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter of your phone key pad: ");
        String yourLetter = input.nextLine();
        if(yourLetter.length() != 1) {
            System.out.println("This program only accepts one character.");
            System.exit(1);
        }
        char convertYourLetter = yourLetter.charAt(0);
        if (convertYourLetter >= 'A' && convertYourLetter <= 'C' ||
            convertYourLetter >= 'a' && convertYourLetter <= 'c'){
                int keyPad = 2;
            System.out.println("The corresponding number is " + keyPad);
            } else if (convertYourLetter >= 'D' && convertYourLetter <= 'F' ||
            convertYourLetter >= 'd' && convertYourLetter <= 'f' ) {
                int keyPad = 3;
                System.out.println("The corresponding number is " + keyPad);
            } else if(convertYourLetter >= 'G' && convertYourLetter <= 'I' ||
            convertYourLetter >= 'g' && convertYourLetter <= 'i' ) {
                int keyPad = 4;
                System.out.println("The corresponding number is " + keyPad);
            } else if ( convertYourLetter >= 'J' && convertYourLetter <= 'L' ||
            convertYourLetter >= 'j' && convertYourLetter <= 'l' ) {
                int keyPad = 5;
                System.out.println("The corresponding number is " + keyPad);
            } else if ( convertYourLetter >= 'M' && convertYourLetter <= 'O' ||
            convertYourLetter >= 'm' && convertYourLetter <= 'o' ) {
                int keyPad = 6;
                System.out.println("The corresponding number is " + keyPad);
            } else if ( convertYourLetter >= 'P' && convertYourLetter <= 'S' ||
            convertYourLetter >= 'p' && convertYourLetter <= 's' ) {
                int keyPad = 7;
                System.out.println("The corresponding number is " + keyPad);
            } else if ( convertYourLetter >= 'T' && convertYourLetter <= 'V' || 
            convertYourLetter >= 't' && convertYourLetter <= 'v' ) {
                int keyPad = 8;
                System.out.println("The corresponding number is " + keyPad);
            } else if ( convertYourLetter >= 'W' && convertYourLetter <= 'Z' ||
            convertYourLetter >= 'w' && convertYourLetter <= 'z' ) {
                int keyPad = 9;
                System.out.println("The corresponding number is " + keyPad);
            }
            else {
                System.out.println(convertYourLetter + " is an invalid input");
            }

    }
}