package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import lambdas.Predicado;

public class Others {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Francisco", 9);
		Aluno a2 = new Aluno("Ana", 10);
		Aluno a3 = new Aluno("Carlos", 7.5);
		Aluno a4 = new Aluno("Rita", 6);
		Aluno a5 = new Aluno("Karol", 6.5);
		Aluno a6 = new Aluno("Ana", 7.45);
		Aluno a7 = new Aluno("Paula", 8.0);
		Aluno a8 = new Aluno("Pedro", 7.5);
		Aluno a9 = new Aluno("Pedro", 7.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);
		
		Function<Aluno, String> notasDiferente = d -> d.getName();
				
		//Retirar os repetidos .distinct()
		alunos.stream()
			.map(notasDiferente)
			.distinct()
			.forEach(System.out::println);
		
		System.out.println();
		//selecionar a relação a partir de qual será iniciado e quantos após o inicio  .skip() .limit()
		alunos.stream()
			.skip(3)
			.limit(4)
			.forEach(System.out::println);
		
		System.out.println();
		//Apresenta todos as condições enquanto for verdadeira no predicado  .takeWhile()
		alunos.stream()
		.takeWhile(nota -> nota.getValue() > 7)
		.forEach(System.out::println);
	}
}
