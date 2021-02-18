import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence or word: ");
        String processString = input.nextLine();
        //RETURN THE FIRST WORD
        char processStringConvert = processString.charAt(0);
        //CONDICIONAL
        if(processString.length() != 0 && processStringConvert != 0) {
            System.out.println("Length of your sentence is: " + processString.length()
             + " and your first letter is " + processStringConvert);
        } else {
            System.out.println("Something was wrong!");
        }
    }
}