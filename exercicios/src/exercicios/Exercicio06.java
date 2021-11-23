package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Valor A: ");
		String a = scan.next().replace(",", ".");
		double A = Double.parseDouble(a);

		System.out.print("Valor B: ");
		String b = scan.next().replace(",", ".");
		double B = Double.parseDouble(b);

		System.out.print("Valor C: ");
		String c = scan.next().replace(",", ".");
		double C = Double.parseDouble(c);

		double b3 = 4 * A * C;
		double b2 = Math.pow(B, 2);
		double x = (-B) + Math.sqrt(b2 - b3);
		
		double s = A*Math.pow(x, 2) + B * x + C;

		System.out.printf("Area: %.2f", x);

		scan.close();
	}
}
