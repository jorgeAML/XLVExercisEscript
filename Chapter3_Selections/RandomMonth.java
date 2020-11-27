/**Random Month */
public class RandomMonth {
    public static void main(String[] args) {
        //generates an integer between 1 and 12
        int randomNumber = (int)(Math.random() * 12);
        //display the months
        switch(randomNumber) {
            case 0: System.out.println("January"); break;
            case 1: System.out.println("February"); break;
            case 2: System.out.println("March"); break;
            case 3: System.out.println("April"); break;
            case 4: System.out.println("May"); break;
            case 5: System.out.println("June"); break;
            case 6: System.out.println("July"); break;
            case 7: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Jorge AML"); break;
        }
        //output #2
        

    }
}
