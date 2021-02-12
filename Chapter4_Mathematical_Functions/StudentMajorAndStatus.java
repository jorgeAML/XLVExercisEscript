import java.util.Scanner;

public class StudentMajorAndStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //STUDENT STATUS
        System.out.println("Enter the status: ");
        String status = input.nextLine();
        char statusConvert = status.charAt(0);
        //STUDENT MAJOR
        System.out.println("Enter the major: ");
        int major = input.nextInt();
        if(status.length() != 1 && major > 5) {
            System.out.println("This program does not allow more than one character");
        } 
        //VARIABLES
        final String FRESH = "Freshman";
        final String SOPHO = "Sophomore";
        final String JUNIO = "Junior";
        final String SENIO = "Senior";
        final String MATH = "Mathematics";
        final String COMP = "Computer Science";
        final String INTE = "Information Technology";
        
        char mathematics = 'M';
        char computerScience = 'C';
        char informationTechnology = 'I';

        if (statusConvert == mathematics) {
            switch(major) {
                case 1: System.out.println( MATH + " " + FRESH); break;
                case 2: System.out.println( MATH + " " + SOPHO); break;
                case 3: System.out.println( MATH + " " + JUNIO); break;
                case 4: System.out.println( MATH + " " + SENIO); break;
                default: System.out.println( MATH + " " + FRESH);
            }
        }  else if (statusConvert == computerScience) {
            switch(major) {
                case 1: System.out.println( COMP + " " + FRESH); break;
                case 2: System.out.println( COMP + " " + SOPHO); break;
                case 3: System.out.println( COMP + " " + JUNIO); break;
                case 4: System.out.println( COMP + " " + SENIO); break;
                default: System.out.println( COMP + " " + FRESH);
            }

        } else if (statusConvert == informationTechnology) {
            switch(major) {
                case 1: System.out.println( INTE + " " + FRESH); break;
                case 2: System.out.println( INTE + " " + SOPHO); break;
                case 3: System.out.println( INTE + " " + JUNIO); break;
                case 4: System.out.println( INTE + " " + SENIO); break;
                default: System.out.println( INTE + " " + FRESH);
            }

        } else {
            System.out.println("Invalid input");
            System.exit(1);
        }
    }
}