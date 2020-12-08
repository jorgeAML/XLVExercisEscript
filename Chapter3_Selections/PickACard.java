/**Game: Pick a card */
import java.util.Scanner;
public class PickACard {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Pick your random card from 52 cards: ");
        int pickCard = input.nextInt();
        //LOCAL VARIABLES
        int totalDeck = 52;
        int normalCards = 13;
        int specialCards = 4;

        //FORMULA
        int findYourNormalCard = pickCard % normalCards;
        int findYourSpecialCard = pickCard % specialCards;
        //CONDITIONAL
        if (pickCard <= 52) {
            System.out.println("The card you picked is ");
        switch (findYourNormalCard) {
            case 0: System.out.println("ACE of"); break;
            case 1: System.out.println(2 + " of"); break;
            case 2: System.out.println(3 + " of"); break;
            case 3: System.out.println(4 + " of"); break;
            case 4: System.out.println(5 + " of"); break;
            case 5: System.out.println(6 + " of"); break;
            case 6: System.out.println(7 + " of"); break;
            case 7: System.out.println(8 + " of"); break;
            case 8: System.out.println(9 + " of"); break;
            case 10: System.out.println(10 + " of"); break;
            case 11: System.out.println("Jack of"); break;
            case 12: System.out.println("Queen of"); break;
            case 13: System.out.println("King of"); break;
            default: System.out.println("Invalid Normal");
            System.exit(1);
        }
        switch (findYourSpecialCard) {
            case 0: System.out.println("Clubs"); break;
            case 1: System.out.println("Diamonds"); break;
            case 2: System.out.println("Hearts"); break;
            case 3: System.out.println("Spades"); break;
            default: System.out.println("Invalid Special");
                System.exit(1);
             }
        } else if (pickCard > 52) {
            System.out.println("Well it's seems that we have more cards on the table. We going to wait to a new game Carl.");
            System.exit(0);
        } else {
            System.out.println("The game has ended");
            System.exit(1);
        }
        
    }
}