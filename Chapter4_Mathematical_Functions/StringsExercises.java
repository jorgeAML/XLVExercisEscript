public class StringsExercises {
    public static void main (String ... args) {
        String s1 = "Welcome to Java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to Java";
        /**TEST STRINGS */
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("to"));
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf("o", 15));
        System.out.print(s1.length());
        System.out.print(s1.substring(5));
        System.out.println(s1.substring(5, 11));
        System.out.println(s1.startsWith("Wel"));
        System.out.print(s1.endsWith("Java"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.contains(s2));
        System.out.println("\t Wel \t" .trim());
        /**4.17 Suppose that s1 and s2 are two strings. Which of the following statements or expressions are incorrect */
        System.out.print("------ 4.17 ------\n");
        System.out.println(s1 + s2);
        //System.out.println(s1 - s2);
        System.out.println(s1 == s2);
        //System.out.println(s1 >= s2);
        System.out.println(s1.compareTo(s2));
        int checkLength = s1.length();
        System.out.println(checkLength);
        /*char c = s1(0);
        System.out.println(c);
        char c = s1.charAt(s1.length());
        System.out.println(c);*/
        /**4.18 Show the output of the following statements */
        System.out.print("------ 4.18 ------\n");
        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);
        /**4.19 Show the output of the following statements */
        System.out.print("------ 4.19 ------\n");
        System.out.println(1 + "Welcome" + 1 + 1);
        System.out.println(1 + "Welcome" + (1 + 1));
        System.out.println(1 + "Welcome" + ('\u0001' + 1));
        System.out.println(1 + "Welcome" + 'a' + 1);
        /**4.20 Let s4 be " Welcome" and s5 be " welcome". Write the code for the following statements */
        System.out.print("------ 4.20 a ------\n");
        String s4 = " Welcome";
        String s5 = " welcome";
        Boolean isEqual = s4.equals(s5);
        System.out.println(isEqual);
        System.out.print("------ 4.20 b ------\n");
        Boolean isEqualIgnoreCase = s4.equalsIgnoreCase(s5);
        System.out.println(isEqualIgnoreCase);
        System.out.print("------ 4.20 c ------\n");
        int x = s4.compareTo(s5);
        System.out.println(x);
        System.out.print("------ 4.20 d ------\n");
        int xIgnoreCase = s4.compareToIgnoreCase(s5);
        System.out.println(xIgnoreCase);
        System.out.print("------ 4.20 e ------\n");
        Boolean aPrefix = s4.startsWith("AAA");
        System.out.println(aPrefix);
        System.out.print("------ 4.20 f ------\n");
        Boolean aSuffix = s4.endsWith("AAA");
        System.out.println(aSuffix);
        System.out.print("------ 4.20 g ------\n");
        int xLenght = s1.length();
        System.out.println(xLenght);
        System.out.print("------ 4.20 h ------\n");
        char xFirst = s1.charAt(0);
        System.out.println(xFirst);
        System.out.print("------ 4.20 i ------\n");
        String combineStrings = s4.concat(s5);
        System.out.println(combineStrings);
        System.out.print("------ 4.20 j ------\n");
        //Create a substring of s4 starting from index 0
        System.out.println(s4.substring(0));
        System.out.print("------ 4.20 k ------\n");
        //Create a substring of s4 starting from index 1 to index 4
        System.out.println(s4.substring(1,4));
        System.out.print("------ 4.20 l ------\n");
        //Create a new string that converts s1 to lowercase
        String s7 = s4.toLowerCase();
        System.out.println(s7);
        System.out.print("------ 4.20 m ------\n");
        //Create a new string that converts s1 to uppercase
        String s8 = s4.toUpperCase();
        System.out.println(s8);
        System.out.print("------ 4.20 n ------\n");
        //Create a new string that trims whitespace characters on both ends of s1
        String s9 = s4.trim();
        System.out.println(s9);
        System.out.print("------ 4.20 o ------\n");
        //Assign the index of the first occurrence of the character e in s4 to an int variable x
        int s10 = s4.indexOf('e');
        System.out.println(s10);
        System.out.print("------ 4.20 p ------\n");
        //Assign the index of the last occurence of the string abc in s1 to an int variable x
        int s11 = s4.lastIndexOf("abc");
        System.out.println(s11);
    }
}