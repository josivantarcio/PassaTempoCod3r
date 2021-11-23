package exercicios.conceitosBasicos;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o valor em Fº ");
		String f = scan.nextLine().replace(",", ".");
		double F = Double.parseDouble(f);
		
		double c = (F-32)*5/9;
		System.out.printf("%.4f", c);
		
		 
		scan.close();
	}
}
