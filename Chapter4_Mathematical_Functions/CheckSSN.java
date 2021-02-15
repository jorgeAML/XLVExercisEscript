import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your SSN: ");
        String checkSSN = input.nextLine();
        //HANDLE ERRRORS
        if (checkSSN.length() < 11) {
            System.out.println(checkSSN + " is an invalid number");
            System.exit(1);
        }
        char checkSSN0 = checkSSN.charAt(0);
        char checkSSN1 = checkSSN.charAt(1);
        char checkSSN2 = checkSSN.charAt(2);
        // -----
        char checkSSN3 = checkSSN.charAt(3);
        // -----
        char checkSSN4 = checkSSN.charAt(4);
        char checkSSN5 = checkSSN.charAt(5);
        // -----
        char checkSSN6 = checkSSN.charAt(6);
        // -----
        char checkSSN7 = checkSSN.charAt(7);
        char checkSSN8 = checkSSN.charAt(8);
        char checkSSN9 = checkSSN.charAt(9);
        char checkSSN10 = checkSSN.charAt(10);
        
        //CONDITIONAL
        if (Character.isDigit(checkSSN0) && Character.isDigit(checkSSN1) && Character.isDigit(checkSSN2)
            && checkSSN3 == 45 && Character.isDigit(checkSSN4) && Character.isDigit(checkSSN5) &&
            checkSSN6 == 45 && Character.isDigit(checkSSN7) && Character.isDigit(checkSSN8) &&
            Character.isDigit(checkSSN9) && Character.isDigit(checkSSN10)) {
                String decode = checkSSN.substring(3, 4);
                String decode2 = checkSSN.substring(6,7);
                System.out.println(checkSSN0 + "" + checkSSN1 + "" + checkSSN2 + "" + decode + 
                checkSSN4 + "" + checkSSN5 + "" + decode2 + "" + checkSSN7 + "" + checkSSN8 + 
                "" + checkSSN9 + "" + checkSSN10 + " is a valid social security number.");
        } else {
            System.out.println(checkSSN + " is an invalid social security number.");
        }
        
    }
}