public class VehiclePlateNumber {
    public static void main(String[] args) {
        //MAKE THE 4 RANDOM NUMBERS
        int randomNumbers = (int)(1000 + Math.random() * 9999);
        //Print the four numbers
        System.out.println("Your four numbers are: " + randomNumbers);
        //YOUR CHAR
        int randomCharacter1 = (int)(65 + Math.random() * 25);
        int randomCharacter2 = (int)(65 + Math.random() * 25);
        int randomCharacter3 = (int)(65 + Math.random() * 25);
        char convertRandomCharacter1 = (char)randomCharacter1;
        char convertRandomCharacter2 = (char)randomCharacter2;
        char convertRandomCharacter3 = (char)randomCharacter3;
        System.out.println("Your three characters are: " + convertRandomCharacter1 + 
        "" + convertRandomCharacter2 + "" + convertRandomCharacter3);
        System.out.println("Your Vehicle Plate number is: " + "" + convertRandomCharacter1 + 
        "" + convertRandomCharacter2 + "" + convertRandomCharacter3 + "" + randomNumbers);
    }
}