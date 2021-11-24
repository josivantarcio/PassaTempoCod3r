package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunaA = new double[3];
		
		notasAlunaA[0] = 6.5;
		notasAlunaA[1] = 10;
		notasAlunaA[2] = 9.5;
		
		String a  = Arrays.toString(notasAlunaA);
		
		System.out.println(a);
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunaA.length; i++) {
			totalAlunoA += notasAlunaA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunaA.length);
		
		
		double[] notasAlunaB = {6.5,6.0,9.5,7.5};
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunaB.length; i++) {
			System.out.print(notasAlunaB[i]+ " ");
			totalAlunoB += notasAlunaB[i];
		}
		System.out.println();
		System.out.println(totalAlunoB / notasAlunaB.length);
		
		System.out.println(notasAlunaA[notasAlunaA.length-1]);
		
		
	}
	
}
