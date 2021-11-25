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
			for (int j = 0; j < turma[i].length; j++) {
				System.out.print("Digite a nota " + (j + 1) + ": ");
				turma[i][j] = scan.nextDouble();
			}
		}
		
		for(double[] notasDaTurma : turma) {
			System.out.println(Arrays.toString(notasDaTurma));
		}

		scan.close();

	}

}
