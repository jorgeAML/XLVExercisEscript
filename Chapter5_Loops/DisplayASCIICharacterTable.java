public class DisplayASCIICharacterTable {
	public static void main(String[] args) {
		//from 33 to 126
		
		char begin = 32;
		char end = 125;
		while(begin <= end ) {
			begin += 1;
			System.out.println("The symbols are: " + begin);
		}
	}
}