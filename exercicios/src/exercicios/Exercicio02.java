package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a temperatura ºC ");
		String c = scan.nextLine().replace(",", ".");
		double C = Double.parseDouble(c);

		double F = (C * 9 / 5) + 32;
		System.out.printf("%.4f", F);

		scan.close();
	}
 
}
