public class FindNumbersDivisibleBy5Or6ButNotBoth {
    public static void main(String ... args) {
        
        int number = 99;
        while (number < 201) {
            if (number % 5 == 0 ^ number % 6 == 0) {
                System.out.println("\t" + number);
            }
            number++;
        }
    }
}