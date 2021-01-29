import java.util.Scanner;

public class ConvertLetterGradeToNumber {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        //LET THE USER INTRODUCE THE LETTER GRADE
        System.out.println("Enter a letter grade: ");
        String letterGrade = input.nextLine();
        if(letterGrade.length() != 1) {
            System.out.println("This program only accepts one character.");
            System.exit(1);
        };
        char convertLetterGrade = letterGrade.charAt(0);
        //CONDITIONAL
        if(convertLetterGrade == 'A') {
            //65
            int numericLetterGrade = (int)convertLetterGrade - 60;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        } else if (convertLetterGrade == 'B') {
            //66
            int numericLetterGrade = (int)convertLetterGrade - 62;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        } else if (convertLetterGrade == 'C') {
            //67
            int numericLetterGrade = (int)convertLetterGrade - 64;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        }else if (convertLetterGrade == 'D') {
            //68
            int numericLetterGrade = (int)convertLetterGrade - 66;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        } else if (convertLetterGrade == 'E') {
            //69
            int numericLetterGrade = (int)convertLetterGrade - 68;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        } else if (convertLetterGrade == 'F') {
            //70
            int numericLetterGrade = (int)convertLetterGrade - 70;
            System.out.println("The numeric value of " + convertLetterGrade + " is: " + numericLetterGrade);
        } else {
            System.out.println(convertLetterGrade + " is an invalid input");
        } 
    }
}