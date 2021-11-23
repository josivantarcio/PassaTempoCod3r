package exercicios.conceitosBasicos;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um valor");
		String vl = scan.next().replace(",", "."); 
		double VL = Double.parseDouble(vl);
		
		System.out.printf("O valor ao: \nQuadrado: %.2f\nCubo: %.2f", Math.pow(VL,2), Math.pow(VL, 3));
		
		scan.close();
	}
}
