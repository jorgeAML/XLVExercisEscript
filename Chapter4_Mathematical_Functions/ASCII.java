public class ASCII {
    public static void main(String ... args) {
        final String SECTION = "----------------------------";
        //USE PRINT STATEMENTS TO FIND OUT THE ASCII CODE FOR '1', 'A', 'B', 'a', 'b'.`                             
        int one = (byte)'1';
        int letterA = (byte)'A';
        int letterB = (byte)'B';
        int lettera = (byte)'a';
        int letterb = (byte)'b';
        System.out.println("ASCII Code: \n" + one + "\t" + letterA + "\n" + letterB + "\t" + lettera + "\n" + letterb);
        /**USE PRINT STATEMENTS TO FFIND OUT THE CHARACTERS FOR THE DECIMAL CODES 40 59 79 85 AND 90 */
        char decimal40 = (char)40;
        char decimal59 = (char)59;
        char decimal79 = (char)79;
        char decimal85 = (char)85;
        char decimal90 = (char)90;
        System.out.println(SECTION);
        System.out.println(decimal40 + "\t" + decimal59 + "\n" + decimal79 + "\t" + decimal85 + "\n" + decimal90);
        /**USE PRINT STATEMENTS TO FIND OUT THE CHARACTERS FOR THE HEXADECIMAL CODE 40, 5A, 71, 72, AND 7A */
        char hexadecimal40 = '\u0040';
        char hexadecimal5A = '\u005A';
        char hexadecimal71 = '\u0071';
        char hexadecimal72 = '\u0072';
        char hexadecimal7A = '\u007A';
        System.out.println(SECTION);
        System.out.println(hexadecimal40 + "\t" + hexadecimal5A + "\n" + hexadecimal71 + "\t" + hexadecimal72 + "\n" + hexadecimal7A);
        /**WHICH OF THE FOLLOWING ARE CORRECT LITERALS FOR CHARACTERS? */
        /**CORRECT LITERALS ARE 1 AND 3 */
        char correct1 = '1';
        //char correct2 = '\u345dE';
        char correct3 = '\u3fFa';
        char correct4 = '\b';
        char correct5 = '\t';
        System.out.println(SECTION);
        System.out.print(correct1 + "\t" + correct3 + "\n" + correct4 + "\t" + correct5);
        /**EVALUATE THE FOLLOWING */
        int i = '1';
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
        int k = 'a';
        char c = 90;
        System.out.println(SECTION);
        System.out.println("Evaluate #1: " + i + "\n Evaluate #2: " + j + "\n Evaluate #3: " + k + "\n Evaluate #4: " + c);
        /**CAN THE FOLLOWING CONVERSION INVOLVING CASTING BE ALLOWED? IF SO, FIND THE CONVERTED RESULT */
        char d = 'A';
        int conversion1 = (int)d;

        float f = 100.34f;
        int conversion2 = (int)f;

        double d2 = 100.34;
        int conversion3 = (int)d2;

        int conversion5 = 97;
        char e = (char)conversion5;
        System.out.println(SECTION);
        System.out.println("Conversion #1: " + conversion1 + "\n Conversion #2: " + conversion2 + "\n Conversion #3: " + 
        conversion3 + "\n Conversion #4: " + e);
        /**SHOW THE OUTPUT OF THE FOLLOWING PROGRAM */
        char x = 'a';
        char y = 'c';
        System.out.println(SECTION);
        System.out.println("This x simple: " + x + " and then..." + ++x);
        System.out.println("This y simple: " + y + " and then..." + y++);
        System.out.println(x - y);
        /**WRITE A CODE THAT GENERATES A RANDOM LOWERCASE LETTER */
        char randomLowercaseLetter = (char)(97 + Math.random() * 26);
        System.out.println(SECTION);
        System.out.println(randomLowercaseLetter);
        /**SHOW THE OUTPUT OF THE FOLLOWING STATEMENTS */
        System.out.println(SECTION);
        System.out.println('a' < 'b');
        System.out.println('a' <= 'A');
        System.out.println('a' > 'b');
        System.out.println('a' >= 'A');
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');
        System.exit(0);
    }
}