import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check is a vowel or consonant: ");
        String yourInput = input.nextLine();
        if (yourInput.length() != 1) {
            System.out.println("Only one characther support this program.");
        }
        char convertInput = yourInput.charAt(0);
        byte convertToDecimal = (byte)convertInput;
        //CONDITIONAL 2
        if (convertToDecimal == 97 || convertToDecimal == 65 || 
        convertToDecimal == 'e' || convertToDecimal == 69 ||
        convertToDecimal == 'i' || convertToDecimal == 'I' ||
        convertToDecimal == 'o' || convertToDecimal == 'O' ||
        convertToDecimal == 'u' || convertToDecimal == 'U') {
            System.out.println(convertInput + " is a vowel with decimal: " + convertToDecimal);
        } else if (convertToDecimal >= 91 && convertToDecimal <= 96 || 
        convertToDecimal >= 123 && convertToDecimal <= 127 ||
        convertToDecimal <= 64) {
            System.out.println(convertInput + " invalid input");            
    
        } else if(convertToDecimal != 'a' || convertToDecimal != 'A' || 
        convertToDecimal != 'e' || convertToDecimal != 'E' ||
        convertToDecimal != 'i' || convertToDecimal != 'I' ||
        convertToDecimal != 'o' || convertToDecimal != 'O' ||
        convertToDecimal != 'u' || convertToDecimal != 'U' ) {
                    
                    System.out.println(convertInput + " is a consonant with decimal: " + convertToDecimal);
        } 
        else {
            System.out.println("Invalid input");
            System.exit(1);
        }

        
    }
}
