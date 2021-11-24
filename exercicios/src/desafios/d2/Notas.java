package desafios.d2;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas: ");
		int qtd = scan.nextInt();
		double[] notas = new double[qtd];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota "+(i+1)+": ");
			notas[i] = scan.nextDouble();
		}
		
		double soma=0;
		for (double d : notas) {
			soma += d;
		}
		
		System.out.printf("A media foi %.2f", soma/notas.length);
		
		
		
		scan.close();

	}

}
