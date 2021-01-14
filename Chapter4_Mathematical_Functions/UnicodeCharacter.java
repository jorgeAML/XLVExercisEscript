import java.util.Scanner;

public class UnicodeCharacter {
    public static void main (String ... args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the Character: ");
        String value = input.nextLine();
        char convert = value.charAt(0);
        if (convert >= '0' && convert <= 'z') {
            System.out.println("The Unicode for the character: " + value + " is " + (int)convert);
        } else {
            System.out.println("Out of the range");
        }
        


        
    }
}