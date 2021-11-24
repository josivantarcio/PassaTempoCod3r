package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos: ");
		int qtdAlunos = scan.nextInt();
		
		System.out.println("Digite a quantidade de notas: ");
		int qtdNotas = scan.nextInt();

		double[][] turma = new double[qtdAlunos][qtdNotas];
		

		for (int i = 0; i < turma.length; i++) {
			System.out.print("Nome do Aluno: ");
			String nomeAluno = scan.next();
			for (int j = 0; j < turma[i].length; j++) {
				System.out.print("Digite a nota " + (j + 1) + " do Aluno " + nomeAluno + ": ");
				turma[i][j] = scan.nextDouble();
			}
		}

		for (int i = 0; i < turma.length; i++) {
			System.out.println(Arrays.toString(turma[i]));
			double somar = 0;
			for (int j = 0; j < turma[i].length; j++) {
				somar += turma[i][j];
			}
			System.out.println("Media: "+somar/turma[i].length);
		}
		
		

		scan.close();

	}

}
