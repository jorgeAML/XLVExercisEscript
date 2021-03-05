public class RatingMovies {
    public static void main(String[] args) {
        int count = 0;
        while (count < 77) {
            double ratingRandom = (double)(Math.random() * 10);
            System.out.printf("%10.2f %n", ratingRandom);
            //System.out.println("\n");
            count++;
        }
    }
}