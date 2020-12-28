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
    }
}