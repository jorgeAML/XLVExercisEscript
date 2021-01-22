import java.util.Scanner;

public class HexToBinary {
    public static void main (String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your hex value to convert to binary: ");
        String hex = input.nextLine();

        if( hex.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char convertHexToChar = hex.charAt(0);
        if ( convertHexToChar >= 'A' && convertHexToChar <= 'F') {
            int convertToDecimal = convertHexToChar - 'A' + 10;
                if (convertHexToChar == 'A') {
                    int binary = 1010;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else if (convertHexToChar == 'B') {
                    int binary = 1011;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else if (convertHexToChar == 'C') {
                    int binary = 1100;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else if (convertHexToChar == 'D') {
                    int binary = 1101;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else if (convertHexToChar == 'E') {
                    int binary = 1110;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else if (convertHexToChar == 'F') {
                    int binary = 1111;
                    System.out.println("The binary number of " + convertHexToChar + " is " + binary);
                } else {
                    System.out.println("Decimal value of " + hex + " is: " + convertToDecimal);
                }
            
        } 
         if (Character.isDigit(convertHexToChar)) {
            if (convertHexToChar == '0') {
                int binary = 0;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '1') {
                int binary = 1;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '2') {
                int binary = 10;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '3') {
                int binary = 11;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '4') {
                int binary = 100;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '5') {
                int binary = 101;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '6') {
                int binary = 110;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '7') {
                int binary = 111;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '8') {
                int binary = 1000;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else if (convertHexToChar == '9') {
                int binary = 1001;
                System.out.println("The binary number of " + convertHexToChar + " is " + binary);
            } else {
                System.out.println("Decimal value of " + hex + " is: " + convertHexToChar);
            }
            
        } 
        if (convertHexToChar > 'F' && convertHexToChar > 9) {
            System.out.println("Invalid input");
        }
    }
}