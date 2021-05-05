public class ComputeFutureTuition {
    public static void main(String[] args) {
        int yearBegin = 1;
        int yearEnd = 10;

        int tuition = 10000;
        double increase = 0.05;
        double formula = tuition * increase;

        System.out.println("| Year | Tuition |");
        System.out.println("|----------------|");
        System.out.println("|  1   | $10000  |");
        while (yearBegin < yearEnd) {        
            yearBegin++;
            tuition += formula;
            System.out.println("|  " + yearBegin + "   | $" + tuition + "  |");
        }
        System.out.println("The tuition payment after 10th years is: $" + tuition);
    }
}