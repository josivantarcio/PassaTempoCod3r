package excecao;

import streams.Aluno;

public class Basico {
	public static void main(String[] args) {
		Aluno a = null;
		
		try {
			imprimirNomeDoAluno(a);
		}catch (Exception e) {
			System.out.println("ERRO: Nome do Usuario está em branco");
		}
		
		try {
			System.out.println(7/0);
		} catch (Exception e) {
			System.out.println("Numero nao pode ser divisivel por 0!");
			
		}
		
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.getName());
	}
}
