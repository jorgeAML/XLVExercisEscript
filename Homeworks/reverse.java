
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class reverse {
        //SCANNE CLASS
        public static int[] StringArrToIntArr(String[] s) {
            int[] result = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                result[i] = Integer.parseInt(s[i]);
            }
            return result;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<int[]> numbers = new ArrayList<>();
    
            while (sc.hasNextLine()) {
                int[] numsInLine;
                String curLine = sc.nextLine();
                if (!curLine.isEmpty()) {
                    numsInLine = StringArrToIntArr(curLine.split(" "));
                } else {
                    numsInLine = new int[0];
                }
    
                numbers.add(numsInLine);
            }
    
            for (int i = numbers.size() - 1; i >= 0; i--) {
                for (int j = numbers.get(i).length - 1; j >= 0; j--) {
                    System.out.print(numbers.get(i)[j] + " ");
                }
                System.out.println();
            }
        }  
}