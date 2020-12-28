public class ASCII {
    public static void main(String ... args) {
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
        System.out.println("---------------------");
        System.out.println(decimal40 + "\t" + decimal59 + "\n" + decimal79 + "\t" + decimal85 + "\n" + decimal90);
        /**USE PRINT STATEMENTS TO FIND OUT THE CHARACTERS FOR THE HEXADECIMAL CODE 40, 5A, 71, 72, AND 7A */
        char hexadecimal40 = '\u0040';
        char hexadecimal5A = '\u005A';
        char hexadecimal71 = '\u0071';
        char hexadecimal72 = '\u0072';
        char hexadecimal7A = '\u007A';
        System.out.println("---------------------");
        System.out.println(hexadecimal40 + "\t" + hexadecimal5A + "\n" + hexadecimal71 + "\t" + hexadecimal72 + "\n" + hexadecimal7A);
    }
}