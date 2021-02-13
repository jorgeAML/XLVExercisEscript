import java.util.Scanner;

public class StudentMajorAndStatusVersion2 {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the status and the major of the student (M1, C1, I1): ");
        String statusAndMajor = input.nextLine();
        char convertStatusAndMajor0 = statusAndMajor.charAt(0); //convert to chart
        char convertStatusAndMajor1 = statusAndMajor.charAt(1); //converting again 
        int convert = (int)convertStatusAndMajor1; //convert to integer

        final String FRESH = "Freshman";
        final String SOPHO = "Sophomore";
        final String JUNIO = "Junior";
        final String SENIO = "Senior";
        final String MATH = "Mathematics";
        final String COMP = "Computer Science";
        final String INTE = "Information Technology";
        final String INVALID = "Invalid input";

        if (convertStatusAndMajor0 == 'M') {
            int substraction = convert - 48;
            switch(substraction) {
                case 1: System.out.println( MATH + " " + FRESH); break;
                case 2: System.out.println( MATH + " " + SOPHO); break;
                case 3: System.out.println( MATH + " " + JUNIO); break;
                case 4: System.out.println( MATH + " " + SENIO); break;
                default: System.out.println( INVALID );
            }
        } else if (convertStatusAndMajor0 == 'C'){
            int substraction = convert - 48;
            switch(substraction) {
                case 1: System.out.println( COMP + " " + FRESH); break;
                case 2: System.out.println( COMP + " " + SOPHO); break;
                case 3: System.out.println( COMP + " " + JUNIO); break;
                case 4: System.out.println( COMP + " " + SENIO); break;
                default: System.out.println( INVALID );
            }
        } else if (convertStatusAndMajor0 == 'I') {
            int substraction = convert - 48;
            switch(substraction){
                case 1: System.out.println( INTE + " " + FRESH); break;
                case 2: System.out.println( INTE + " " + SOPHO); break;
                case 3: System.out.println( INTE + " " + JUNIO); break;
                case 4: System.out.println( INTE + " " + SENIO); break;
                default: System.out.println( INVALID );
            }
        } else {
            System.out.println("If you want to make a change or to improve the code visit the repository.");
        }
        System.out.println(convertStatusAndMajor0 + " " + convertStatusAndMajor1 + " " + convert);
    }
}