package fundamento;

public class Aritmetico {
	public static void main(String[] args) {
		double a = (6 * (3 + 2));
		a = (Math.pow(a, 2) / (3 * 2));

		double b = ((1 - 5) * (2 - 7) / 2);
		b = Math.pow(b, 2);
		
		double c = a - b;
		c = Math.pow(c, 3);
				
		double r = c / Math.pow(10, 3);
		System.out.println(r);
		
				
	}
}
