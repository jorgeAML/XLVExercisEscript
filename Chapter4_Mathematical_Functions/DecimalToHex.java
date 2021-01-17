import java.util.Scanner;

public class DecimalToHex {
    public static void main(String ... args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        if (decimal >= 10 && decimal <= 15) {
            /**TO FIND THE EXACT NUMBER, CHECK THE TABLE ASCII
             * BUT HERE 65 IS A, 66 IS B AND SO ON, SO IF Y TYPE 10 
             * IN THE SCANNER, HOW MANY NUMBERS DO I NEED TO COUNT TO
             * FIND THE CHARACTER A. YOU CAN SUM OR SUBSTRACTION LIKE
             * 65 - 10 = 55. SO 55 NUMBERS I NEED TO GET 65 AND RETURN 
             * WITH THE CHARACTER A
             */
            int value = decimal + 55;
            System.out.println("The Hex value is: " + (char)value);
        } else if (decimal >= 0 && decimal <= 9) {
            /**IS THE SAME LOGIC HERE THE CHARACTER 0 IS AT DECIMAL
             * NUMBER 48, IF A SET IN THE SCANNER 0 OR 1, AND WE
             * START TO COUNT FROM 48 BECAUSE THAT DECIMAL REPRESENTS 0,
             * AND YOU WILL FIND THE NEXT NUMBERS WITH THAT CONSTANT.
             */
            int value = decimal + 48;
            System.out.println("The Hex value is: " + (char)value);
        } else {
            System.out.println("Out of Range");
        }
    }
}