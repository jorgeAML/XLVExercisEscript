public class MultiplicationTable {
    public static void main(String [] args) {
        //DISPLAY THE TABLE HEADING
        System.out.println("          Multiplication table");

        //DISPLAY THE NUMBER TITLE
        System.out.print("      ");
        for ( int j = 1; j <= 9; j++)
            System.out.print("    " + j);
        
        System.out.println("\n-----------------------------------------------");

        //DISPLAY TABLE BODY
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + " | ");
            for (int j = 1; j <= 9; j++) {
                //DISPLAY THE PRODUCT AND ALIGN PROPERLY
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}