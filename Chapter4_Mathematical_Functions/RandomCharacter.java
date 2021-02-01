public class RandomCharacter {
    public static void main(String ... args) {
        //Scanner does not need it.
        //displays A, D, F, etc.
        //Random number between 65 and 90.
        int randomNumber = (int)(65 + Math.random() * 25);
        //print the random number
        System.out.println("Random number is: " + randomNumber);
        //convert the random number
        char convertRandom = (char)randomNumber;
        System.out.println("Random char number is: " + convertRandom);

    }
}