package excecao;

import streams.Aluno;

public class Basico {
	public static void main(String[] args) {
		Aluno a = null;

		try {
			imprimirNomeDoAluno(a);
		} catch (Exception e1) {
			System.out.println("ERRO: Nome do Usuario está em branco || "+ e1.getMessage() );
		}

		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("ERRO: Numero nao pode ser divisivel por 0! "+ " || " + e.getMessage());
		}

		System.out.println("Fim");
	}

	public static void imprimirNomeDoAluno(Aluno aluno) {
			System.out.println(aluno.getName());
		}
}
