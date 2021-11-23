package fundamento;

import java.util.Scanner;

public class Condicionais {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double v1 = scan.nextDouble();
		
		System.out.print("Digite outro valor: ");
		double v2 = scan.nextDouble();
		
		System.out.print("Digite sinal de atribuicao: ");
		String sinal = scan.next();
		
		double add = v1 + v2;
		double sub = v1 - v2;
		double mult = v1 * v2;
		double div = v1 / v2;
		double rest = v1 % v2;
		
		System.out.println("O resultado é:" 
				+ (sinal.equals("+") ? add 
				: (sinal.equals("-") ? sub 
				: (sinal.equals("*") ? mult
				: (sinal.equals("/") ? div
				: (sinal.equals("%") ? rest 
				: 0))))));
			
		scan.close();
	}
}
