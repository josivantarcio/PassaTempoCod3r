package arrays;

import java.util.Arrays;

public class Exercicio2 {
	public static void main(String[] args) {
		double[] notasAlunaA = new double[3];

		notasAlunaA[0] = 8;
		notasAlunaA[1] = 10;
		notasAlunaA[2] = 9.5;

		String a = Arrays.toString(notasAlunaA);

		System.out.println(a);

		double totalAlunoA = 0;
		for (double somaNotas : notasAlunaA) {
			totalAlunoA += somaNotas;
		}

		System.out.println("Total: " + totalAlunoA / notasAlunaA.length);

		double[] notasAlunaB = { 9.0, 6.0, 9.5, 7.5 };
		double totalAlunoB = 0;
		for (double somaNotasB : notasAlunaB) {
			System.out.print(somaNotasB + " ");
			totalAlunoB += somaNotasB;
		}
		System.out.println();
		System.out.println(totalAlunoB / notasAlunaB.length);

		System.out.println(notasAlunaA[notasAlunaA.length - 1]);

	}

}
