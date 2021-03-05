public class PracticeLoops1 {
    public static void main(String[] args) {
        int count = 0;
        while(count < 78) {
            int budget = (int)(Math.random() * 500000);
            System.out.println(budget);
            count++;
        }
    }
}