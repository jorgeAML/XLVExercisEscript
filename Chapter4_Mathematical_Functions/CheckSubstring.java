import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string s1: ");
        String s1 = input.nextLine();
        System.out.println("Enter string s2: ");
        String s2 = input.nextLine();
        
        if (s1.contains(s2)) {
            System.out.println("String 1: " + s1 + " String 2: " + s2 + " are substrings");
        } else {
            System.out.println("Are not substrings because the string1 is: " + s1 + " and the string 2 is: " + s2);
            System.exit(1);
        }
        
    }
}