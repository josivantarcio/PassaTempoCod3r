package streams;

import java.util.Arrays;
import java.util.List;

public class Filter{
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Rafael", 8);
		Aluno aluno2 = new Aluno("Karol", 8.5);
		Aluno aluno3 = new Aluno("Carla", 7);
		Aluno aluno4 = new Aluno("Antonia", 7.5);
		Aluno aluno5 = new Aluno("Thiago", 9.5);
		Aluno aluno6 = new Aluno("Andre", 6);

		List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

		alunos.stream()
			.filter(Mapeamento.nota)
			.map(Mapeamento.congratulation)
			.forEach(Mapeamento.print);
	}
}
