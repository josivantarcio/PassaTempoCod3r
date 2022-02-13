package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("aaaaaaaaaa", 9);
		Aluno a2 = new Aluno("bbbbbb", 10);
		Aluno a3 = new Aluno("ccccccccccc", 10);
		Aluno a4 = new Aluno("ddddddddd", 6);
		Aluno a5 = new Aluno("eeeeeee", 7.1);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Function<Aluno, Double> apenasNota = n -> n.getValue();
		
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota); 
		
		BinaryOperator<Media> combinarMedia = (cbm1, cbm2) -> Media.combinar(cbm1, cbm2);
		
		Media media = alunos.stream()
			.filter(Mapeamento.nota)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
			
		System.out.println(media.getValor());
		
		
	}
}
