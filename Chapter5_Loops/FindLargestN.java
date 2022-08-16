public class FindLargestN {
	public static void main(String[] args) {
		int largest, n;
		largest = 12000;
		n = 0;
		
		while(n < largest) {
			double i = Math.pow(n,3);
			if(i > 10000 && i < 12000 && n < largest) {
				largest = n;
			}
			n++;
		}
		System.out.println("El numero mas grande es " + largest);
	}
}
