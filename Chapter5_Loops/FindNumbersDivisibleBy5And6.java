public class FindNumbersDivisibleBy5And6 {
    public static void main(String...args){
        int number = -1;
        System.out.println("----Number that are divisible by 5 and 6----");
        while (number < 1001) {
            if (number % 5 == 0 && number % 6 == 0) {
                System.out.println("---" + number + "---");
            }
            number++;
        }
        
    }
}