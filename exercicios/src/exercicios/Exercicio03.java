package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Altura: "); 
		String entrada = scan.next().replace(",", ".");
		double a = Double.parseDouble(entrada);
		
		System.out.print("Peso: ");
		entrada = scan.next().replace(",", ".");
		double p = Double.parseDouble(entrada);
		
		double imc = p / Math.pow(a, 2);
		
		System.out.printf("%.2f", imc);
		
		scan.close();
	}
}
