public class FindTheSmallestN {
	public static void main(String[] args) {
		int small, n; 
		small = 12000;
		n = -1;
		System.out.println("Encontrando el menor n que elevado a su cuadrado sea mayor que 12,000");
		while (n < small) {
			double i = Math.pow(n,2);
			if(i > 12000 && n < small) {
				small = n;
				System.out.println(n + " Al cuadrado es " + i);
			}
			n++;
		}
		System.out.println("El numero mas pequenio es " + small);
	}
}