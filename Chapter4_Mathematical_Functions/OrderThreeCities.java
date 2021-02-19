import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.println("Enter the third city: ");
        String city3 = input.nextLine();
// 3 * 3 = 9 Posibles respuestas
        if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 ){
                System.out.println("The cities in alphabetical order are " + city1 + 
                " " + city2 + " " + city3);
        } else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0){
            System.out.println("The cities in alphabetical order are " + city2 + 
                " " + city1 + " " + city3);
        } else if (city3.compareTo(city2) < 0 && city3.compareTo(city1) < 0) {
            System.out.println("The cities in alphabetical order are " + city3 + 
                " " + city1 + " " + city2);
        } else {
            System.out.println("Probably your cities has lower cases");
        }

    }
}