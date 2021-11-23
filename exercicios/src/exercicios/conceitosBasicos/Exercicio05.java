package exercicios.conceitosBasicos;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) { 
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a Base: ");
		String b = scan.next().replace(",", ".");
		double base = Double.parseDouble(b);

		System.out.print("Digite a Altura: ");
		String a = scan.next().replace(",", ".");
		double altura = Double.parseDouble(a);

		double area = base * altura / 2;
		System.out.printf("Area: %.2f", area);

		scan.close();
	}
}
