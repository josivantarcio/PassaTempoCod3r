package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Fred", 8.5);
		Aluno a2 = new Aluno("Ivo", 10);
		Aluno a3 = new Aluno("Jose", 10.0);
		Aluno a4 = new Aluno("Fred", 9.5);
		Aluno a5 = new Aluno("Carlos", 6.5);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Comparator<Aluno> nivelamento = (al1, al2) -> {
			if(al1.getValue() > al2.getValue()) return 1;
			if(al1.getValue() < al2.getValue()) return -1;
			return 0;
		};
		
		var maiorNota = alunos.stream()
				.max(nivelamento)
				.get();
		
		var menorNota = alunos.stream()
				.min(nivelamento)
				.get();
		
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
	}
}
