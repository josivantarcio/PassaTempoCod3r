package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1,aluno2,aluno3;
		
		aluno1 = new Aluno("Holanda");
		aluno2 = new Aluno("Silva");
		aluno3 = new Aluno("Oliveira");
		
		Curso curso1 = new Curso("JAVA EE");
		Curso curso2 = new Curso("Matematica");
		Curso curso3 = new Curso("Logica Programação");
		
		aluno1.adicionarCurso(curso1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		for(Aluno a : curso1.alunos) {
			System.out.println(a);
		}
		System.out.println();
		for(Curso c : aluno1.cursos) {
			System.out.println(c);
		}
		
	}
}
