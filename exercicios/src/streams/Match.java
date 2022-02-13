package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {
		Aluno n1 = new Aluno("Paulo", 8.5);
		Aluno n2 = new Aluno("Ana", 7.5);
		Aluno n3 = new Aluno("Jose", 6.0);
		Aluno n4 = new Aluno("Ivo", 7.5);
		
		List<Aluno> alunos = Arrays.asList(n1,n2,n3,n4);
		
		Predicate<Aluno> aprovados = a -> a.getValue() > 7;
		Predicate<Aluno> reprovados = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));
		System.out.println(alunos.stream().anyMatch(aprovados));
		System.out.println(alunos.stream().noneMatch(reprovados));
	}
}
